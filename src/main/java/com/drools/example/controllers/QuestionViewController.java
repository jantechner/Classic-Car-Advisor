package com.drools.example.controllers;

import com.drools.example.Car;
import com.drools.example.Question;
import com.drools.example.Session;
import com.drools.example.UserAnswer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;


public class QuestionViewController {

    private Question question;

    @FXML
    Label questionContent, yourChoice;

    @FXML
    private VBox answerBox, resultBox;

    public QuestionViewController() {
    }

    @FXML
    public void initialize() {
    }


    public void updateQuestion(Question question) {
        this.question = question;
        System.out.println("Q: " + question.content + "\n");
        for (UserAnswer answer : question.answers) {
            System.out.println(answer.content);
        }
        this.setLabel();
        this.showAnswers();
        this.showResults();
    }

    private void setLabel() {
        if (this.question.content.equals(""))
            this.questionContent.setText("Choose your car");
        else
            this.questionContent.setText(this.question.content);

    }

    private void showAnswers() {
        this.answerBox.getChildren().clear();
        for (UserAnswer answer : question.answers) {
            Button answerButton = new Button(answer.content);
            answerButton.setOnAction(event -> {
                this.chooseAnswer(answer);
            });
            this.answerBox.getChildren().add(answerButton);
        }
    }

    private void showResults() {
        this.resultBox.getChildren().clear();
        for (Car car : question.cars) {
            Button resultButton = new Button(car.name);
            resultButton.setOnAction(event -> {
                this.chooseResult(car);
            });
            this.resultBox.getChildren().add(resultButton);
        }
    }


    private void chooseAnswer(UserAnswer answer) {
//        System.out.println("Chosen answer: " + answer.content);
        Session.insertAnswer(answer);
    }

    private void chooseResult(Car car) {
//        System.out.println("Chosen car: " + car.name);
        this.yourChoice.setText("Your choice: " + car.name);
    }

}
