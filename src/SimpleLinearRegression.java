public class SimpleLinearRegression {

    private double slope;
    private double intercept;

    public void fit(int[] x, int[] y) {
        int n = x.length;
        DiscreteMaths dm = new DiscreteMaths();

        double sumX = dm.sumX(x);
        double sumY = dm.sumY(y);

        double sumXY = dm.sumXY(x,y);
        double sumXSquare = dm.sumXSquare(x);

        // Calcular los coeficientes de la regresión lineal
        slope = (n * sumXY - sumX * sumY) / (n * sumXSquare - sumX * sumX);
        intercept = (sumY - slope * sumX) / n;
    }

    public double predict(int x) {
        return slope * x + intercept;
    }

    public double getSlope() {
        return slope;
    }

    public double getIntercept() {
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
        double slopeLinear = linearRegression.getSlope();
        double interceptLinear = linearRegression.getIntercept();

        // Imprimir la ecuación de regresión lineal
        System.out.println("Ecuación de regresión lineal: Y = " + slopeLinear + " * X + " + interceptLinear);

        // Predecir el valor de Y para un nuevo valor de X usando regresión lineal
        double predictedYLinear = linearRegression.predict(newXLinear);
        System.out.println("Predicción lineal para X = " + newXLinear + ": Y = " + predictedYLinear);
    }
}