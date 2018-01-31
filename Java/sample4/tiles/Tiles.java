// BlueJ project: Tiles
// Video: Your turn to do it by hand

import java.util.Scanner;

public class Tiles
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Width of wall: ");
        double width = in.nextDouble();

        System.out.print("Tile size: ");
        double tileSize = in.nextDouble();

        // TODO: Complete these computations
        
        // pairs of tiles is the width of the wall minus 1 white tile divided 
        // by the size of a pair (white and red) of tiles.
        int pairs = (int) ((width - tileSize)/(2*tileSize));
        int redTiles = pairs;
        int whiteTiles = pairs + 1;

        System.out.println("Red tiles: " + redTiles);
        System.out.println("Whites tiles: " + whiteTiles);
    }
}
