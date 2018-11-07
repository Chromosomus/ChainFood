package com.Vladon;

import java.util.ArrayList;
import java.util.Collections;





public class App{



    public static void main(String[] args) {
        System.out.println();
        Apex falcon = new Apex("Falcon", "Steppes", 5, "Avian", 1);

        Tertiary snake = new Tertiary("Snake", "Steppes", 23, "Terrestrial",2);

        Secondary bluebird = new Secondary("Bluebird", "Steppes", 2, "Avian",3);

        Primary grasshopper  = new Primary("Grasshopper", "Steppes", 23, "Terrestrial",4);

        Decomposer mushroom = new Decomposer("Mushroom", "Just about everywhere", 133, "Fungi", 0);

        Producer grass = new Producer("Grass", "Just about everywhere", 256, "Plant", 5);

        Tertiary sanek = new Tertiary("Sanek", "Steppes", 23, "Terrestrial",2);

        Apex test = new Apex("a","b", 5,"a",6);

        ArrayList<Consumer> theChain = new ArrayList<>();
        //theChain.add(new Tertiary("Sanek", "Steppes", 23, "Terrestrial",2));
        theChain.add(sanek);
        theChain.add(snake);
        theChain.add(falcon);
        theChain.add(bluebird);
        theChain.add(grass);
        theChain.add(grasshopper);
        theChain.add(mushroom);

        //Collections.sort(theChain); //--------- пищевая цепочка сверху вниз

        for (Consumer str: theChain){
            System.out.println(str);
            System.out.println("\t\t\t\t\t|");
            System.out.println("\t\t\t\t\t|");
            System.out.println("\t\t\t\t\t|");
            System.out.println("\t\t\t\t\tV");
        }

        Collections.sort(theChain);

        //Сравнение позиций в пищевой цепочке



        System.out.println(Consumer.positions(falcon, snake)+"\n");
        System.out.println(Consumer.positions(sanek, snake)+"\n");
        System.out.println(Consumer.positions(mushroom, falcon)+"\n");


        //Проверка на соседство

        System.out.println(Consumer.sibling(falcon,snake)+"\n");
        System.out.println(Consumer.sibling(falcon,bluebird)+"\n");
        System.out.println(Consumer.sibling(falcon,mushroom)+"\n");
        System.out.println(Consumer.sibling(sanek,snake)+"\n");

        System.out.println(test);

    }
}
