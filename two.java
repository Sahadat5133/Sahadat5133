public class two {

    public static void main(String[] args) {
     String myName;
     myName = new String("Sahadat");
     prln("the name of character in your name is: "+ myName.length()) ;
     System.out.println(myName);
     prln(myName);
     int[] nameOfArray = new int[8];
     int[][] twoDArray = new int[2][4];
     twoDArray[0][0]=1;
     twoDArray[0][1]=2;
     twoDArray[0][2]=4;
     twoDArray[0][3]=5;

     twoDArray[1][0]=2;
     twoDArray[1][1]=4;
     twoDArray[1][2]=5;
     twoDArray[1][3]=9;
     prln(twoDArray[0][1]);
     if(myName.length() > 15){
        prln("Your name is to long");
     }
     else{
        prln("Your name is ok");
     }
    
}
static void prln(Object anyObject){
        System.out.println(anyObject);
}
static void pr(Object anyObject){
    System.out.print(anyObject);
}
}

