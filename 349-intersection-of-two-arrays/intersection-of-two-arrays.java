class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) { //find common element
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }

            boolean alreadyPresent = false;

            for (int j = 0; j < k; j++) {
                if (result[j] == nums1[i]) {
                    alreadyPresent = true;
                    break;
                }
            }

            if (found && !alreadyPresent) {
                result[k] = nums1[i];
                k++;
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = result[i];
        }

        return ans;
    }
}