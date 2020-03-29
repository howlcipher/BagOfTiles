import java.util.*;

public class tileBag {
    private int tilesInBag;


    public tileBag() {
        this.tilesInBag = tileCount();
        System.out.println("Tile bag created\n"); //created a new tile bag object
    }

    //create the random list order of number with one duplicate
    public static ArrayList contents(int tib) {
        Random rand = new Random();//new random

        ArrayList randList = new ArrayList(tib);
        int i = 0;
        while (i < tib) {
            int newNumber = rand.nextInt((tib + 1) - 1) + 1; //generates random number 1 through tib
            if (randList.contains(newNumber)) {  //if in ArrayList do nothing

            } else { //if not in the list
                randList.add(newNumber); //add the number to the ArrayList
                i++; //increase i
            }
        }
        randList.add((rand.nextInt(tib - 1) + 1), (rand.nextInt(tib - 1) + 1)); //add a random number to a random spot in the ArrayList
        return randList; //return an ArrayList
    }

    public static int tileCount() {
        Scanner sc = new Scanner(System.in); //create the scanner
        System.out.print("Enter the number of tiles in the bag: ");
        while (!sc.hasNextInt()) { //if the user does not enter an int
            System.out.println("Try again (enter a whole number such as 2 or greater)");
            sc.next();
        }

        int tib = (int) sc.nextInt(); //input the number of tiles

        if (tib < 2 || tib > 100) {
            tib = 10;
            System.out.println("The minimal amount of tiles is 2 and maximum is 100.  Your bag now has a nice number of 11 tiles (1 duplicate and 10 other numbers)");
        }
        System.out.println("A duplicate tile has been placed in the bag increasing your bag to: " + (tib + 1));

        sc.close(); //close the scanner


        return tib;
    }


    public static ArrayList loadTiles(tileBag tb) {
        ArrayList tilesInBag = tb.contents(tb.getTilesInBag()); //load random tiles into a variable
        System.out.println("\nYour bag of tiles contains: \n" + tilesInBag); //displays the current tiles
        return tilesInBag;
    }

    //find the duplicate tile
    public static void dupeFinder(ArrayList tiles) {
        Set<Integer> noDupe = new LinkedHashSet<Integer>(tiles); //adds all items from tilesInBag except for duplicates (it won't accept duplicates)
        ArrayList nd = new ArrayList(noDupe); //converts noDupe to ArrayList
        nd.add(nd.size() + 1); //added to list to create equal size - a number not in the bag
        System.out.println("\nTile bag without dupe tile: \n" + noDupe); //displays bag without 11

        //compares the two ArrayLists to find the duplicate - if last index is the duplicate it won't match the .size() + 1
        for (int i = 0; i <= tiles.size(); i++) {
            if (tiles.get(i) == nd.get(i)) {

            } else {
                System.out.println("\n---------");
                System.out.println("The duplicate number in your bag of tiles is: " + tiles.get(i) + "\nAt index number: " + i); //gives the duplicate number and index
                break;
            }
        }
    }

    public int getTilesInBag() {
        return tilesInBag;
    }
}

