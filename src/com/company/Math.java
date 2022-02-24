package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Math {
    private ArrayList<Question> mathSet;
    public Math() {
        mathSet = new ArrayList<Question>();
        String q = "Subtract 573.9246 - 215.6:";
        String[] a = {"320.1046", "125.3246", "358.3246"};
        mathSet.add(new Question(q, a, "358.3246"));
        q = "Calculate 2 × 0 × 0 × 8 x 12 =";
        // must reuse variable with new String[]
        // array constants can only be used during initialization
        a = new String[]{"5", "0", "3"};
        mathSet.add(new Question(q, a, "0"));
        q = "Express 11/5 in decimal form:";
        a = new String[]{"5.5", "2.2", "8.2"};
        mathSet.add(new Question(q, a, "2.2"));
        q = "The sum of the angles of a triangle is";
        a = new String[]{"180 degree", "240 degree", "360 degree"};
        mathSet.add(new Question(q, a, "180 degree"));
        q = "Divide 0.4096 ÷ 0.032:";
        a = new String[]{"12.8", "15.3", "10.1"};
        mathSet.add(new Question(q, a, "12.8"));
        q = "What fraction should be added with -4/9 to get 6/17 ?";
        a = new String[]{"104/163", "136/151", "122/153"};
        mathSet.add(new Question(q, a, "122/153"));
        q = "Find for which value of x is the following equation true ? 44x-7  = 4x - 1";
        a = new String[]{"2", "3", "4"};
        mathSet.add(new Question(q, a, "2"));
        q = "Express 412 x 10-9 in standard form.";
        a = new String[]{"0.000000412", "412000000", "4120000"};
        mathSet.add(new Question(q, a, "0.000000412"));
        q = "Find the value of 5x - 6y - 8z, if x = 2, y = 3 and z = -2.";
        a = new String[]{"5", "8", "-18"};
        mathSet.add(new Question(q, a, "2.2"));
        q = "A number is 7 times greater than another number. If their sum is 96, find the numbers.";
        a = new String[]{"49, 51", "84, 12", "21, 75"};
        mathSet.add(new Question(q, a, "84, 12"));
        Collections.shuffle(mathSet, new Random());
    }

    public void startquiz() {
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        // show questions from questionSet
        for (int question = 0; question < mathSet.size(); question++) {
            System.out.println(mathSet.get(question).getQuestion());
            int numChoices = mathSet.get(question).getChoices().size();
            // show choices from questions in questionSet
            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + ": " +
                        mathSet.get(question).getChoices().get(choice));
            }
            int playerAnswer = scan.nextInt();
            ArrayList<String> choiceSet =
                    mathSet.get(question).getChoices();
            String correctAnswer = mathSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (playerAnswer>=4) {
                System.out.println("Error!");
            }
            if (playerAnswer == correctAnswerIndex + 1) {
                numCorrect++;
            }
        }
        scan.close();
        System.out.println("You got " + numCorrect + " correct answer(s)");
    }
}

