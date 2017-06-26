package com.doomedforfailure.pomodoro.Model;

/**
 * Created by aaroncampbell on 6/22/17.
 */
public enum AttemptKind {
    FOCUS(25 * 60, "Break time in:"),
    BREAK(5 * 60, "Back to work in:");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
