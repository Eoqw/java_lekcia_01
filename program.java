package java_lekcia_01;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s \n", name);
        iScanner.close();
        // boolean f  = true & false; 
        // System.out.println(f);

        // boolean f  = true ^ true; 
        // System.out.println(f); 

        

    }
}

