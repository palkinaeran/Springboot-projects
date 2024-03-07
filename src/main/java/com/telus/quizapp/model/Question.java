package com.telus.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer id;
    private String ques;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String category;
    private String level;
    private String correct;



}
