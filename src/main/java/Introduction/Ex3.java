package Introduction;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();

        if (i % 2 != 0 || (6 <= i && i <= 20)) {
            System.out.println("Weird");
        } else {
            if (2 <= i && i <= 5) {
                System.out.println("Not Weird");
            } else if (20 < i && i%2 == 0) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }
    }
}
