import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear = 2023;

    birthYear = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("How old are you?");

    age = scanner.nextInt();

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    scanner.close();
  }
}