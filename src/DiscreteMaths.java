public class DiscreteMaths {

    public DiscreteMaths() {
    }

    public int sumX(int[] x) {
        int totalX = 0;

        for (int i = 0; i < x.length; i++)
            totalX += x[i];

        return totalX;
    }

    public int sumY(int[] y) {
        int totalY = 0;

        for (int i = 0; i < y.length; i++)
            totalY += y[i];

        return totalY;
    }

    public int sumXY(int[] x, int[] y) {
        int totalXY = 0;

        for (int i = 0; i < x.length; i++)
            totalXY += x[i] * y[i];

        return totalXY;
    }

    public int sumXSquare(int[] x) {
        int totalXSquare = 0;

        for (int i = 0; i < x.length; i++)
            totalXSquare += x[i] * x[i];

        return totalXSquare;
    }

    public int sumXCube(int[] x) {
        int totalXCube = 0;

        for (int i = 0; i < x.length; i++)
            totalXCube += x[i] * x[i] * x[i];

        return  totalXCube;
    }

    public int sumXSquareY(int[] x, int[] y) {
        int totalXSquareY = 0;

        for (int i = 0; i< x.length; i++)
            totalXSquareY += x[i] * x[i] * y[i];

        return totalXSquareY;
    }
}

