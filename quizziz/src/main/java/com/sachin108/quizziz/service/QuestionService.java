package com.sachin108.quizziz.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.sachin108.quizziz.dto.QuestionForm;
import com.sachin108.quizziz.model.*;
import com.sachin108.quizziz.repository.*;

import jakarta.transaction.Transactional;

@Service
public class QuestionService {
    private final QuestionRepository questionRepo;
    private final OptionRepository optionRepo;

    public QuestionService(QuestionRepository questionRepo, OptionRepository optionRepo){
        this.optionRepo=optionRepo;
        this.questionRepo=questionRepo;
    }

    @Transactional
    public void createQuestionForm(QuestionForm form){
        Question ques=new Question();
        ques.setText(form.getText());

        List<Option> options=new ArrayList<>();

        for (int i=1;i<5;i++){
            String optionText=switch(i){
                case 1 -> form.getOption1();
                case 2 -> form.getOption2();
                case 3 -> form.getOption3();
                case 4 -> form.getOption4();
                default -> "";
            };
            Option option=new Option();
            option.setText(optionText);
            options.add(option);
            option.setQuestion(ques);
        }

        // options added for a Q
        ques.setOptions(options);
        questionRepo.save(ques);

        // setting correct option
        Option correct=options.get(form.getCorrectOption()-1);
        ques.setCorrectOptionId(correct.getId());
        questionRepo.save(ques);
    }
}
