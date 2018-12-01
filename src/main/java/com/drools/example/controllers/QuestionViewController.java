package com.drools.example.controllers;

import com.drools.example.Question;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class QuestionViewController {

    private Question question;

    public QuestionViewController(Question question) {
        this.question = question;
    }

    @FXML
    private Text questionContent;

    @FXML
    public void initialize() {
        questionContent.setText(question.content);
    }

    @FXML
    public void userAnswer(ActionEvent event) {

    }





}
