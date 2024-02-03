package developerReviews.week_02;

public class GenericStackTest {
    public static void main(String[] args) {
        GStack<Integer> mystack = new GStack<>();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(3);
        mystack.push(3);
        mystack.push(3);
        mystack.print();

    }
}
