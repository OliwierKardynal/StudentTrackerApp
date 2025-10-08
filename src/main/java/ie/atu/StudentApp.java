package ie.atu;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");

        System.out.println("First name is " + names.get(1));
    }
}
