package com.sachin108.quizziz.repository;

import com.sachin108.quizziz.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, String> {
}
