import java.util.Scanner;


public class Task1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter starting number: ");
        int start = sc.nextInt();


        System.out.print("Enter ending number: ");
        int end = sc.nextInt();


        if (start > end) {
            int t = start;
            start = end;
            end = t;
        }


        System.out.println("\nEven numbers using while loop:");
        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }




        System.out.println("\n\nEven numbers using do-while loop:");
        i = start;
        if (start <= end) {
            do {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= end);
        }
        System.out.println("\n\nEven numbers stored in an array:");
        int count = 0;
        for (int j = start; j <= end; j++) {
            if (j % 2 == 0) count++;
        }


        if (count == 0) {
            System.out.print("No even numbers in the given range.");
        } else {
            int[] evens = new int[count];
            int idx = 0;
            for (int j = start; j <= end; j++) {
                if (j % 2 == 0) {
                    evens[idx++] = j;
                }
            }
            for (int val : evens) {
                System.out.print(val + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
