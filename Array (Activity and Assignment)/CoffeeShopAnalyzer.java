public class CoffeeShopAnalyzer { // Ito yung buong program ko para sa coffee shop
    public static void main(String[] args) { // Dito nagsisimula
        // Una, nilagay ko muna yung date
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195}; // Ito yung benta kada araw, Monday hanggang Sunday na yung order
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; // Kailangan ko rin ng pangalan ng araw, kaya nilagyan ko
        //Ipapakita ko muna yung benta araw-araw
        System.out.println("---Daily Sales---"); // Nilagyan ko na rin ng header para hindi magulo tignan
        for (int i = 0; i < weeklySales.length; i++) { // Maglo-loop ako rito para isa-isahin yung bawat araw
            System.out.println(daysOfWeek[i] + " sales; " + weeklySales[i]); // So halimbawa, Monday tapos katabi niya yung 120
        } // Tapos na yung paglista

        //Ngayon, kwentahin ko na yung total at average
        int totalSales = 0; // Dito ko muna ilalagay yung total, zero muna habang wala pang nadadagdag

        for (int dailySale : weeklySales) { // Kukunin ko lang isa-isa yung benta
            totalSales += dailySale; // Tapos idadagdag ko lang siya ng idadagdag dito
        } // Paglabas dito, buo na yung total

        double averageSales = (double) totalSales / weeklySales.length; // Yung total, dinivide ko sa 7. Ginawa kong double kasi pag int lang, mawawala yung decimal
        System.out.println("\n--- Weekly Summary ---"); // Bagong section na ulit
        System.out.println("Total Sales: " + totalSales + " cups"); // Ito yung kabuuan sa isang linggo
        System.out.println("Average Daily Sales: " + averageSales + " cups"); // Tapos ito naman yung average kada araw

        int maxSales = weeklySales[0]; // Ang ginawa ko, yung unang araw muna yung ginawa kong pinakamalaki, pang-umpisa lang
        int minSales = weeklySales[0]; // Ganun din sa pinakamaliit, yung unang araw muna
        String bestDay = daysOfWeek[0]; // Kaya sa ngayon, Monday muna yung best
        String worstDay = daysOfWeek[0]; // Monday din muna yung worst, pansamantala lang
        for (int i = 1; i < weeklySales.length; i++) { // Dito na ako magsisimula mag-compare, sa pangalawang araw na kasi nakuha ko na yung una
            if (weeklySales[i] > maxSales) { // Pag may mas malaki pa pala kesa sa hawak ko
                maxSales = weeklySales[i]; bestDay = daysOfWeek[i]; // Papalitan ko na yung pinakamalaki. Tapos yung araw niya rin yun na yung bagong best
            }

            if (weeklySales[i] < minSales) { // Pag may mas maliit pa pala
                minSales = weeklySales[i]; // Papalitan ko yung pinakamaliit
                worstDay = daysOfWeek[i]; // Tapos yun na rin yung bagong worst
            }
        }

        System.out.println("\n--- Bests and Worsts ---"); // Last na part na
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups."); // Ito yung araw na pinakamaraming benta
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups."); // Ito naman yung araw na pinaka-kaunti
    }
}

