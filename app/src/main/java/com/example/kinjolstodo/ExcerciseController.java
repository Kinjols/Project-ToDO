package com.example.kinjolstodo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcerciseController {
    ExcerciseModel excerciseModel = new ExcerciseModel();
    List<Excercise> excerciseList = new ArrayList<>(excerciseModel.getExcerciseList());
    Excercise pushups = new Excercise( 5,"Pushups");
    Excercise situps = new Excercise( 10,"Situps");
    Excercise plank = new Excercise(5, "Plank");
    Excercise squad = new Excercise(10, "Squads");

    public void CreateNewExcercise(int amount,String type){
//        int newExcerciseId = excerciseList.size() + 2;
        Excercise newExcercise = new Excercise(amount,type);
        excerciseList.add(newExcercise);
    }

    public Excercise randomExcercise(){
        excerciseList.add(pushups);
        excerciseList.add(situps);
        excerciseList.add(plank);
        excerciseList.add(squad);

        return excerciseList.get(new Random().nextInt(excerciseList.size()));
    }
}
