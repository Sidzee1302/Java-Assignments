class Numberbox{
    int a,b,result;
    int add(int a,int b){
        result=a+b;
        return result;
    }
    void display(){
        System.out.println(result);
    }
    public static void main(String[] args) {
        Numberbox s1=new Numberbox();
        s1.add(2,4);
        s1.display();

        
    }
}