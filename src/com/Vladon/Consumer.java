package com.Vladon;

public class Consumer implements Comparable<Consumer> {
    public String name;
    public String habitat;
    public int lifespan;
    public String type;
    public int tier;

   /* public Consumer(String name, int tier){
        this.name=name;
        this.tier=tier;
    }*/

    public Consumer(String name, String habitat, int lifespan, String type, int tier) {
        this.name = name;
        this.habitat = habitat;
        this.lifespan = lifespan;
        this.type = type;
        this.tier=tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
       /* if (this.tier < 0 || this.tier > 5) {
            throw new IllegalArgumentException("Tier should be no less than 0 and no more than 5");
        }*/
        this.tier = tier;
    }

    public String canEat () {
        return "It can eat lesser consumers, ";

    }
    public String canBeEaten() {
       return "and it can be eaten by the higher predators or consumed by the Decomposers. ";
        }

    public String tierCalc() throws IllegalArgumentException{
        if (tier == 1){
            return "an Apex predator";
        }
        else if(tier==2){
            return "a Tertiary consumer";
        }
        else if(tier==3){
            return "a Secondary consumer";
        }
        else if(tier==4){
            return "a Primary consumer";
        }
        else if(tier==5) {
            return "a producer";
        }
        else if(tier==0){
            return "a Decomposer";
        }
        else {
            System.exit(0);
            throw new IllegalArgumentException("/f/ds/f");
            //System.exit(0);
        }

    }
    public String toString(){
        return getName() + " is " + tierCalc() + ". It inhabits " + getHabitat() + ", and it's average lifespan is " + getLifespan()+ " years. " + canEat() + canBeEaten();
    }


    public static String positions(Consumer c1, Consumer c2){ // check which consumer is higher up the food chain, and which one is lower
        if (c1.getTier()<c2.getTier()){
            return c1.getName() + " is placed in the food chain higher than " + c2.getName() + ", therefore the " + c2.getName() + " can be consumed by the " + c1.getName();
        }
        else if(c1.getTier()==c2.getTier()){
            return c1.getName() + " and " + c2.getName() + " are placed equally on the food chain, therefore neither is prey to the other.";
        }
        else {
            return c1.getName() + " is placed in the food chain lower than " + c2.getName() + ", therefore the " + c1.getName() + " can be consumed by the " + c2.getName();
        }
    }

    public static String sibling(Consumer o1, Consumer o2){
        if(o1.getTier()==o2.getTier() || o1.getTier()==o2.getTier()-1 || o1.getTier()==o2.getTier()+1){
            return "These consumers are siblings";
        }
        else{
            return "These consumers are not siblings";
        }
    }


    @Override
    public int compareTo(Consumer comparestu) {
        int comparetier=((Consumer)comparestu).getTier();
        return this.tier-comparetier;

    }

}
