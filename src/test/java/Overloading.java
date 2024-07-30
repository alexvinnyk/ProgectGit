public class Overloading {
    public static void main(String[] args) {
        int sum1 = sum(1, 5);
        System.out.println("sum1 = " + sum1);
    }

public static int sum (int a,int b){
  return a+b;
}
public static int sum(int a,int b,int c){
        return a+b+c;
}



}
