package com.company;
import java.util.*;
public class english {
    private ArrayList<Question> questionSet;
    public english() {
        questionSet = new ArrayList<Question>();
        String q = "Can we use the conference room? - Sure, it _____ this morning.";
        String[] a = {"ins't using", "isn't used", "isn't being used", "hasn't used"};
        questionSet.add(new Question(q, a, "isn't being used"));
        q = "The judge had _____ in allowing the lawsuit to proceed.";
        // must reuse variable with new String[]
        // array constants can only be used during initialization
        a = new String[]{"astrayed", "erred", "biased",
                "drifted"};
        questionSet.add(new Question(q, a, "erred"));
        q = "You are taking this very lightly, ______ your mother is dead serious.";
        a = new String[]{"whence", "since", "as", "whereas"};
        questionSet.add(new Question(q, a, "whereas"));
        Collections.shuffle(questionSet, new Random());
    }
    public void startquiz() {
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        // show questions from questionSet
        for (int question = 0; question < questionSet.size(); question++) {
            System.out.println(questionSet.get(question).getQuestion());
            int numChoices = questionSet.get(question).getChoices().size();
            // show choices from questions in questionSet
            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + ": " +
                        questionSet.get(question).getChoices().get(choice));
            }
            int playerAnswer = scan.nextInt();
            ArrayList<String> choiceSet =
                    questionSet.get(question).getChoices();
            String correctAnswer = questionSet.get(question).getAnswer();
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