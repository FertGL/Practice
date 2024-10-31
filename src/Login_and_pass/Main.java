package Login_and_pass;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {


    protected static Map<String, String> loginsAndPass = new TreeMap<>();
    protected static Login login = new Login();
    protected static Scanner scanner = new Scanner(System.in);
    protected static String input = "";

    public static void main(String[] args) {
        while (true) {
            input = scanner.nextLine();

            switch (input) {
                case "login" -> login.fillLogin();
                case "pass" -> {
                    System.out.println("Введите логин!: ");
                    login.fillLogin();
                }
                case "info" -> {
                    System.out.println("Введите пароль: ");
                    input = scanner.nextLine();
                    loginsAndPass.get(input);
                }
                case "exit" -> System.exit(0);
            }
        }
    }
}
