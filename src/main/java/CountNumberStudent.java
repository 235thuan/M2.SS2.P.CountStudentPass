import java.util.Scanner;

public class CountNumberStudent {
    public static void main(String[] args) {
        int size;
        int[] array;
        int count = 0;
        int index=0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        array = new int[size];

        while (i < array.length) {
            do {
                System.out.println("Enter a mark for student " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                if (array[i] > 10)
                    System.out.println("Mark should not exceed 10");
            }
            while(array[i]>10);
                i++;
        }

        System.out.println("List of mark: ");
        System.out.printf("%-10s%s","Student","Mark");
        for (int j:array) {
            index++;
            System.out.printf("\n%-10s%s",index,j );
            if (j >= 5 && j <= 10)
                count++;
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
