package com.Vladon;

public class Apex extends Consumer {
        public Apex(String name, String habitat, int lifespan, String type, int tier) {
            super(name, habitat, lifespan, type, tier);
        }

        @Override
        public String canBeEaten(){
            return "and it can only be consumed by the Decomposers.";
        }
    }
