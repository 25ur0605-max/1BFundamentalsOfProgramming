import javax.swing.JOptionPane;
public class Assignment4JOptionPane {
    public static void main(String[] args) {
        String heightInput = JOptionPane.showInputDialog("Enter height in cm: ");
        String ageInput = JOptionPane.showInputDialog("Enter age: ");
        String citizenship = JOptionPane.showInputDialog("Enter citizenship code ('C' for citizen of Endor, 'N' for non-citizen): ");
        String recommendee = JOptionPane.showInputDialog("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");

        if (heightInput != null && ageInput != null && citizenship != null && recommendee != null) {
            double height = Double.parseDouble(heightInput);
            int age = Integer.parseInt(ageInput);

            String status;

            if (recommendee.equalsIgnoreCase("R")) {
                status = "Accepted";
            } else if (height >= 200 && (age >= 21 && age <= 25) && citizenship.equalsIgnoreCase("C")) {
                status = "Accepted";
            } else {
                status = "Rejected";
            }

            String msg = "Status: " + status;
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}