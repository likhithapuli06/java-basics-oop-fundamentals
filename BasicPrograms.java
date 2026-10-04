public class BasicPrograms {

    public static void run() {

        // Conditions
        int marks = 85;

        if (marks >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // Loop
        System.out.println("\nNumbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Array
        int[] marksArray = {85, 78, 92, 67, 88};

        int total = 0;

        for (int mark : marksArray) {
            total += mark;
        }

        double average = (double) total / marksArray.length;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}