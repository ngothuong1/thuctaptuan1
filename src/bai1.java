import java.util.ArrayList;
import java.util.List;

public class bai1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 5, 6, 7};

        List<Integer> intersection = findIntersection(arr1, arr2);

        System.out.println("Giao của hai mảng là:" + intersection);
    }
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            if (binarySearch(arr2, num)) {
                intersection.add(num);
            }
        }
        return intersection;
    }
    private static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
