package _3_ConditionalStatementsAdvanced.LAB;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if ((num >= 100) && (num <= 200) || (num == 0)) {
        } else {
            System.out.println("invalid");
        }
    }
}