/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node func(HashMap<Node , Node> map , Node node){
        if(node == null){
            return null ;
        }
        Node newNode = new Node(node.val);
        map.put(node , newNode);
        for(Node x : node.neighbors){
            if(!map.containsKey(x)){
                newNode.neighbors.add(func(map ,x));
            }
            else{
                newNode.neighbors.add(map.get(x));
            }
        }
        return newNode ;
    }
    public Node cloneGraph(Node node) {
        HashMap<Node , Node> map = new HashMap<>();
        return func(map , node);
    }
}