import java.awt.*;
import java.awt.event.*;

public class code12 extends Frame implements MouseListener {
    Label l;

    code12() {
        super("My Frame");
        l = new Label();

        add(l);
        setLayout(new FlowLayout());
        l.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked At: " + e.getX() + ", " + e.getY());
    }

    // Implement the remaining methods of the MouseListener interface
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        code12 f = new code12();
        f.setSize(200, 200);
        f.setVisible(true);
    }
}


// public class code12 extends WindowAdapter{
//     Frame f;
//     code12(){   
//           f = new Frame();    
//          f.addWindowListener (this);    
         
//          f.setSize (400, 400);    
//          f.setLayout (null);    
//          f.setVisible (true);      
//  }
//  public void windowClosing (WindowEvent e) {    
//     f.dispose();    
// }  
//     public static void main(String[] args) {
//         code12 obj=new code12();
    
//     }
    
// }
 