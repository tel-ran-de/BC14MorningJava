package day33;

public class ArrayMethods {
    public static void main(String[] args) {
        // crud  - https://ru.wikipedia.org/wiki/CRUD
        int[] arr = createRandomArray(10);
        printArray(arr);
        int[] arr2 = addElement(arr, 0, 5);
        printArray(arr2);
        int[] arr3 = addElement(arr2, 5, 120);
        printArray(arr3);
        int[] arr4 = deleteElement(arr3, 6);
        printArray(arr4);
    }

    private static int[] deleteElement(int[] arr, int index) {
        int[] output = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            output[i - 1] = arr[i];
        }
        return output;
    }

    private static int[] addElement(int[] arr, int index, int element) {
        if (index >= arr.length) {
            return arr;
        }
        int[] output = new int[arr.length + 1];
        output[index] = element;
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index + 1; i < output.length; i++) {
            output[i] = arr[i - 1];
        }
        return output;
    }

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    private static int[] createRandomArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
