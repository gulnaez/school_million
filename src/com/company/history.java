package com.company;

public class history {

    private String question;
    private String variant_1;
    private String variant_2;
    private String variant_3;

    private int correctAnswer;

    public history(String question, String variant_1, String variant_2, String variant_3, int correctAnswer) {
        this.question = question;
        this.variant_1 = variant_1;
        this.variant_2 = variant_2;
        this.variant_3 = variant_3;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getVariant_1() {
        return variant_1;
    }

    public void setVariant_1(String variant_1) {
        this.variant_1 = variant_1;
    }

    public String getVariant_2() {
        return variant_2;
    }

    public void setVariant_2(String variant_2) {
        this.variant_2 = variant_2;
    }

    public String getVariant_3() {
        return variant_3;
    }

    public void setVariant_3(String variant_3) {
        this.variant_3 = variant_3;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
