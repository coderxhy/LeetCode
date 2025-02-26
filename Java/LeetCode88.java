package Java;

public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int index = 0;
        int left1 = 0, left2 = 0;

        while (left1 < m && left2 < n) {
            if (nums1[left1] <= nums2[left2]) {
                arr[index++] = nums1[left1++];
            } else {
                arr[index++] = nums2[left2++];
            }
        }

        while (left1 < m) {
            arr[index++] = nums1[left1++];
        }

        while (left2 < n) {
            arr[index++] = nums2[left2++];
        }

        System.arraycopy(arr, 0, nums1, 0, m + n);
    }
}