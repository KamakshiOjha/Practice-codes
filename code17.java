import java.awt.*;
import java.awt.event.*;

public class code17 extends Frame implements ActionListener {
    TextField nameField, passField, resultField;
    Label lab1, lab2;
    Button b;

    code17() {
        setLayout(new GridLayout(4, 2, 0, 10));
        setBackground(Color.PINK);

        nameField = new TextField(15);
        passField = new TextField(15);
        resultField = new TextField(15);
        lab1 = new Label("Enter User Name");
        lab2 = new Label("Enter Password");
        b = new Button("Enter");

        b.addActionListener(this);
        passField.setEchoChar('*');
        resultField.setEditable(true);

        add(lab1);
        add(nameField);
        add(lab2);
        add(passField);
        add(b);
        add(resultField);

        setTitle("User Name & Password Validation");
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String str1 = nameField.getText();
        String str2 = passField.getText();

        if (str1.equals("kamakshi") && str2.equals("ojha")) {
            resultField.setText("VALID");
        } else {
            resultField.setText("INVALID, TRY AGAIN");
        }
    }

    public static void main(String[] args) {
        code17 obj = new code17();
    }
}
