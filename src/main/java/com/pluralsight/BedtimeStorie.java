package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStorie {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {

            System.out.print("Please enter:\n1 - Goldilocks\n2 - Hansel and Gretel\n3 - Mary Had a Little Lamb ");
            int option = keyboard.nextInt();
            if(option ==1) {
                FileInputStream fis = new FileInputStream("src/main/resources/goldilocks.txt");

                Scanner scanner = new Scanner(fis);
                String input;

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();
            } else if (option ==2){
                FileInputStream fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");

                Scanner scanner = new Scanner(fis);
                String input;

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();
            }
            else if( option==3){
                FileInputStream fis = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
                Scanner scanner = new Scanner(fis);
                String input;

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();

            }
            else{
                System.out.println("Invalid option");
            }


        } catch(IOException e){
            e.printStackTrace();
    }

    }
}