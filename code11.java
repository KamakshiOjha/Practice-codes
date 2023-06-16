import java.awt.*;
import java.awt.event.*;

public class code11 extends Frame implements KeyListener {
    Label l1, l2, l3;
    TextField t1, t2;
    TextArea t3;
    Button b;

    code11() {
        // Initialize variables
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextArea("ans", 5, 20, TextArea.SCROLLBARS_BOTH);
        b = new Button("click me");
        l1 = new Label("name");
        l2 = new Label("text");
        l3 = new Label("event");

        // Add components to the frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(t3);
        add(l3);

        setLayout(new FlowLayout());

        // Add event listeners to components
        // b.addActionListener(this);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        l3.addKeyListener(this);
    }

    // KeyListener methods
    public void keyPressed(KeyEvent ke) {}
    public void keyTyped(KeyEvent ke) {}
    public void keyReleased(KeyEvent ke) {
        String temp = t1.getText();
        l3.setText("Length of Name: " + temp.length());
    }

    public static void main(String[] args) {
        code11 f = new code11();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
