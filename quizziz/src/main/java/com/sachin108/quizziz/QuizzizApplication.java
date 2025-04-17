package com.sachin108.quizziz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizzizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizzizApplication.class, args);
	
	}

}

/**
<div th:if="${#authorization.expression('hasRole(''ADMIN'')')}">
    <a class="create-button" th:href="@{/admin/create-quiz}">Create Quiz</a>
    <a class="create-button" th:href="@{/admin/create-question}">Create Question</a>
</div>


	        <form th:action="@{/admin/create_quiz}" method="post" th:object="${quiz}">
            <label>Quiz Title:</label>
            <input type="text" th:field="*{title}" placeholder="Enter quiz title" required/>

            <label>Description:</label>
            <textarea th:field="*{description}" placeholder="Enter quiz description" rows="4" required></textarea>

 */