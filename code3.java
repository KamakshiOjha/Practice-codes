package file1;
import java.util.Arrays;
// public class code3 {
//     public static void main(String[] args){
//                 int x= sum(5,3);
//                 System.out.println(x);
//             }
//             static int sum(int a, int b){
//                 // int a;
//                 // int b;
//                 int sum=a+b;
//                 return sum;
//             }
//         }
        

        // public class code3 {
        //     public static void main(String[] args){
        //         for (int i=0;i<5;i++){
        //             greet("hello how are you!");
        //         }
                
        //     }
        //     static void greet(String Greet){
        //         System.out.println(Greet);
        //     }

        //         }
                
// public class code3{
//     public static void main(String[] args) {
//         int a = 2;
//         int b = 3;
//         swap(a,b);
//          System.out.println(a +" " + b );
//     }
//     static void swap(int a, int b){
//         int temp = a;
//         a=b;
//         b=temp;
//         System.out.println(a +" " + b );
//     }
// }

public class code3{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] array){
        array[5]=99;
    }
}