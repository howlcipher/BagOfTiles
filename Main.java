import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create the scanner
        System.out.print("Enter the number of tiles in the bag: ");
        while (!sc.hasNextInt()) { //if the user does not enter an int
            System.out.println("Try again (enter a whole number such 1, 2, 3...)");
            sc.next();
        }
        int tib = (int) sc.nextInt(); //input the number of tiles
        sc.close(); //close the scanner
        tileBag tb = new tileBag(tib);//create a bag object with set amount of tiles
        ArrayList tilesInBag = tb.contents(tb.getTilesInBag()); //load random tiles into a variable
        System.out.println("Your bag of tiles contains: \n" + tilesInBag); //displays the current tiles


        Set<Integer> noDupe = new LinkedHashSet<Integer>(tilesInBag); //adds all items from tilesInBag except for duplicates
        ArrayList nd = new ArrayList(noDupe); //converts noDupe to ArrayList
        nd.add(nd.size() + 1); //added to list to create equal size - a number not in the bag
        System.out.println("\nTile bag without dupe tile: \n" + noDupe); //displays bag without 11

        //compares the two ArrayLists to find the duplicate - if last index is the duplicate it won't match 11
        for (int i = 0; i <= tilesInBag.size(); i++) {
            if (tilesInBag.get(i) == nd.get(i)) {

            } else {
                System.out.println("\n---------");
                System.out.println("The duplicate number in your bag of tiles is: " + tilesInBag.get(i) + "\nAt index number: " + i); //gives the duplicate number and index
                break;
            }
        }


    }

}

