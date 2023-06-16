//--------------------------//
// SYNCHRONISATION PROBLEM
//--------------------------//
// import java.lang.Thread;

// class main{
//     public void fun(int n,String name){
//         for(int i=0;i<n;i++){
//             System.out.println("this is Thread for demo1"+name);
//         }
//     }
// }


// class A extends Thread{
//     main m1;
//     A(main m){
//          m1 = m;}
//          public void run(){
//             for(int i=0;i<5;i++){
//                 m1.fun(2,"komal");
//             }
//          }
        
//     }



// class D extends Thread{
//     main m2;
//     D(main m){
//         m2 = m;
//     }
//         public void run(){
//             for(int i=0;i<5;i++){
//                 m2.fun(2,"kamakshi");
//             }
//         }
        
//     }

// public class code15 {
//     public static void main(String[] args) {
//         main obj = new main();
//         A obj1 = new A(obj);
//         D obj2 = new D(obj);
//         obj1.start();
//         obj2.start();
        
//     }
// }
//-----------------//
// JOIN METHOD:
//-----------------//
// import java.lang.Thread;

// class main{
//     public  void fun(int n,String name){
//         for(int i=0;i<n;i++){
//             System.out.println("this is Thread for demo1"+name);
//         }
//     }
// }


// class A extends Thread{
//     main m1;
//     A(main m){
//          m1 = m;}
//          public void run(){
//             for(int i=0;i<5;i++){
//                 m1.fun(2,"komal");
//             }
//          }
        
//     }



// class D extends Thread{
//     main m2;
//     D(main m){
//         m2 = m;
//     }
//         public void run(){
//             for(int i=0;i<5;i++){
//                 m2.fun(2,"kamakshi");
//             }
//         }
        
//     }

// public class code15 {
//     public static void main(String[] args) {
//         main obj = new main();
//         A obj1 = new A(obj);
//         D obj2 = new D(obj);
//         obj1.start();
//         try{
//             obj1.join();
//         }
//         catch(Exception e){
//             System.out.println("exception");

//         }
//         obj2.start();
        
//     }
// }
//------------------------//
// SYNCHRONIZED METHOD:
//------------------------//
// import java.lang.Thread;

// class main{
//     public synchronized void fun(int n,String name){
//         for(int i=0;i<n;i++){
//             System.out.println("this is Thread for demo1"+name);
//         }
//     }
// }


// class A extends Thread{
//     main m1;
//     A(main m){
//          m1 = m;}
//          public void run(){
//             for(int i=0;i<5;i++){
//                 m1.fun(2,"komal");
//             }
//          }
        
//     }



// class D extends Thread{
//     main m2;
//     D(main m){
//         m2 = m;
//     }
//         public void run(){
//             for(int i=0;i<5;i++){
//                 m2.fun(2,"kamakshi");
//             }
//         }
        
//     }

// public class code15 {
//     public static void main(String[] args) {
//         main obj = new main();
//         A obj1 = new A(obj);
//         D obj2 = new D(obj);
//         obj1.start();
//         obj2.start();
        
//     }
// }

//------------------------//
//synchronized block
//------------------------//

// import java.lang.Thread;

// class main{
//     public void fun(int n,String name){
//         for(int i=0;i<n;i++){
//             System.out.println("this is Thread for demo1"+name);
//         }
//     }
// }


// class A extends Thread{
//     main m1;
//     A(main m){
//          m1 = m;}
//          public void run(){
//             synchronized(m1){
//                 m1.fun(2,"komal");
//             }
//          }
        
//     }



// class D extends Thread{
//     main m2;
//     D(main m){
//         m2 = m;
//     }
//         public void run(){
//             synchronized(m2){
//                 m2.fun(2,"kamakshi");
//             }
//         }
        
//     }

// public class code15 {
//     public static void main(String[] args) {
//         main obj = new main();
//         A obj1 = new A(obj);
//         D obj2 = new D(obj);
//         obj1.start();
//         obj2.start();
        
//     }
// }