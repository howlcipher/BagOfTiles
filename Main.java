import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        tileBag tb = new tileBag();//create a bag object with set amount of tiles
        ArrayList tilesInBag = tb.loadTiles(tb);

        //SORT CODE BELOW - FIND THE DUPLICATE
        tb.dupeFinder(tilesInBag);


    }

}

