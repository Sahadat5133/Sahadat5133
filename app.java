public class app {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int uniqueValue=9;
        int firstChoice=8;
        //Array
        int[] cards={1,4,7,45,34};
        System.out.println(cards[4]);
        System.out.println(cards[2]);
        char[] card={'1','2','3','4'};
        boolean statement=prokriya(uniqueValue,firstChoice);
        System.out.println(statement);
        int result=process(firstChoice);
        System.out.println(result);
    }
    static public boolean prokriya(int firstValue,int secondValue){
        boolean answer=firstValue>secondValue;
        return answer;
    }
    
    static public int process(int firstValue){
        firstValue *= 100;
        return firstValue;
    }
}
