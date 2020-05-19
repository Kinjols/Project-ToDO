package com.example.kinjolstodo;

public class Excercise {

    private static int id;
    private  int amount = 0;
    private String type;

    public Excercise(int amount, String type) {
        this.id = id++;
        this.amount = amount;
        this.type = type;
    }
    public static int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }




}
