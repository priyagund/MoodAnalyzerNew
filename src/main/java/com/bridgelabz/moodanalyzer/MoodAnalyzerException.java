package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerException extends Exception {
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY, NO_SUCH_FIELD, NO_SUCH_METHOD, NO_SUCH_CLASS,
        OBJECT_CREATION_ISSUE, METHOD_INVOCATION_ISSUE, FIELD_SETTING_ISSUE;
    }

    Exception type;
    String message;

    public MoodAnalyzerException(ExceptionType enteredEmpty, String message) {
        super(message);

    }

    public MoodAnalyzerException(Exception type, Throwable cause) {
        super(cause);
        this.type = type;
    }

    public MoodAnalyzerException(Exception type, String message, Throwable cause) {
        super(message, cause);
        this.type = type;

    }
}
