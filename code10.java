import java.awt.*;
import java.awt.event.*;
// 2 import statements first for awt and second for eventhandling

public class code10 extends Frame implements ActionListener{
    Label l1,l2,l3;
    TextField t1,t2;
    TextArea t3;
    Button b;
// defining variables out of psvm statement
    code10(){
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextArea("ans");
        t3.setSize(20,20);
        b = new Button("click me");
        l1 = new Label("name");
        l2 = new Label("text");
        l3 = new Label();
 // after making object for each we add it in the frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(t3);

        setLayout(new FlowLayout());
        // this below statment is used for event handling..what it does is 
        // it uses button b to perform operations on the system .

        b.addActionListener(this);



 } 
// for handling event we use a inbuild or defined  method in actionlistener interface.
    public void actionPerformed(ActionEvent ae){
        String x = t1.getText() + "   " + t2.getText();
        t3.setText(x);

// collecting 
    }
    
    public static void main(String[] args) {
        code10 f = new code10();
        f.setSize(500,500);
        f.setVisible(true);
    }


}