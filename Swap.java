// public class Swap {
 
//     public static void main(String[] args) {
//         int a=2;
//         int b=5;
//         int c;
//         c=a;
//         a=b;
//         b=c;
//         System.out.println(a);
//         System.out.println(b);


//     }
    
// }
/////Without  Using third variable
/// 
public class Swap{
    public static void main(String[] args) {
        int a=2;
        int b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);   
    }
}