package com.sivarmunchies.geoquiz.geoquiz;

/**
 * Created by ERIK on 5/7/2015.
 */
public class TrueFalse {
    private int mQuestions;

    private boolean mTrueQuestions;

    public TrueFalse(int questions, boolean trueQuestions)
    {
        mQuestions= questions;
        mTrueQuestions= trueQuestions;
    }

    public int getQuestions() {
        return mQuestions;
    }

    public void setQuestions(int questions) {
        mQuestions = questions;
    }

    public boolean isTrueQuestions() {
        return mTrueQuestions;
    }

    public void setTrueQuestions(boolean trueQuestions) {
        mTrueQuestions = trueQuestions;
        //hello
    }
}
