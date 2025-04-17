package com.sachin108.quizziz.dto;

import lombok.Data;

@Data
public class QuestionForm {
    private String text;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int correctOption;
}
