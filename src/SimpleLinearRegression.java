public class SimpleLinearRegression {

    private double intercept;   // es lo mismo a B0
    private double slope;       // es lo mismo a B1

    public void fit(int[] x, int[] y) {
        int n = x.length;
        DiscreteMaths dm = new DiscreteMaths();

        double sumX = dm.sumX(x);
        double sumY = dm.sumY(y);

        double sumXY = dm.sumXY(x,y);
        double sumXSquare = dm.sumXSquare(x);

        // Calcular los coeficientes de la regresión lineaL
        slope = (n * sumXY - sumX * sumY) / (n * sumXSquare - sumX * sumX); // B1
        intercept = (sumY - slope * sumX) / n; // B0
    }

    public double predict(int x) {
        return slope * x + intercept;
    }

    public double getSlope() { // Obtener B1
        return slope;
    }

    public double getIntercept() { // Obtener B2
        return intercept;
    }

    public static void calculateSimpleLinearRegression(int newXLinear) {
        DataSet ds = new DataSet();
        int[] xData = ds.getX();
        int[] yData = ds.getY();

        // Calcular la regresión lineal simple
        SimpleLinearRegression linearRegression = new SimpleLinearRegression();
        linearRegression.fit(xData, yData);

        // Obtener los coeficientes de la regresión lineal
        double interceptLinear = linearRegression.getIntercept(); // B0
        double slopeLinear = linearRegression.getSlope(); // B1

        // Imprimir la ecuación de regresión lineal
        System.out.println("Ecuación de regresión lineal: Y = " + slopeLinear + "(B1) * X + " + interceptLinear + "(B0)");

        // Predecir el valor de Y para un nuevo valor de X usando regresión lineal
        double predictedYLinear = linearRegression.predict(newXLinear);
        System.out.println("Predicción lineal para X = " + newXLinear + ": Y = " + predictedYLinear);
    }
}