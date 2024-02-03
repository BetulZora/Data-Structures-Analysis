package developerReviews.week_02;

public class CallTest {
    public static void main(String[] args) {
        System.out.println(aA());
        System.out.println("main completed");

    }
    static String aA(){
        System.out.println("A has started");
        bB();
        return "A Completed";
    }
    static void bB(){
        System.out.println("B visited");
        cC();
    }
    static void cC(){
        System.out.println("C visited");
    }
}