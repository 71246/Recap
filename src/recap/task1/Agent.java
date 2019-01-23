package recap.task1;

import java.util.Scanner;

public class Agent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, stranger! Please enter your full name:");
        String agentName = scanner.nextLine();

        if (agentName.equalsIgnoreCase("james bond")) {
            System.out.println("Welcome, 007!");
        } else {
            System.out.println("You are not an agent! Get out!");
        }
        scanner.close();
    }
}
