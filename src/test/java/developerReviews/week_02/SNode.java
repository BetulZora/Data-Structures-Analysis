package developerReviews.week_02;

public class SNode<T>{

    T value;
    SNode<T> next;
    SNode<T> previous;

    public SNode(T value) {
        this.value = value;
    }
}