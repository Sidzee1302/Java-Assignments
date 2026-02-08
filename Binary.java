//Using the Built in methods

// public class Binary {
//     public static void main(String[] args){
//         int Number=9;
//         String Binaryno="1001";
//         String Binarynew=Integer.toBinaryString(Number);
//         System.out.println(Binarynew);
//         int newnum=Integer.parseInt(Binaryno,2);
//         System.out.println(newnum);
//     }
    
// }

public class Binary
{
    public static void main(String[] args) {
        int number=10;
        String binary="";
        while(number>0){
            binary=(number%2)+binary;
            number=number/2;
        }
        System.out.println(binary);
    
    
    }
}