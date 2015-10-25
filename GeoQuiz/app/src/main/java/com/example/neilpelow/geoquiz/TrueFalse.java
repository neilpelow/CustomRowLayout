package com.example.neilpelow.geoquiz;

/**
 * Created by neilpelow on 25/10/2015.
 */
public class TrueFalse {
    private int mQuestion;//Var to hold resource ID of a string resource.

    private boolean mTrueQuestion;//States whether the statement is true or not.

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;

    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
