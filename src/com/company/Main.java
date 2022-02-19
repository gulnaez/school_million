package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<quiz> quizmill = new ArrayList<>();

        String question;
        String variant_1;
        String variant_2;
        String variant_3;
        int correctAnswer;

        quizmill.add(new quiz());

        Collections.shuffle(quizmill);

        Scanner scanner = new Scanner(System.in);

        double student_1 = 0, student_2 = 0;

        for (int i=0; i<2; i++) {

            System.out.println("\nStudent #" + (i+1));
            System.out.println();

            double total=0;

            for (int j=0; j<quizmill.size(); j++) {

                System.out.println(quizmill.get(j).getQuestion()+"\n\n"+quizmill.get(j).getVariant_1()+"\n"+quizmill.get(j).getVariant_2()+"\n"+quizmill.get(j).getVariant_3());

                System.out.println("\nYour answer: ");

                int answer = scanner.nextInt();

                if (quizmill.get(j).getCorrectAnswer() == answer) {
                    System.out.println("Correct!");
                    total+=1;
                } else {

                    switch (quizmill.get(j).getCorrectAnswer()) {

                        case 1:
                            System.out.println("Wrong! Correct answer: " + quizmill.get(j).getVariant_1());
                            break;

                        case 2:
                            System.out.println("Wrong! Correct answer: " + quizmill.get(j).getVariant_2());
                            break;

                        case 3:
                            System.out.println("Wrong! Correct answer: " + quizmill.get(j).getVariant_3());
                            break;

                        default:
                    };
                }

                if (i==0) {
                    student_1 = total;
                } else if (i==1) {
                    student_2 = total;
                }
            }
        }

        System.out.println();

        System.out.println("Student #1's total points: "+student_1 + "\nPlayer #2's total points: "+student_2);

        if (student_1 > student_2) {
            System.out.println("Student #1 won.");
        } else if (student_2 > student_1) {
            System.out.println("Student #2 won.");
        } else {
            System.out.println("Student #1 and Student #2 have the same points.");
        }

    }
}
