package Stepik.lesson_3_5;

import javax.swing.*;

public class LoginSystem {
    public static void main(String[] args) {
        new Login();
    }
}
class Login extends JOptionPane {
    String login;
    String password;
    String password2;

    {
        showMessageDialog(null, "Добрый день. Пройдите регистрацию!");
        do {
            login = showInputDialog(null, "Введите ваш логин:", "Login", 3);
            if (login == null) break;
        } while (login.length() < 6 || login.indexOf(" ") != -1);
        if (login.length() != 0) {
            int a = getPassword("Введите пароль", 1);
            if (a == 0) {
                int b = getPassword("Повторите пароль", 2);
                if (b == 0) {
                    showMessageDialog(null, "Регистрация прошла успешно!");
                }
            }
        }
    }
    public int getPassword(String text, int c){
        JPanel panel = new JPanel();
        JPasswordField pass = new JPasswordField(10);
        JLabel label = new JLabel(text);
        BoxLayout box = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(box);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "Password",
                JOptionPane.NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);
        if(option == 0) {
            if (c == 1) {
                boolean flagN = true;
                boolean flagW = true;
                char[] passwordC = pass.getPassword();
                for (char a : passwordC) {
                    if (Character.isDigit(a)) flagN = false;
                    if (Character.isLetter(a)) flagW = false;
                }
                password = new String(passwordC);
                if (password.length() < 9 || password.indexOf(" ") != -1 || flagN || flagW) getPassword("Введите пароль", 1);
            } else {
                char[] passwordC = pass.getPassword();
                password2 = new String(passwordC);
                if (!password2.equals(password)) getPassword("Повторите пароль", 2);
            }
            return 0;
        }
        return 1;
    }
}