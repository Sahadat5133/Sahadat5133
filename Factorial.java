import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printFactorial(a);
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        printAverage(b,c,d);
        int n=sc.nextInt();
        sumOdd(n);
        int e = sc.nextInt();
        int f = sc.nextInt();
        greaterTwo(e, f);
        float r=sc.nextFloat();
        circumference(r);
    }
    public static void printFactorial(int n){
        int factorial=1;
          for(int i=n;i>=1;i--){
                 factorial *= i;
          }
          System.out.println(factorial);
          return;
    }
    public static void printAverage(float a,float b,float c){
        float average=(a+b+c)/3;
        System.out.println(average);
        return;
    }
    public static void sumOdd(int n) {
        int sum=0;
        for(int i=1;i<n;i+=2){
            sum += i;
        }
        System.out.println(sum);
     return;
         }

    public static void greaterTwo(int a,int b){
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
        return;
    }
    public static void circumference(float radius) {
        float pi=3.1416;
        float circumference=2*pi*radius;
        System.out.println(circumference);
        return;
        
    }
}
