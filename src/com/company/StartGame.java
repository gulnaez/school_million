package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartGame {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("Welcome to quiz game!");
            System.out.println("Select option:");
            System.out.println("1. History");
            System.out.println("2. Math");
            System.out.println("3. English");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-3): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    Game g = new Game();
                    g.startquiz();
                } else if (option == 2) {
//                    Game g = new Game();
//                    g.startquiz();
                } else if (option == 3) {
//                    Game g = new Game();
//                    g.startquiz();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine(); // to ignore incorrect input
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("*******************************");
            System.exit(0);
        }
    }
}