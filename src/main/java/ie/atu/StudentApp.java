package ie.atu;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); // consume leftover newline before nextLine() calls
        int i = 0;
        while (i < count) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            names.add(name);
            System.out.print("Enter student email: ");
            String email = sc.nextLine();
            names.add(email);
            System.out.print("Enter student course: ");
            String course = sc.nextLine();
            names.add(course);


            i++;
        }


    }
}
