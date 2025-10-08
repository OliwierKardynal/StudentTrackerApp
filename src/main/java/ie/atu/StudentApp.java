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
            // TODO: prompt for name, email, course using sc.nextLine()
            // TODO: create a Student using one of your constructors
            // TODO: add the new Student to students
            i++;
        }


    }
}
