//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Question1
        int[] arr = {12, 7, 5, 19, 7, 3, 15, 7, 10, 7};
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum " + sum);
        System.out.println("Average " + (double) sum / arr.length);


        //Question2
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);


        //Question3
        for (int i = 0; i < arr.length / 2; i++) {
            int revPos = arr.length - 1 - i;
            int temp = arr[revPos];
            arr[revPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Reversed array: " + java.util.Arrays.toString(arr));


        //Question4
        int num=7;
        int count = 0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==num){
                count++;
            }
        }
        System.out.println("Number " + num + " appears " + count + " times in the array.");



        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };




    }
}



/*
1) Take N integers from the user, store them in an array, and find the sum and average.
2) Find the largest and smallest element in an array.
3) Reverse the elements of an array without using built-in reverse functions.
4) Count how many times a given element appears in an array.
5) Add two 3×3 matrices and display the sum in 2D matrix form.
Find the transpose of a matrix and display it in 2D matrix form.
Rotate a 3×3 matrix by 90 degrees clockwise and display the result in 2D matrix form.

 */