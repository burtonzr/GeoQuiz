package com.example.geoquiz;

public class Question {
    private int mTextResID; // member (instance) variable of class Question
    private boolean mAnswerTrue; // member (instance) variable of class Question

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResID, boolean answerTrue) {
        mTextResID = textResID;
        mAnswerTrue = answerTrue;
    }
}
