// BlueJ project: lesson4/checkerboard
// Video: Checkerboard

public class CheckerBoardPainter
{
    /**
     * Computes the color of a square on a checkerboard.
     *
     * Spaces are red if one of the coordinates is even and the other is odd
     * Spaces are blue if both coordinates are even
     * Spaces are blue if both coordinates are odd
     * 
     * @return 1 for red spaces and 0 for blue
     * @param row the row of the space to paint
     * @param col the column of the space to paint. 
     */
    public int getColor(int row, int col)
    {
        // Another possibility is to use bitwise operators like (row + col)&1 == 0 which means that the least significant bit of (row + col) will be zero. In this case
        // the number is even.
        if ((row + col)%2 == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
