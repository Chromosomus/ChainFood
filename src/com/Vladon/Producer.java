package com.Vladon;

public class Producer extends Consumer {
    public Producer(String name, String habitat, int lifespan, String type, int tier){
        super(name, habitat, lifespan, type, tier);
    }

    @Override
    public String canEat(){
        return "As a producer, "+this.name +" can consume only solar energy via photosynthesis,";
    }


}
