package com.sachin108.quizziz.repository;

import com.sachin108.quizziz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
