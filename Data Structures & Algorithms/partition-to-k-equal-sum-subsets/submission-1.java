
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum % k != 0) {
            return false;
        }

        int req = sum / k;

        boolean[] arr = new boolean[nums.length];

        return func(nums, k, 0, 0, 0, req, arr);
    }

    public boolean func(int[] nums, int k, int idx,
                        int sum, int count, int req,
                        boolean[] arr) {

        if (count == k - 1) {
            return true;
        }

        if (sum == req) {
            return func(nums, k, 0, 0,
                        count + 1, req, arr);
        }

        for (int i = idx; i < nums.length; i++) {
            if (arr[i] || sum + nums[i] > req) {
                continue;
            }

            arr[i] = true;

            if (func(nums, k, i + 1,
                     sum + nums[i], count, req, arr)) {
                return true;
            }

            arr[i] = false;
        }

        return false;
    }
}
