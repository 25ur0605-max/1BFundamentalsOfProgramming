public class QuizGrader { // Ito yung program ko para mag-check ng quiz
    public static void main(String[] args) { // Dito nagsisimula

        // Nilagay ko muna yung mga sagot
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D' }; // Ito yung tamang sagot, yung answer key talaga
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'}; // Ito naman yung sinagot ng estudyante

        int correctCount = 0; // Dito ko bibilangin kung ilan yung tama, zero muna

        System.out.println("--- Missed Questions ---"); // Dito ko ilalagay yung mga mali niya para makita agad
        for (int i = 0; i < answerKey.length; i++) { // Maglo-loop ako sa lahat ng 10 questions
            char studentAns = Character.toUpperCase(studentAnswers[i]); // Ginawa ko munang capital letter, kasi baka lowercase yung type niya
            char correctAns = Character.toUpperCase(answerKey[i]); // Ginawa ko munang capital letter, kasi baka lowercase yung type niya

            if (studentAns == correctAns) { // Chine-check ko kung pareho ba sila ng correct answer
                correctCount++; // Pag pareho, tama siya, dagdag isa
            }else{ // Pag hindi pareho, mali siya
                System.out.println("Question " + (i + 1) + ":Incorrect. You Answered '" + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'."); // Pinakita ko kung anong number yung mali, ano yung sinagot niya, at ano yung dapat. Yung i+1 kasi nagsisimula sa 0 yung index, pero Question 1 dapat yung una

            }
        }

        // Kwentahin ko na yung score
        double scorePercentage = ((double) correctCount / answerKey.length) * 100.0; // Yung tama, divide sa 10, times 100. Ginawa kong double para hindi maging 0 lang yung sagot

        System.out.println("\n--- Quiz Result ---"); // Dito ko ilalagay yung result ng quiz
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length); // Ito yung ilan yung tama niya, halimbawa 5 out of 10
        System.out.println("Score Percentage: " + scorePercentage + "%"); // Ito na yung percentage niya

        // Dito makikita kung pasado ba o hindi
        if (scorePercentage >= 70.0) { // Ang passing kasi 70 percent pataas
            System.out.println("Result: PASS"); // Pag umabot, pasado
        }else{ // Pag hindi umabot
            System.out.println("Result: FAIL"); // Bagsak
        }
    }
}
