public class Y_16_Sorting {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        // bubble sort
        // Bubble Sort is the simplest sorting algorithm that works by repeatedly
        // swapping the adjacent elements if they are in the wrong order.
        // This algorithm is not suitable for large data sets as its average and
        // // worst-case time complexity is quite high.
        int arr[] = { 7, 8, 3, 1, 2 };
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j+ 1]) {
        // // swap

        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;

        // }
        // }
        // }
        // for(int i =0; i<arr.length-1;i++){
        // int smallest = i;
        // for(int j=i+1; j<arr.length; j++){
        // if(arr[smallest]> arr[j]){
        // smallest = j;
        // }
        // }

        // int temp = arr[smallest];
        // arr[smallest]= arr[i];
        // arr[i]= temp;
        // }
        // printArray(arr);

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        printArray(arr);

    }
}
