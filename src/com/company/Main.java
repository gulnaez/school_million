package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //math questions
        ArrayList<quiz> quizmill = new ArrayList<>();



        //history questions
        ArrayList<history> historyQuestions = new ArrayList<>();

        historyQuestions.add(new history("Where is the Republic of Kazakhstan located?",
                "1) Central Asia",
                "2) South Asia",
                "3) Far East",
                1));

        historyQuestions.add(new history("When did Kazakhstan became independent?",
                "1) 1986",
                "2) 1970",
                "3) 1991",
                3));

        historyQuestions.add(new history("What is the capital of Kazakhstan?",
                "1) Almaty",
                "2) Almaty",
                "3) Astana (Nur-Sultan)",
                3));

        historyQuestions.add(new history("What is the traditional dwelling of Kazakh nomads?",
                "1) Igloo",
                "2) Yurt",
                "3) Vig vam",
                2));

        historyQuestions.add(new history("Author of the historical work Jami at-taurih?",
                "1) Rashid ad-din",
                "2) Muhammad Haidar Dughlat ",
                "3) Kadyrgali Jalairi",
                1));

        historyQuestions.add(new history("The worship of some kind of tribe to an animal or plant as its mythical ancestor is called?",
                "1) Totemism",
                "2) Tengrism",
                "3) Magic",
                1));

        historyQuestions.add(new history("What era do the traces of the first person found on the territory of Kazakhstan belong to?",
                "1) Middle Stone Age",
                "2) Ancient stone age",
                "3) Iron age",
                2));

        historyQuestions.add(new history("What changes took place in the economy of Kazakhstan during the Bronze Age?",
                "1) City Growth",
                "2) The beginning of nomadic pastoralism",
                "3) Agriculture developed",
                2));

        historyQuestions.add(new history("What economy did the Andronovites have?",
                "1) Agriculture",
                "2) Cattle breeding and agriculture",
                "3) Fishing",
                2));

        historyQuestions.add(new history("What were the names of the first tribal associations on the territory of Kazakhstan?",
                "1) Kangly",
                "2) Turks",
                "3) Saka",
                3));

        historyQuestions.add(new history("What style do the objects found in the Saka burial mounds belong to?",
                "1) Chinese style",
                "2) Bird style",
                "3) Animal style",
                3));

        historyQuestions.add(new history("Which of the Persian kings did the Saks defeat?",
                "1) Polyaenus",
                "2) Darius",
                "3) Cyrus",
                3));

        historyQuestions.add(new history("The year the Dzungars invaded Kazakhstan:",
                "1) In 1724",
                "2) In 1723",
                "3) In 1725",
                2));

        historyQuestions.add(new history("A scientist who studied the shores of the Caspian Sea in the first half of the XIX century",
                "1) P. Velichko",
                "2) N.Severtsev",
                "3) G.Karelin",
                3));

        historyQuestions.add(new history("Place of death of Sh. Walikhanov:",
                "1) Syrymbet mountain",
                "2) Karkaraly mountain",
                "3) Golden Emel ridge",
                3));

        historyQuestions.add(new history("In 1836 the city opened a boarding school for Kazakhs",
                "1) Semey",
                "2) Ust-Kamenogorsk",
                "3) Uralsk ",
                2));

        historyQuestions.add(new history("The years of Makhambet Utemisov's life",
                "1) 1804-1846",
                "2) 1822-1895",
                "3) 1825-1898",
                1));

        historyQuestions.add(new history("The total number of Kazakhstani guerrillas during the Great Patriotic War",
                "1) 5 thousand people",
                "2) 3,5 thousand people",
                "3) 3 thousand people",
                2));

        historyQuestions.add(new history("A fortress built in 1735 along the river in northern Kazakhstan",
                "1) Ust-Kamenogorsk",
                "2) Or",
                "3) Zhelezinks",
                2));

        historyQuestions.add(new history("The period when stone and copper tools were used at the same time",
                "1) Bronze age",
                "2) Mesolithic",
                "3) Eneolithic",
                3));

    }
}
