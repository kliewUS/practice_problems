public class TemperatureConversion {
    // 2469. Convert the Temperature
    // https://leetcode.com/problems/convert-the-temperature/
    // Initalize a double array with length of 2.
    // Put the Kelvin temp on index 0.
    // Put the Fahrenheit temp on index 1.
    public double[] convertTemperature(double celsius) {
        double[] res = new double[2];

        res[0] = celsius + 273.15;
        res[1] = (celsius * 1.80) + 32.00;

        return res;
    }
}
