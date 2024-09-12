import java.util.*;
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        printMyName(name);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a, b);
        System.out.println(sum);
        
    }
    public static void printMyName(String name){
         System.out.println(name);
         return;
    }
    public static int calculateSum(int a,int b) {
        int sum = a + b;
        return sum;
    }
    public static int calculateproduct(int c,int d) {
        int multiply = a * b;
        return sum;
    }
}
