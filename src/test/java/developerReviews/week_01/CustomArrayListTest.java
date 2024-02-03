package developerReviews.week_01;

public class CustomArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(5);

        for( int i= 1; i <=100; i++){
            list.add(i);
        }
    }
}
