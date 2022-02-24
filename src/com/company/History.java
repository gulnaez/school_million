package com.company;
import java.util.*;
public class History {
    private ArrayList<Question> historySet;
    public History() {
        historySet = new ArrayList<Question>();
        String q = "Where is the Republic of Kazakhstan located?";
        String[] a = {"Central Asia", "South Asia", "Far East"};
        historySet.add(new Question(q, a, "Central Asia"));
        q = "When did Kazakhstan became independent?";
        // must reuse variable with new String[]
        // array constants can only be used during initialization
        a = new String[]{"1986", "1970", "1991"};
        historySet.add(new Question(q, a, "1991"));

        q = "What is the capital of Kazakhstan?";
        a = new String[]{"Almaty", "Chimkent", "Astana (Nur-Sultan)"};
        historySet.add(new Question(q, a, "Astana (Nur-Sultan)"));

        q = "What is the traditional dwelling of Kazakh nomads?";
        a = new String[]{"Tent", "Vig vam", "Yurt"};
        historySet.add(new Question(q, a, "Yurt"));

        q = "Author of the historical work Jami at-taurih?";
        a = new String[]{"Rashid ad-din", "Muhammad Haidar Dughlat ", "Kadyrgali Jalairi"};
        historySet.add(new Question(q, a, "Rashid ad-din"));

        q = "The worship of some kind of tribe to an animal or plant as its mythical ancestor is called? ";
        a = new String[]{"Totemism ", "Tengrism  ", "Magic "};
        historySet.add(new Question(q, a, "Totemism"));

        q = "What era do the traces of the first person found on the territory of Kazakhstan belong to?";
        a = new String[]{"Middle Stone Age", "Ancient stone age", "Iron age"};
        historySet.add(new Question(q, a, "Ancient stone age"));

        q = "What changes took place in the economy of Kazakhstan during the Bronze Age?";
        a = new String[]{"City Growth", "The beginning of nomadic pastoralism", "Agriculture developed"};
        historySet.add(new Question(q, a, "The beginning of nomadic pastoralism"));

        q = "What economy did the Andronovites have??";
        a = new String[]{"Agriculture", "Cattle breeding and agriculture", "Fishing"};
        historySet.add(new Question(q, a, "Cattle breeding and agriculture"));

        q = "What were the names of the first tribal associations on the territory of Kazakhstan?";
        a = new String[]{"Kangly", "Turks", "Saka"};
        historySet.add(new Question(q, a, "Saka"));

        Collections.shuffle(historySet, new Random());
    }
    public void startquiz() {
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        // show questions from questionSet
        for (int question = 0; question < historySet.size(); question++) {
            System.out.println(historySet.get(question).getQuestion());
            int numChoices = historySet.get(question).getChoices().size();
            // show choices from questions in questionSet
            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + ": " +
                        historySet.get(question).getChoices().get(choice));
            }
            int playerAnswer = scan.nextInt();
            ArrayList<String> choiceSet =
                    historySet.get(question).getChoices();
            String correctAnswer = historySet.get(question).getAnswer();
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