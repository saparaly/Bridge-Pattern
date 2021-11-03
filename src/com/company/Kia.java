package com.company;

public class Kia extends Car{
    public Kia(Model model) {
        super(model);
    }

    @Override
    public void chooseModel() {
        System.out.println("Choosing Kia model: ");
        model.chooseModel();
    }
}
