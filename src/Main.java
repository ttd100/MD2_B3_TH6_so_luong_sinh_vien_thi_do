import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        do {
            System.out.println("Enter the number of elements in the array: ");
            size = scanner.nextInt();
            if (size > 30) System.out.println("Size should not exceed 30");
        } while (size > 30);

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }

        System.out.println("\nThe number of students passed the exam is " + count + " students.");
    }
}