package Login_and_pass;

import java.util.Scanner;

public class Login {
    private static final String LOGIN_REGEX = "[\\da-zA-Z]";
    private static final Integer LENGTH_OF_LOG = 20;
    Scanner scanner = new Scanner(System.in);

    public String fillLogin(String login) {
        if (login.isBlank()) {
            System.out.println("Введите логин: ");
            login = scanner.nextLine();
        } else if (!login.replaceAll(LOGIN_REGEX, " ").trim().equals(login)) {
            System.out.println("Введите логин содержащий только буквы (АНГЛ) и цифры: ");
            login = scanner.nextLine();
        } else if (login.length() > LENGTH_OF_LOG) {
            System.out.println("Логин слишком длинный");
            login = scanner.nextLine();
        } else if (!Main.loginsAndPass.containsValue(login)) {
            Main.loginsAndPass.put("",login);
        }
        return login;
    }
}
