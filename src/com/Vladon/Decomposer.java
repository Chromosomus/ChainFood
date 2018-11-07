package com.Vladon;

public class Decomposer extends Consumer {


    public Decomposer(String name, String habitat, int lifespan, String type, int tier){
        super(name, habitat, lifespan, type, tier);
    }
    @Override
    public String canEat(){
        return "As a Decomposer, " + this.name + " can consume any participant of the food chain, also ";
    }

    @Override
    public String canBeEaten(){
        return this.name + " can be eaten by most consumers, but not other decomposers";
    }

}
