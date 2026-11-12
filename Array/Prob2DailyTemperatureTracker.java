public class Prob2DailyTemperatureTracker {
    public static void main(String[] args) {

        double[] temperatures = new double[5]; // Gumagawa ng array na paglalagyan ng temperatura sa loon ng limang araw.

        // Nilalagay ang temperatura na na-record sa bawat araw.
        temperatures[0] = 32.5;
        temperatures[1] = 34.0;
        temperatures[2] = 31.8;
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        for (int i = 0; i < temperatures.length; i++) { // Ginagamit ang for loop para maipakita isa-isa ang mga temperatura.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // Pinapakita ang temperatura ng bawat araw.
        }

        temperatures[2] = 32.0; //ina-update ang temperatura sa pangatlong araw at ginagawang 32.0

        System.out.println("Updated temperature for Day 3: " + temperatures[2]); // Pinapakita ang bagong temperatura pagkatapos itong palitan.

    }
}
