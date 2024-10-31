package Login_and_pass;

import java.util.Scanner;

public class Login {
    private final String LOGIN_REGEX = "[^\\da-zA-Z0-9]";
    private final Integer LENGTH_OF_LOG = 20;
    Scanner scanner = new Scanner(System.in);

    Pass pass = new Pass();

    public String fillLogin() {
        System.out.println("Введите логин: ");
        String inputLogin = scanner.nextLine();
        checkLogin(inputLogin);
        return inputLogin;
    }

    public String checkLogin(String login) {
        if (login.isBlank()) {
            System.out.println("Введите логин: ");
            fillLogin();
        } else if (login.replaceAll(LOGIN_REGEX, "").isBlank()) {
            System.out.println("Введите логин содержащий только буквы (АНГЛ) и цифры: ");
            fillLogin();
        } else if (login.length() > LENGTH_OF_LOG) {
            System.out.println("Логин слишком длинный");
            fillLogin();
        }
        if (!Main.loginsAndPass.containsValue(login)) {
            Main.loginsAndPass.put(pass.fillPass(), login);
            pass.fillPass();
            System.out.println("Аккаунт сохранён.");
        } else {
            pass.fillPass();
        }
        return login;
    }
}
