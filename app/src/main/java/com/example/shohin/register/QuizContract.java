package com.example.shohin.register;

import android.provider.BaseColumns;

public class QuizContract {
    private QuizContract() {
    } //empty private constructor to ensure no object or subclass is created here.

    public static class QuestionTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions"; //public allows access from outside the class, static allows for access without instance, final meaning no changes will be made to them
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_ANSWER_NUMBER = "answer_number";
    }
}
