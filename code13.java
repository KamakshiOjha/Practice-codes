import java.awt.*;


public class code13 extends Frame {
    List l;
    Checkbox c;
    TextField t;

    code13(){
        super("my frame");
        l = new List();
        l.add("C");
        l.add("C++");
        l.add("#C");
        l.add("JAVA");
        l.add("PYTHON");

        t = new TextField("none");
        add(l);
        add(t);

        setLayout(new FlowLayout());

    }


    public static void main(String[] args) {
        code13 f = new code13();
        f.setVisible(true);
        f.setSize(400, 400);
    }
}
