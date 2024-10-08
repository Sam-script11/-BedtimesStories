package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStorie {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {

            System.out.print("1 - Goldilocks\n2 - Hansel and Gretel\n3 - Mary Had a Little Lamb\n Please select from the options: "); // formatting the stories and option to select
            int option = keyboard.nextInt();
            if(option ==1) {
                FileInputStream goldLocks = new FileInputStream("src/main/resources/goldilocks.txt");// created fileInputStream object to a specific file in " "
                // create a scanner to access the file to be read
                Scanner scanner = new Scanner(goldLocks);
                String input;

                int lineNumber = 1;
                // reading until there's  no more data(lines)
                while (scanner.hasNextLine()) {
                    // if the file has the next line, it will read it
                    input = scanner.nextLine();
                    System.out.println(lineNumber++ +" "+ input.trim());
                }
                scanner.close();
            } else if (option ==2){
                FileInputStream hanselAndGretel = new FileInputStream("src/main/resources/hansel_and_gretel.txt");

                Scanner scanner = new Scanner(hanselAndGretel);
                String input;
                int lineNumber = 1;
                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(lineNumber++ +" "+ input);

                }
                scanner.close();
            }
            else if( option==3){
                FileInputStream MaryLittleLamb = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
                Scanner scanner = new Scanner(MaryLittleLamb);
                String input;
                int lineNumber =1;
                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(lineNumber++ +" "+ input);
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