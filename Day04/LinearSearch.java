public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 9, 2};
        int key = 7;
        int result = linearSearch(arr, key);
        System.out.println(result == -1 ? "Not found" : "Found at index " + result);
    }
}

