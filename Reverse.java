public class Reverse {
    
    public static void main(String[] args) {
        String s="Siddhi";
        String reverse = "";
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
           reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
       }
}
git