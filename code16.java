import java.lang.Thread;
// //Bank System//
// class Bank{
//     int amount = 500;
//     synchronized public void withdraw(int money){
//         if(money>amount){
//             try{
//                 wait();
//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }
//         }
//         amount = amount-money;
//         System.out.println("amount after withraw"+amount);
//     }
//     synchronized public void deposit(int money){
//         amount = amount + money;
//         notify();
//         System.out.println("amount after deposite"+amount);
//     }

// }

// class A1 extends Thread{
//     Bank b1;
//     A1(Bank b){
//         b1=b;
//     }
//     public void run(){
//         b1.withdraw(1000);

//     }
// }
// class D1 extends Thread{
//     Bank b2;
//     D1(Bank b){
//         b2=b;
//     }
//     public void run(){
//         b2.deposit(600);

//     }
// }


// public class code16 {
//     public static void main(String[] args) {
//         Bank obj = new Bank();
//         A1 obj1 = new A1(obj);
//         D1 obj2 = new D1(obj);
//         obj1.start();
//         obj2.start();
//     }
// }

class Customer{
    int amount = 500;
    synchronized public void withdraw(int money){
        if(amount<money){
            try{
                wait();
            }catch(InterruptedException e ){
                System.out.println(e);
            }
            amount = amount - money;
            System.out.println(amount);

        }

    }
    synchronized public void deposit(int money){
        amount = amount+money;
        System.out.println(amount);
        notify();

    }
}

class A extends Thread{
    Customer c1;
    A(Customer c){
        c1= c;
    }
    public void run(){
        c1.withdraw(1000);
    }

}

class B extends Thread{
    Customer c2;
    B(Customer c){
        c2= c;
    }
    public void run(){
        c2.deposit(1000);
    }
    

}

public class code16{
    public static void main(String[] args) {
        Customer obj = new Customer();
        A obj1 = new A(obj);
        B obj2 = new B(obj);
        obj1.start();
        obj2.start();

    }
}