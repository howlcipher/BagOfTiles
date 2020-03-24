import java.util.Random;
import java.util.ArrayList;

public class tileBag {
    private int tilesInBag;


    public tileBag(int tilesInBag) {
        this.tilesInBag = tilesInBag;
        System.out.println("Tile bag created\n"); //created a new tile bag object
    }

    public static ArrayList contents(int tib) {
        Random rand = new Random();//new random

        ArrayList randList = new ArrayList(tib);
        int i = 0;
        while (i < tib) {
            int newNumber = rand.nextInt((tib + 1) - 1) + 1; //generates random number 1 - 10
            if (randList.contains(newNumber)) {  //if in ArrayList do nothing

            } else { //if not in the list
                randList.add(newNumber); //add the number to the ArrayList
                i++; //increase i
            }
        }
        randList.add((rand.nextInt(tib - 1) + 1), (rand.nextInt(tib - 1) + 1)); //add a random number to a random spot in the ArrayList
        return randList; //return an ArrayList
    }


    public int getTilesInBag() {
        return tilesInBag;
    }
}

