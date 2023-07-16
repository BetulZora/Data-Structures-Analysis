package live_class_notes.review4;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> history, forwardStack;
    String currentPage;
    public BrowserHistory(String homepage) { // constructor
        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = homepage;
        // in the constructor, initialize all the variables.
    }

    public void visit(String url) {
        // push current to history
        // move new url to current
        // clear the forward Stack by creating a new one

        history.push(currentPage);
        currentPage = url;
        forwardStack = new ArrayDeque<>();
    }

    public String back(int steps) {
        // steps represent the number of back steps

        int stepNumber = steps;

        while(steps>0 && !history.isEmpty()){

            // push current url to forward
            // move the current page to the last page we were on.

            forwardStack.push(currentPage);
            currentPage = history.pop();
            steps--;
        }
        System.out.println("Back operation of "+ stepNumber + " brings " + currentPage + " as current page");
        return currentPage;
    }

    public String forward(int steps) {
        int stepNumber = steps;

        while(steps>0 && !forwardStack.isEmpty()){

            // push current url to back
            // move the current page to the last one saved in forward

            history.push(currentPage);
            currentPage = forwardStack.pop();
            steps--;
        }
        System.out.println("Forward operation of "+ stepNumber + " brings " + currentPage + " as current page");
        return currentPage;
    }



}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
