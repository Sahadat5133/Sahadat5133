public class stringbuilder {
    public static void main(String[] args) {
       // StringBuilder sb = new StringBuilder("Sahadat");
        /*System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'p');
        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);
        sb.delete(1,2);
        System.out.println(sb);
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());*/

        StringBuilder sb = new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i; 
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
       
           

        
    }
   
}
