package Login_and_pass;

import java.util.Scanner;

public class Pass {
    private final String REGEX = "[^\\da-zA-Z]";
    Scanner scanner = new Scanner(System.in);


    public String fillPass() {
        System.out.println("Введите пароль: ");
        String inputPass = scanner.nextLine();
        checkPass(inputPass);
        return inputPass;
    }

    public String checkPass(String pass) {
        if (pass.isBlank()) {
            System.out.println("Введите пароль: ");
            fillPass();
        } else if (pass.replaceAll(REGEX, "").isBlank()) {
            System.out.println("Введите пароль содержащий только буквы (АНГЛ) и цифры: ");
            fillPass();
        } else {
            if (Main.loginsAndPass.containsKey(pass)) {
                System.out.println("Добро пожаловать!)");
            }
        }
        return pass;
    }
}
