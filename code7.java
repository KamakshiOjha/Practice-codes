
import java.awt.*;

public class code7 {
    public static void main(String[] args) {
        List l = new List();
        l.add("C");
        l.add("C++");
        l.add("PYTHON");
        l.setMultipleMode(true);
        Frame f = new Frame("My Frame");
        f.setBackground(Color.GRAY);
        f.setSize(1000, 800);
        f.setLayout(null);
        l.setBounds(40,300, 150, 60);

        Label l1 = new Label("First:");
        l1.setBounds(100, 100, 50, 20);
        Label l2 = new Label("Second:");
        l2.setBounds(100, 150, 50, 20);

        TextField t1 = new TextField("Enter value 1");
        t1.setBounds(160, 100, 150, 20);
        TextField t2 = new TextField("Enter value 2");
        t2.setBounds(160, 150, 150, 20);

        Button b1 = new Button("Submit");
        b1.setBounds(400, 200, 80, 20);
        
        Checkbox c1 = new Checkbox("C");
        c1.setBounds(0, 300, 20, 20);
        Checkbox c2 = new Checkbox("C++");
        c2.setBounds(0, 320, 20, 20);
        Checkbox c3 = new Checkbox("PYTHON");
        c3.setBounds(0, 340, 20, 20);
        
        TextField tx = new TextField();
        tx.setBounds(200, 200, 100, 20);
        MenuBar m = new MenuBar();
        Menu file = new Menu("file");
        Menu course = new Menu("course");
        MenuItem New = new MenuItem("new");
        MenuItem now = new MenuItem("now");
        MenuItem old = new MenuItem("old");
        MenuItem other = new MenuItem("other");
        file.add(New);
        file.add(now);
        file.add(old);
        course.add(other);
        file.add(course);
        m.add(file);
        f.setMenuBar(m);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(l);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(tx);
        f.setVisible(true);
    }
}
