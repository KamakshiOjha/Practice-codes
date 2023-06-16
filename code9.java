import java.awt.*;
import java.awt.event.*;

public class code9 extends Frame implements ActionListener {
    TextField t1, t2, t3, t4;
    TextArea a;
    Button b;
    Label l1, l2, l3, l4;

    code9() {
        super("course");
        l1 = new Label("enter name");
        t1 = new TextField(10);

        l2 = new Label("enter enrollment");
        t2 = new TextField(10);

        l3 = new Label("enter percentage");
        t3 = new TextField(10);

        l4 = new Label("you are allotted");
        t4 = new TextField("no result");

        b = new Button("get result");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(t3.getText());
        String temp;
        if (x > 30) {
            temp = "pass";
            t4.setText(temp);
        } else {
            temp = "Fail";
            t4.setText(temp);
        }
    }

    public static void main(String[] args) {
        code9 f = new code9();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }
}
