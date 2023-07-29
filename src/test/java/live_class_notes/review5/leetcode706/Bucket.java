package live_class_notes.review5.leetcode706;

import java.util.LinkedList;

public class Bucket {

    // a linked list of KeyValues

    LinkedList <KeyValue<Integer,Integer>> bucket;

    public Bucket() {
        this.bucket = new LinkedList<KeyValue<Integer,Integer>>();
    }

    public int get(int key){
        for (KeyValue<Integer,Integer> pair:
             bucket) {
            if (pair.key.equals(key)) {
                return pair.value;
            }

        }
        return -1;
    }

    public void remove(int key){
        for (KeyValue<Integer,Integer> pair:
                bucket) {
            if(pair.key.equals(key)) {
                this.bucket.remove(pair);
                break;}

        }
    }

    public void update(int key, int value){
        // part1: if Key exists, then update the value
        // search for Key
        boolean found=false; // assume false until assigning true
        for (KeyValue<Integer,Integer> pair: bucket){
            if(pair.key.equals(key)){
                pair.value = value;
                found = true;
            }
        }
        // part2: if Key is not there, then create entry
        if(!found) this.bucket.add(new KeyValue<>(key,value));

    }
}
