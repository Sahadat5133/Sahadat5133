public class main {
    public static void main(String[] args) {
        int a;
        a=10;
        int sum=0;
        for(int i=0;i<a;i++){
            System.out.println(i);
            sum=sum+i;
        }   
        System.out.println("Summation:" +sum);

        int[] myArray={6,8,9,1,4,7};
        for(int i=0;i<myArray;i++){
            System.out.println(myArray[i]);
        }
}
}
