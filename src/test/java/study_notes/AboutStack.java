package study_notes;

import java.util.Stack;

public class AboutStack {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<>();

        String myString = "CYDEO";

        for (int i = 0; i < myString.length(); i++) {
            myStack.push(myString.charAt(i)+"");
        }

        String reversedString = "";
        while (!(myStack.isEmpty())){
            reversedString+=myStack.pop();
        }

        System.out.println(reversedString);

    }
}
