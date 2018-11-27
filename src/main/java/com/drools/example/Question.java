package com.drools.example;

import java.util.ArrayList;

public class Question {

    public String content;
    public ArrayList<UserAnswer> answers = new ArrayList<>();
    public ArrayList<Car> cars = new ArrayList<>();

    public Question(String content, ArrayList<UserAnswer> answers, ArrayList<Car> cars) {
        this.content = content;
        this.answers = answers;
        this.cars = cars;
    }

    
}
