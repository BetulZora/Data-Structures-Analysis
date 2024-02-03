package live_class_notes.week10_Sort.review_sort;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    /** TODO
     * This is a possible interview question so I need to solve this question from scratch a few times.
     */
    int size;
    int capacity;
    HashMap<Integer,DNode> cacheMap = new HashMap<>();
    DNode head;
    DNode tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.size=0;
        this.head = new DNode();
        this.tail = new DNode();
        // the head/tail will be dummy for ease of handling
        // to establish linked list, have to have connections between nodes
        head.next= tail;
        tail.prev= head;
    }

    // need methods for this Cache
    private void addNode(DNode node){
        node.prev = head;
        node.next= head.next;
        head.next.prev = node;
        head.next = node;
        // we will not look at capacity until we use put. the .addNode is only a helper method
    }

    public void removeNode(DNode node){
        DNode prevNode = node.prev;
        DNode nextNode = node.prev;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    public void moveToFirst(DNode node){
        removeNode(node);
        addNode(node);
    }

    public DNode popLast(){

        DNode popped = tail.prev;
        removeNode(popped);
        return popped;
    }

    public int get(int key){
        //Go and Check hashmap if you have the key
        DNode node = cacheMap.get(key);
        // return -1 if the key isn't there
        if (node ==null) return -1;
        else{
            moveToFirst(node); // since we are getting this item, it needs to move to recent
            return node.value;
        }
    }

    public void put(int key, int value){
        // check hashmap if you have the key
        DNode node = cacheMap.get(key);
        if(node == null) {
            DNode newNode = new DNode(key,value);
            cacheMap.put(key,newNode); // put in hashmap
            addNode(newNode); // put it in the linkedlist
            size++;
            if(size>capacity){
                DNode last = popLast(); // remove from the linkedList
                cacheMap.remove(last.key);
                size--;
            }
        }else {
            node.value=value;
            moveToFirst(node);
        }
    }

    void printLRU(){
        for(Map.Entry<Integer,DNode> entry: cacheMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    void printLinkedlist(){
        DNode curr = head;
        while (curr != tail) {
            if (curr.value != 0)
                System.out.println(curr.value);
        }
    }


}
