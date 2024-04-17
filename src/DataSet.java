public class DataSet {
    private int x[];
    private int y[];

    public DataSet() {
        y = new int[] {4, 8, 12, 16, 20, 24, 28, 32, 36};  // n = length = 9
        x = new int[] {1, 2, 3, 4, 5, 6, 7 , 8, 9};    // n = length = 9
    }

    public int[] getX() {
        return this.x;
    }

    public int[] getY() {
        return this.y;
    }

}



