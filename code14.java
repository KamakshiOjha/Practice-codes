import java.lang.Thread;
// same can be done with THREAD in place of runnable
class Demo implements Runnable{

    public void run(){
        for(int i = 0;i<5;i++){

            try {
         
                System.out.println("i m sleeping");
                Thread.sleep(10000);

           }catch(InterruptedException e){
            System.out.println("i m sleeping2");

               System.out.println(e);
           }
           System.out.println(i+"run");
        }
    }
}


public class code14 {
    public static void main(String[] args) {
        Thread obj = new Thread(new Demo());
        obj.start();
        Thread obj1 = new Thread(new Demo());
        try{obj.join();}
        catch(InterruptedException e){
            System.out.println(e);
        }

        obj1.start();

    }
    
}
