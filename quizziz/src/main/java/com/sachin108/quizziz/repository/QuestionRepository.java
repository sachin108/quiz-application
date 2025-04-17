package com.sachin108.quizziz.repository;

import com.sachin108.quizziz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
