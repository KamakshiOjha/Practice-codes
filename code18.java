import java.awt.GridBagLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

import javax.swing.undo.StateEdit;

// ----------------------
// for FLOW LAYOUT
// ----------------------
// public class code18 extends Frame {

//     Label l1,l2;
//     Button b1,b2,b3,b4;

//     code18(){
//         super("my practice");

//         FlowLayout f = new FlowLayout();
//         f.setAlignment(FlowLayout.RIGHT);
//         f.setHgap(40);
//         f.setVgap(50);
//         setLayout(f);
       
//         l1 = new Label("this is moved");
//         l2 = new Label("moved");
//         b1= new Button("B1");
//         b2= new Button("B2");
//         b3= new Button("B3");
//         b4= new Button("B4");

//         add(l1);
//         add(l2);
//         add(b1);
//         add(b2);
//         add(b3);
//         add(b4);

//         System.out.println(f.getHgap());
//         // setLayout(new FlowLayout(FlowLayout.LEFT,4,50));
//     }
// public static void main(String[] args) {
//     code18 c = new code18();
//     c.setVisible(true);
//     c.setSize(300,300);
// }
    
// }

// ----------------------
// for BORDER LAYOUT
// ----------------------

// public class code18 extends Frame{
//     Button b1, b2, b3, b4, b5, b6;

//     code18() {
        
//         b1 = new Button("B1");
//         b2 = new Button("B2");
//         b3 = new Button("B3");
//         b4 = new Button("B4");
//         b5 = new Button("B5");
//         b6 = new Button("B6");

//         BorderLayout b = new BorderLayout();
//         b.setHgap(10);
//         b.setVgap(20);

//         setLayout(b);
//         add(b1, BorderLayout.NORTH);
//         add(b2, BorderLayout.SOUTH);
//         add(b3, BorderLayout.EAST);
//         add(b4, BorderLayout.WEST);
//         add(b5, BorderLayout.CENTER);
//         add(b6, BorderLayout.CENTER);
//         remove(b5);
//         setSize(300,300);
//         setVisible(true);
//         System.out.println(getAlignmentX()+" "+getAlignmentY());
//     }

//     public static void main(String[] args) {
//         code18 c = new code18();
//     }
// }


// ----------------------
// for GRID LAYOUT
// ----------------------


// public class code18 extends Frame{
//     Button b1, b2, b3, b4, b5, b6;

//     code18() {
        
//         b1 = new Button("B1");
//         b2 = new Button("B2");
//         b3 = new Button("B3");
//         b4 = new Button("B4");
//         b5 = new Button("B5");
//         b6 = new Button("B6");

//         GridLayout b = new GridLayout();
//         b.setHgap(10);
//         b.setVgap(20);
//         b.setRows(3);
//         b.setColumns(2);

//         setLayout(b);
//         add(b1);
//         add(b2);
//         add(b3);
//         add(b4);
//         add(b5);
//         add(b6);
       
//         setSize(300,300);
//         setVisible(true);
//         System.out.println(getAlignmentX()+" "+getAlignmentY());
//     }

//     public static void main(String[] args) {
//         code18 c = new code18();
//     }
// }


// ----------------------
// for CARD LAYOUT
// ----------------------

// public class code18 extends Frame implements ActionListener {
//     Button b1, b2, b3, b4, b5, b6;
//     CardLayout b;

//     code18() {
//         b1 = new Button("B1");
//         b2 = new Button("B2");
//         b3 = new Button("B3");
//         b4 = new Button("B4");
//         b5 = new Button("B5");
//         b6 = new Button("B6");

//         b = new CardLayout();
//         b.setHgap(10);
//         b.setVgap(20);

//         setLayout(b);
//         add(b1);
//         add(b2);
//         add(b3);
//         add(b4);
//         add(b5);
//         add(b6);

//         b1.addActionListener(this);
//         b2.addActionListener(this);
//         b3.addActionListener(this);
//         b4.addActionListener(this);
//         b5.addActionListener(this);

//         setSize(300, 300);
//         setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         b.next(this);
//     }

//     public static void main(String[] args) {
//         code18 c = new code18();
//     }
// }


// ----------------------
// for GRIDBAG LAYOUT
// ----------------------


// public class code18 extends Frame{
//     Button b1, b2, b3, b4, b5, b6;
//     GridBagConstraints cx = new GridBagConstraints();

//     code18() {
//         GridBagLayout b = new GridBagLayout();
//         setLayout(b);

//         b1 = new Button("B1");
//         cx.gridx=0;
//         cx.gridy=0;
//         cx.gridwidth=1;
//         cx.gridheight=1;
//         add(b1,cx);

//         b2 = new Button("B2");
//         cx.gridx=1;
//         cx.gridy=0;
//         cx.gridwidth=1;
//         cx.gridheight=1;
//         add(b2,cx);
        
//         b3 = new Button("B3");
//         cx.gridx=2;
//         cx.gridy=0;
//         cx.gridwidth=1;
//         cx.gridheight=1;
//         add(b3,cx);

//         b4 = new Button("B4");
//         cx.gridx=3;
//         cx.gridy=0;
//         cx.gridwidth=1;
//         cx.gridheight=1;
//         cx.fill = GridBagConstraints.HORIZONTAL;
//         add(b4,cx);

//         b5 = new Button("B5");
//         cx.gridx=4;
//         cx.gridy=0;
//         cx.gridwidth=1;
//         cx.gridheight=1;
//         add(b5,cx);

//         b6 = new Button("B6");
//         cx.gridx=5;
//         cx.gridy=0;
//         // cx.gridwidth=1;
//         // cx.gridheight=1;
//         add(b6,cx);
       
//         setSize(300,300);
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         code18 c = new code18();
//     }
// }


// IMPORTANT PROGRAM 

 
public class code18 extends Frame implements ActionListener {
 
    Label l1, l2;
    Button b1;
    TextField t1, t2, t3;

    code18() {
        super("ID PASSWORD CHECK");
        setBackground(Color.PINK);

        GridLayout g = new GridLayout();
        g.setRows(3);
        g.setColumns(2);
        g.setHgap(10);
        g.setVgap(10);
        setLayout(g);
 
        l1 = new Label("ENTER USER NAME");
        l2 = new Label("ENTER PASSWORD");
        t1 = new TextField(15);
        t2 = new TextField(15);
        b1 = new Button("ENTER");
        t3 = new TextField("null", 15);
        t2.setEchoChar('*');
        t3.setBackground(Color.GRAY);
 
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(t3);
        b1.addActionListener(this);
        t2.setEditable(true);
        t3.setEditable(false);
 
        setVisible(true);
        setSize(400, 400);
 
    }
 
    public void actionPerformed(ActionEvent e) {
        String str1 = t1.getText();
        String str2 = t2.getText(); // Corrected from t1.getText()
        if (str1.equals("kamakshi") && str2.equals("komal")) {
            t3.setText("VALID");
        } else {
            t3.setText("INVALID");
        }
 
    }
 
    public static void main(String[] args) {
        code18 c = new code18();

    }
}


