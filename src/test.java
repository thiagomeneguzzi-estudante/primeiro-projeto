import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    private JButton loginButton;
    private JPanel panel1;
    private JTextField username;
    private JPasswordField password;

    public test() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(username.getText().equals("Thiago") && String.valueOf(password.getPassword()).equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Bem vindo, "+username.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Seu username ou senha está errado!");
                }
            }
        });
    }

    public static void show() {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
