package com.sachin108.quizziz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin108.quizziz.dto.QuestionForm;
import com.sachin108.quizziz.service.QuestionService;


@Controller
@RequestMapping("/admin")
public class AdminController {

    private final QuestionService questionService;

    public AdminController(QuestionService questionService){
        this.questionService=questionService;
    }

    @GetMapping("/create_question")
    public String showCreateQuestionForm(Model model){
        model.addAttribute("questionForm", new QuestionForm());
        return "create_question";
    }

    @PostMapping("/create_question")
    public String createQuestion(@ModelAttribute QuestionForm form){
        questionService.createQuestionForm(form);
        return "redirect:/";
    }

    @GetMapping("/create_quiz")
    public String createQuiz(){
        return "create_quiz";
    }

}
