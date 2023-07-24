package live_class_notes.review5.leetcode706;

import java.util.List;

public class MyHashMap {

    public List<Bucket> hashMap;
    // use 2341 as prime number
    public int modNumber;




    public MyHashMap() {
        // at creation assign modNumber to 2341 and create hashMap
        this.modNumber = 2341;
        // all buckets in ArrayList are empty
        for (int i = 0; i < modNumber; i++) {
            this.hashMap.add(new Bucket());
            // creates new bucket in my list
        }

    }

    public void put(int key, int value) {
        // use modulus to find index address
        int hashCode = key%modNumber; // this will give us an index of our list
      //  this.hashMap.get(hashCode).update(key,value);

    }

    public int get(int key) {
        return 0;
    }

    public void remove(int key) {

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
