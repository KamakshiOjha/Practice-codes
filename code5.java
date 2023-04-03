package file1;
import java.util.LinkedList;
public class code5 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        LinkedList<Integer> l3 = new LinkedList<Integer>();
        l3.add(l1.get(0)+l2.get(0));
        l3.add(l1.get(1)+l2.get(1));
        l3.add(l1.get(2)+l2.get(2));
        System.out.println(l3);
    }}