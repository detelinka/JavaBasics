package _3_ConditionalStatementsAdvanced.LAB;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (time >= 10 && time <= 18) {
                    System.out.println("open");
                }else {
                    System.out.println("closed");
                }break;
            case "Sunday":
                System.out.println("closed"); break;
        }

    }
}
