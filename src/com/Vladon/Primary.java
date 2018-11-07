package com.Vladon;

public class Primary extends Secondary {
    public Primary (String name, String habitat, int lifespan, String type, int tier){
        super(name, habitat, lifespan, type, tier);
    }
    @Override
    public String canEat(){
        return " It can only consume producers, like grass, ";
    }
}
