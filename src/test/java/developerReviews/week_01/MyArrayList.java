package developerReviews.week_01;

import java.util.Arrays;

public class MyArrayList {

    // define an array as the basis of the list
    int[] numbers;
    int size; // will store the amount of used indeces

    // when it is created, it will be made with 10 and then will grow
    public MyArrayList(){
        numbers = new int[10];
        this.size = 0;
    }

    public MyArrayList(int capacity){ // this constructor will be used in the grow function
        this.numbers = new int[capacity];
        this.size = 0;
    }

    int[] grow(){
      //  int[] newArray = new int[numbers.length*2];//grow doubles the capacity of array
      //  for (int i= 0; i< numbers.length; i++){
      //      newArray[i] = numbers[i];
      //  }
      //  numbers=newArray;
      //  return numbers;

        // the Arrays.copyOf takes old Array and size of new array
        return Arrays.copyOf(numbers, numbers.length*2);

    }

    void add(int value){
        if (size>= (int) numbers.length*0.75){
            //grow if more than 75% full
            System.out.println("Before adding " + value + " size was " + numbers.length);
            numbers = grow();
            System.out.println("Size has grown to "+numbers.length);
        }
        numbers[size++]=value;
    }





}
