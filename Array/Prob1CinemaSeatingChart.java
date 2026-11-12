import java.util.Arrays;
public class Prob1CinemaSeatingChart {
    public static void main(String[] args) {

        String[][] seats = { // Nagde-declare at nag-i-initialize ng 2D String array na tinatawag na 'seats' (2 rows at 3 columns)
                 {"Alice", "Bob", "Charlie"}, // Unang row (index 0) na may tatlong pangalan
                {"David", "Emma", "Frank"} // Pangalawang row (index 1) na may tatlong pangalan
        };

        System.out.println("Person sitting in the second row, third column: " + seats[1][2]); // Kinukuha at ipini-print ang nakaupong sa pangalawang row (index 1) at pangatlong column (index 2) na si Frank.

        seats[0][1] = "Vacant"; // Pinalitan ang pangalan na Bob ng Vacant. Ang index ni Bob ay nasa row 0 at column 1.

        System.out.println(Arrays.deepToString(seats)); // Pinapakita rito ang buong seating arrangement pagkatapos palitan ang Bob ng Vacant.

    }
}
