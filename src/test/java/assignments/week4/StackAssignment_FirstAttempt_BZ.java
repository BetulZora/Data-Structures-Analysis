package assignments.week4;

import java.util.*;

public class StackAssignment_FirstAttempt_BZ {

    /**
     * Problem:
     *      Given an array of buildings and directions that all the buildings face
     *      return an array of the indices of the buildings that can see the sunset (are west facing)
     *      A building can see the sunset if it's strictly taller than all the buildings that come after it in the direction
     *      input array named buildings contains positive, non-zero integers representing the heights of buildings
     *      building at index i has the height denoted by buildings[1]
     *      All buildings face the same direction, and this direction is either east or west, denoted by the input string named direction
     *      direction will always be EAST or WEST
     *      In relation to the input array, you can interpret these directions as right for east, left for west
     *      note: the indices in the output array should be sorted in ascending order.
     */

    public static int[] canSeeSunset(int[] buildings, String direction){

        Stack<Map<String, Integer>> linedInDirection = new Stack<>();

        if(direction.equals("EAST")){
            for (int i = 0; i < buildings.length; i++) {
                Map<String, Integer> nextItem = new HashMap<>();
                nextItem.put("height", buildings[i]);
                nextItem.put("index", i);
                linedInDirection.push(nextItem);
            }
        }
        if(direction.equals("WEST")){

            for (int i = (buildings.length-1); i >= 0; i--) {
                Map<String, Integer> nextItem = new HashMap<>();
                nextItem.put("height", buildings[i]);
                nextItem.put("index", i);
                linedInDirection.push(nextItem);
            }
        }

        System.out.println("linedInDirection = " + linedInDirection);
        LinkedList<Integer> canSeeIt = new LinkedList<>();
        int maxHeight = 0;

        while (!(linedInDirection.isEmpty())){

            Map<String,Integer> next = linedInDirection.pop();
            if (next.get("height")>maxHeight){
                canSeeIt.add(next.get("index"));
                maxHeight = next.get("height");
            }
        }
        Collections.sort(canSeeIt);
        int[] newArray = new int[canSeeIt.size()];
        for (int i = 0; i < canSeeIt.size(); i++) {
            newArray[i] = canSeeIt.get(i);
        }




        return newArray;


    }

    public static void main(String[] args) {
        int[] buildings = {3,5,4,4,3,1,3,2};
        String direction = "WEST";
        System.out.println("canSeeSunset(buildings,direction) = " + Arrays.toString(canSeeSunset(buildings, direction)));

    }


}
