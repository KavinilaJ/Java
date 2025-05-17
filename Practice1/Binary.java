
package Practice1;


public class Binary {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearch(arr, target);
        System.out.println("Element found at index: " + result);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left +right )/ 2; // Fix 1
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1; // Fix 2
            } else {
                right = mid - 1; // Fix 3
            }
        }
        return -1;
    }
}




