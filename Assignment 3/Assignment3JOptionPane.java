import javax.swing.JOptionPane;
public class Assignment3JOptionPane {
    public static void main(String[] args) {
        String salaryInput = JOptionPane.showInputDialog("Enter Parents' Monthly Salary:");
        String nsatInput = JOptionPane.showInputDialog("Enter NSAT Score:");
        String examScoreInput = JOptionPane.showInputDialog("Enter Entrance Exam Score:");

        if (salaryInput != null && nsatInput != null && examScoreInput != null) {
            double salary = Double.parseDouble(salaryInput);
            double nsat = Double.parseDouble(nsatInput);
            double examScore = Double.parseDouble(examScoreInput);

            double averageScore = (nsat + examScore) / 2;
            String status;

            if (salary > 10000 || nsat < 90 || examScore < 85) {
                status = "Rejected";
            } else if (salary <= 3500 && averageScore >= 91 ) {
                status = "Accepted";
            }else {
                status = "Subjected for further study";
            }

            String msg = "Application Status: " + status;
            JOptionPane.showMessageDialog(null, msg);

        }


    }
}
