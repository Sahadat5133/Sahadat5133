import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Your name is:" + name);
        String firstName="Sahadat";
        String lastName="Hossain";
        String fullName=firstName + " " +lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        for(int i=0;i<fullName.length();i++) {
            System.err.println(fullName.charAt(i));
        }
        String name1="Tony";
        String name2="Tony";
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(name1 == name2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        String sentence="My name is sahadat";
        String name3=sentence.substring(11,sentence.length());
        System.out.println(name3);
    }
}
