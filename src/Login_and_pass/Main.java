package Login_and_pass;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    //TODO переписать все проверки с в соответствующие классы, с проверкой на наличие в Мар (Main.map)

    protected static TreeMap<String, String> loginsAndPass = new TreeMap<>();
        protected static Pass pass = new Pass();
        protected static Login login = new Login();
        protected static Scanner scanner = new Scanner(System.in);
        protected static String setPass = "";
        protected static String setLogin = "";


    public static void main(String[] args) {
        setPass = scanner.nextLine();


        if (!loginsAndPass.containsKey(pass.fillPass(setPass))) {
            loginsAndPass.put(setPass,setLogin);
            System.out.println("Пароль сохранён");
            if (loginsAndPass.get(setPass).isEmpty()) {
                setLogin = scanner.nextLine();
                if (!loginsAndPass.containsValue(login.fillLogin(setLogin))) {
                loginsAndPass.put(setPass,setLogin);
                } else {
                    System.out.println("Такой логин уже существует, введите пароль!");
                    setPass = scanner.nextLine();
                }
            }
        }
    }
}
