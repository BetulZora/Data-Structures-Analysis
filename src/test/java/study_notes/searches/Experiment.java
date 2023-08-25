package study_notes.searches;

public class Experiment {

    public static void main(String[] args) {

        long[] array = new long[1000001];

        for (int i =0; i <array.length; i++){
            array[i] = i;
        }

        long search = 333333;

    }

    public static long[] linearSearch(int[] array, int data){
        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparison=0;
        for (int i = 0; i < array.length ; i++) {
            comparison++;
            if(array[i]==data) {
                result[0] = System.currentTimeMillis()-startTime;
                result[1] = comparison;
                return result;
            }
        }
        return result;
    }



}
