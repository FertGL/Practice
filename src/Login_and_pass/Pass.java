package Login_and_pass;

import java.util.Scanner;

public class Pass extends Login{
    private static final String REGEX = "[^\\da-zA-Z]";
    Scanner scanner = new Scanner(System.in);

    public String fillPass(String pass) {
        if (pass.isBlank()) {
            System.out.println("Введите пароль: ");
            pass = scanner.nextLine();
        } else if (!pass.replaceAll(REGEX, " ").trim().equals(pass)) {
            System.out.println("Введите пароль содержащий только буквы (АНГЛ) и цифры: ");
            pass = scanner.nextLine();
        }
        return pass;
    }
}
