package com.company;

public abstract class Car {
    protected Model model;
     public Car(Model model) {
         this.model = model;
     }
     abstract public void chooseModel();
}
