package labaratory_tasks_pt3.task5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckLogAndPass {
    public static boolean check(String login, String password, String confirmPassword) {
        String regex = "^[a-zA-Z0-9_]*$";
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("length is exceeded");
            } else if (password.length() > 20) {
                throw new WrongPasswordException("length is exceeded");
            }

            if (!Pattern.matches(regex, login)) {
                throw new WrongLoginException("login is incorrect");
            } else if (!Pattern.matches(regex, password)) {
                throw new WrongPasswordException("password is incorrect");
            }

            if (!confirmPassword.equals(password)) {
                throw new WrongPasswordException("passwords is not matched");
            }
            return true;
        } catch (WrongLoginException ex) {
            System.out.println("Ошибка: " + ex);
            return false;
        } catch (WrongPasswordException ex) {
            System.out.println("Ошибка: " + ex);
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login1 = "VladNEGR__228";
        String password1 = "987654321ggg";
        String confirmPassword1 = "987654321ggg";
        String login2 = sc.nextLine();
        String password2 = sc.nextLine();
        String confirmPassword2 = sc.nextLine();
        System.out.println(check(login1, password1, confirmPassword1));
        System.out.println(check(login2, password2, confirmPassword2));


    }
}
