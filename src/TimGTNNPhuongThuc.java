public class TimGTNNPhuongThuc {
    public static void main(String[] args) {
        int []arr = {4, 13, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest value is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int min = array[0], index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                index = i;
            }
        }
        return index;
    }
}
