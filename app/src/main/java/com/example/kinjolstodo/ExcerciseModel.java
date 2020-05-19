package com.example.kinjolstodo;

import java.util.ArrayList;
import java.util.List;

public class ExcerciseModel {
    List<Excercise> excerciseList = new ArrayList<>();

    public List<Excercise> getExcerciseList() {
        return excerciseList;
    }

    public void addExcercise(Excercise excercise){
        this.excerciseList.add(excercise);
    }

}
