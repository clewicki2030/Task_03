import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your party affiliation");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey");
            input.close();
        } else {
            if (choice.equalsIgnoreCase("R")) {
                System.out.println("You get a Republican Elephant");
            } else if (choice.equalsIgnoreCase("I")) {
                System.out.println("You get an Independent Person");
            } else {
                System.out.println("you get an Other");
            }
            input.close();
        }
    }}