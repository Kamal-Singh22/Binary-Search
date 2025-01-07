public class BinarySearch {
    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (array[mid] == target) {
                return mid;
            }
            // If the target is smaller, ignore the right half
            else if (array[mid] > target) {
                right = mid - 1;
            }
            // If the target is larger, ignore the left half
            else {
                left = mid + 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
