public class bai3 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 8, 15};
        int target = 8;

        int firstposition = findFirstPosition(arr, target);
        int lastposition = findLastPosition(arr, target);

        if (firstposition != -1 && lastposition != -1) {
            System.out.println("Vị trí đầu tiên của số " + target + " là: " + firstposition);
            System.out.println("Vị trí cuối cùng của số " + target + " là: " + lastposition);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng");
        }
    }

    public static int findFirstPosition(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int first = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                first = mid;
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return first;
    }

    public static int findLastPosition(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int last = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                last = mid;
                l = mid + 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return last;
    }
}
