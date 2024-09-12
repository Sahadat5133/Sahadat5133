public class loop {
    public static void main(String[] args) {
    String myName=new String("Sahadat");

    if (myName.length()>15){
        System.out.println("Your name is too long");
    }
    else if(myName.length()<3){
        System.out.println("Your name is too short");
    }
    else{
        switch (myName.length()) {
            case 7:
                System.out.println("Your have a lucky name");
                break;
            case 12:
                System.out.println("Your have a 12 character name");
                break;
            case 13:
                System.out.println("Your have a 13 character name");
                break;
            case 14:
                System.out.println("Your have a quite long name");
                break;
            default:
                System.out.println("Your name is ok.");
                break;
        }
    }
    int myMarks = 55;
    if(myMarks >= 80){
         System.out.println("You got A+");
    }
    else if(myMarks < 80 && myMarks > 70){
        System.out.println("You got A");
    }
    else if(myMarks < 70 && myMarks > 60){
        System.out.println("You got A-");
    }
    else if(myMarks < 60 && myMarks > 50){
        System.out.println("You got B");
    }
    else if(myMarks < 50 && myMarks > 40){
        System.out.println("You got C");
    }
    else{
        System.out.println("You got F");
    }
    int a;
    a=30;
    if(a%2 == 0){
        System.out.println("a is even");
    }
    else{
        System.out.println("a is odd");
    }
}
}
