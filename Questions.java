package com.example.mathsquiz;

import java.util.Random;

public class Questions {
    private int firstnumber;
    private int secondnumber;
    private int answer;
    private int [] answerarray;
    private int answerposition;
    private int upperLimit;
    private String questionphrase;
    public Questions(int upperLimit){
        this.upperLimit=upperLimit;
        Random randomNumberMaker=new Random();
        this.firstnumber=randomNumberMaker.nextInt(upperLimit);
        this.secondnumber=randomNumberMaker.nextInt(upperLimit);
        this.answer=this.firstnumber+this.secondnumber;
        this.questionphrase=firstnumber+"+"+secondnumber+"=";
        this.answerposition=randomNumberMaker.nextInt(4);
        this.answerarray=new int[] {0,1,2,3};
        this.answerarray[0]=answer+1;
        this.answerarray[1]=answer+10;
        this.answerarray[2]=answer-5;
        this.answerarray[3]=answer-2;
        this.answerarray=shuffleArray(this.answerarray);
        answerarray[answerposition]=answer;
    }
    private int [] shuffleArray(int[] array){
        int index,temp;
        Random randomNumberGenerator=new Random();
        for(int i=array.length-1;i>0;i--){
            index=randomNumberGenerator.nextInt(i+1);
            temp=array[index];
            array[index]=array[i];
            array[i]=temp;
        }
        return array;
    }

    public int getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(int firstnumber) {
        this.firstnumber = firstnumber;
    }

    public int getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(int secondnumber) {
        this.secondnumber = secondnumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int[] getAnswerarray() {
        return answerarray;
    }

    public void setAnswerarray(int[] answerarray) {
        this.answerarray = answerarray;
    }

    public int getAnswerposition() {
        return answerposition;
    }

    public void setAnswerposition(int answerposition) {
        this.answerposition = answerposition;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getQuestionphrase() {
        return questionphrase;
    }

    public void setQuestionphrase(String questionphrase) {
        this.questionphrase = questionphrase;
    }
}
