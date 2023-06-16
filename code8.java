import java.awt.*;
import java.awt.event.*;

public class code8 extends Frame implements ActionListener{
    TextField t1,t2;
    Label l1,l2;
    Button b,b2;

    code8(){

        super("YOUR DETAILS");

        l1= new Label("your name");
        l2= new Label("your enrollementId");

        t1 = new TextField(10);
        t2 = new TextField(10);
        
        b = new Button("submit");
        b2 = new Button("reset");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(b2);
        b.addActionListener(this);
        b2.addActionListener(this);



    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b){
            String temp = t1.getText();
            t1.setText(t2.getText());
            t2.setText(temp);
        }
        else if(ae.getSource() == b2){
            String temp = "null";
            t1.setText(temp);
            t2.setText(temp);

        }
        

    }


    public static void main(String[] args) {
        code8 f = new code8();
        f.setSize(500,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

    }
    
}

/*
In the above code, this refers to the current instance of the code8 class, which implements the ActionListener interface.

The addActionListener() method of the Button class expects an object that implements the 
ActionListener interface. When you call b.addActionListener(this), you are registering the current instance
 of the code8 class as a listener to the Button component b.

When the user clicks the Button, an ActionEvent is generated and the actionPerformed()
 method of the registered listener is called. In this case, the actionPerformed() method is implemented
  in the code8 class, so it will be called when the Button is clicked. */