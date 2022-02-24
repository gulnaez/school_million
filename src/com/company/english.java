package com.company;
import java.util.*;
public class english {
    private ArrayList<Question>englishSet;
    public english() {
        englishSet = new ArrayList<Question>();
        String q = "Can we use the conference room? - Sure, it _____ this morning.";
        String[] a = {"ins't using", "isn't used", "isn't being used"};
        englishSet.add(new Question(q, a, "isn't being used"));

        q = "The judge had _____ in allowing the lawsuit to proceed.";
        // must reuse variable with new String[]
        // array constants can only be used during initialization
        a = new String[]{"astrayed", "erred", "biased"};
       englishSet.add(new Question(q, a, "erred"));

       q = "You are taking this very lightly, ______ your mother is dead serious.";
        a = new String[]{"whence", "as", "whereas"};
        englishSet.add(new Question(q, a, "whereas"));

        q = "He refused to admit _____ too strict with the children.";
        a = new String[]{"to having been", "had been", "he has been"};
        englishSet.add(new Question(q, a, "he has been"));

        q = "All the surviors have been ______ for.";
        a = new String[]{"dealt", "accounted", "found"};
        englishSet.add(new Question(q, a, "accounted"));

        q = "He must be forty or ______ .";
        a = new String[]{"therein", "thereafter", "therabouts"};
        englishSet.add(new Question(q, a, "thereabouts"));

        q = "I asked Jane about the accident, but she _____ a word.";
        a = new String[]{"didn't use to", "wouldn't say","refused"};
        englishSet.add(new Question(q, a, "wouldn't say"));

        q = "Increasing currency ______ is making exchange rates more volatile.";
        a = new String[]{"intervention", "speculation","laundering"};
        englishSet.add(new Question(q, a, "speculation"));

        q = "She’s lost her credit card. She _______ it somewhere.";
        a = new String[]{"must have been dropping", "should have dropped","must have dropped"};
        englishSet.add(new Question(q, a, "must have been dropping"));

        q = "Everyone wanted to hear the president's ______ address.";
        a = new String[]{"inaudible", "inbound","inaugural"};
        englishSet.add(new Question(q, a, "inaugural"));





        Collections.shuffle(englishSet, new Random());
    }
    public void startquiz() {
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        // show questions from questionSet
        for (int question = 0; question < englishSet.size(); question++) {
            System.out.println(englishSet.get(question).getQuestion());
            int numChoices = englishSet.get(question).getChoices().size();
            // show choices from questions in questionSet
            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + ": " +
                        englishSet.get(question).getChoices().get(choice));
            }
            int playerAnswer = scan.nextInt();
            ArrayList<String> choiceSet =
                  englishSet.get(question).getChoices();
            String correctAnswer = englishSet.get(question).getAnswer();
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