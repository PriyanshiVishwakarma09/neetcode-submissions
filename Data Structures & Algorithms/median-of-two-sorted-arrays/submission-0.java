class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n2 = nums2.length;
        if (n > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int small = 0;
        int large = n;
        int sum = (n + n2 + 1) / 2;

        while (small <= large) {
            int mid = small + (large - small) / 2;
            int mid2 = sum - mid;

            int a = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1];
            int c = (mid == n) ? Integer.MAX_VALUE : nums1[mid];
            int b = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int d = (mid2 == n2) ? Integer.MAX_VALUE : nums2[mid2];
            if (a <= d && b <= c) {
                if ((n + n2) % 2 == 0) {
                    return ((double) Math.max(a, b)
                            + Math.min(c, d)) / 2;
                } else {
                    return Math.max(a, b);
                }
            } else if (a > d) {
                large = mid - 1;
            } else {
                small = mid + 1;
            }
        }

        return 0;
    }
}