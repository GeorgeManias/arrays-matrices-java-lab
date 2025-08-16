//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        secondLargest();
    }

        public static void secondLargest() {
        int[] arr = {12, 5, 7, 3, 9, 15, 1};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2 && num != max) {
                max2 = num;
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second largest value exists.");
        } else {
            System.out.println("Largest: " + max);
            System.out.println("Second Largest: " + max2);
        }
    }


    public static void studentGrades() {
        int[][] grades = {
                {85, 90, 50, 90},
                {50, 40, 98, 67},
                {99, 100, 25, 30},
                {88, 58, 45, 48}
        };

        // Print all the array
        for (int i = 0; i < grades.length; i++) {
            System.out.println();
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + ",");
            }
        }
        System.out.println();

        //Print the avg for each student
        System.out.println();
        for (int i = 0; i < grades.length; i++) {
            float gradeAvg = 0f;
            float gradeSum = 0f;
            for (int j = 0; j < grades[i].length; j++) {
                gradeSum += grades[i][j];
            }
            gradeAvg = gradeSum / grades[i].length;
            System.out.println(gradeAvg);
        }


        //Print the avg for each Subject
        System.out.println();
        for (int j = 0; j < grades.length; j++) {
            float lessonAvg = 0f;
            float lessonSum = 0f;
            for (int i = 0; i < grades.length; i++) {
                lessonSum += grades[i][j];
            }
            lessonAvg = lessonSum / grades[j].length;
            System.out.println(lessonAvg);
        }

        //Print the max of all grades
        System.out.println();
        int maxGrade = grades[0][0];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] > maxGrade) {
                    maxGrade = grades[i][j];
                }
            }
        }
        System.out.println(maxGrade);
        System.out.println();

        //Diagonal Sum Calculation
        if (grades.length == grades[0].length) {
            int diagonalSum = 0;
            for (int i = 0; i < grades.length; i++) {
                diagonalSum += grades[i][i];
            }
            System.out.println(diagonalSum);
        } else {
            System.out.println("Is not diagonal");
        }

    }

    public static void findPairsWithTargetSum() {
        int[] array = {12, 5, 7, 3, 9, 15, 1, 20, 4, 8, 6, 11, 2, 14, 10, 13, 19, 17, 18, 16};
        int target = 17;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + ", " + array[j]);
                }
            }
        }
    }


}