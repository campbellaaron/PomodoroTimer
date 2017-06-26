package com.doomedforfailure.pomodoro.Model;

/**
 * Created by aaroncampbell on 6/22/17.
 */
public class Attempt {

    private AttemptKind mKind;
    private String mMessage;
    private int mRemainingSeconds;

    public Attempt(AttemptKind kind, String message) {
        mKind = kind;
        mMessage = message;
        mRemainingSeconds = kind.getTotalSeconds();
    }

    public AttemptKind getKind() {
        return mKind;
    }

    public String getMessage() {
        return mMessage;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public void tick() {
        mRemainingSeconds--;
    }

    public void save() {
        System.out.printf("Saving: %s %n", this);
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "mKind=" + mKind +
                ", mMessage='" + mMessage + '\'' +
                ", mRemainingSeconds=" + mRemainingSeconds +
                '}';
    }
}
