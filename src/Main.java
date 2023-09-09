import arrayList.*;
import hashMap.*;
import linkedList.*;
import queue.*;
import stack.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> myIntegerArrayList = new MyArrayList<>();

        //add method check
        System.out.println("add method check");
        myIntegerArrayList.add(23);
        myIntegerArrayList.add(25);
        myIntegerArrayList.add(28);
        myIntegerArrayList.add(46);
        myIntegerArrayList.add(45);
        myIntegerArrayList.add(74);
        myIntegerArrayList.add(25);
        myIntegerArrayList.add(59);
        myIntegerArrayList.add(70);
        myIntegerArrayList.add(58);
        myIntegerArrayList.add(90);
        myIntegerArrayList.add(67);
        System.out.println("get element from index 0 = " + myIntegerArrayList.get(0));
        System.out.println("get element from index 1 = " + myIntegerArrayList.get(1));
        System.out.println("get element from index 2 = " + myIntegerArrayList.get(2));
        System.out.println("get element from index 11 = " + myIntegerArrayList.get(11));


        //size method check
        System.out.println("\nsize method check");
        System.out.println("get myIntegerArrayList size = " + myIntegerArrayList.size());


        //clear method check
        System.out.println("\nclear method check");
        myIntegerArrayList.clear();
        System.out.println("get myIntegerArrayList size = " + myIntegerArrayList.size());
//        System.out.println("get element from index " + myIntegerArrayList.get(0));  //use after clear() to check this method

        MyArrayList<String> myStringArrayList = new MyArrayList<>();

        //remove method check
        System.out.println("\nremove method check");
        myStringArrayList.add("Sun");
        myStringArrayList.add("Mercury");
        myStringArrayList.add("Vines");
        myStringArrayList.add("Earth");
        myStringArrayList.add("Mars");
        myStringArrayList.add("Jupiter");
        getFirstFourItem(myStringArrayList);
        System.out.println("get element from index 5 = " + myStringArrayList.get(5));

        System.out.println();
        myStringArrayList.remove(1);
        getFirstFourItem(myStringArrayList);

//-----------------------------------------------LinkedList---------------------------------------------------------------
        System.out.println();

        MyLinkedList<Integer> myIntegerLinkedList = new MyLinkedList<>();

        addElementsToLinkedList(myIntegerLinkedList);

        System.out.println("get element from index 3 = " + myIntegerLinkedList.get(3));
        System.out.println("get size = " + myIntegerLinkedList.size());
        myIntegerLinkedList.clear();
//        System.out.println("get element from index 0 = " + myIntegerLinkedList.get(0));  //use after clear() to check this method
        System.out.println("get size = " + myIntegerLinkedList.size());

        addElementsToLinkedList(myIntegerLinkedList);
        System.out.println("\nremove method check");
        System.out.println("get element from index 1 before remove = " + myIntegerLinkedList.get(1));
        myIntegerLinkedList.remove(1);
        System.out.println("get element from index 1 after remove = " + myIntegerLinkedList.get(1));

//-----------------------------------------------MyQueueList---------------------------------------------------------------
        System.out.println();

        MyQueueList<Integer> myIntegerQueueList = new MyQueueList<>();

        //add method check
        System.out.println("add method check");
        myIntegerQueueList.add(23);
        myIntegerQueueList.add(25);
        myIntegerQueueList.add(28);
        myIntegerQueueList.add(46);
        myIntegerQueueList.add(45);
        myIntegerQueueList.add(74);
        myIntegerQueueList.add(25);
        myIntegerQueueList.add(59);
        myIntegerQueueList.add(70);
        myIntegerQueueList.add(58);
        myIntegerQueueList.add(90);
        myIntegerQueueList.add(67);
        System.out.println("get element from index 0 = " + myIntegerQueueList.get(0));
        System.out.println("get element from index 1 = " + myIntegerQueueList.get(1));
        System.out.println("get element from index 2 = " + myIntegerQueueList.get(2));
        System.out.println("get element from index 11 = " + myIntegerQueueList.get(11));


        //size method check
        System.out.println("\nsize method check");
        System.out.println("get myIntegerQueueList size = " + myIntegerQueueList.size());


        //peek method check
        System.out.println("\npeek method check");
        System.out.println("return first element in queue = " + myIntegerQueueList.peek());


        //poll method check
        System.out.println("\npoll method check");
        System.out.println("get element from index 0 = " + myIntegerQueueList.get(0));
        System.out.println("check size before poll = " + myIntegerQueueList.size());
        System.out.println("return first element in queue and delete = " + myIntegerQueueList.poll());
        System.out.println("check size after poll = " + myIntegerQueueList.size());
        System.out.println();
        System.out.println("get element from index 0 = " + myIntegerQueueList.get(0));
        System.out.println("check size before poll = " + myIntegerQueueList.size());
        System.out.println("return first element in queue and delete = " + myIntegerQueueList.poll());
        System.out.println("check size after poll = " + myIntegerQueueList.size());
        System.out.println();
        System.out.println("get element from index 0 = " + myIntegerQueueList.get(0));


        //clear method check
        System.out.println("\nclear method check");
        myIntegerQueueList.clear();
        System.out.println("get myIntegerQueueList size = " + myIntegerQueueList.size());
//        System.out.println("get element from index " + myIntegerQueueList.get(0));  //use after clear() to check this method


//-----------------------------------------------MyStackList---------------------------------------------------------------
        System.out.println();

        MyStackList<Integer> myIntegerStackList = new MyStackList<>();

        //add method check
        System.out.println("add method check");
        myIntegerStackList.push(23);
        myIntegerStackList.push(25);
        myIntegerStackList.push(28);
        myIntegerStackList.push(46);
        myIntegerStackList.push(45);
        myIntegerStackList.push(74);
        myIntegerStackList.push(25);
        myIntegerStackList.push(59);
        myIntegerStackList.push(70);
        myIntegerStackList.push(58);
        myIntegerStackList.push(90);
        myIntegerStackList.push(67);
        System.out.println("get element from index 0 = " + myIntegerStackList.get(0));
        System.out.println("get element from index 1 = " + myIntegerStackList.get(1));
        System.out.println("get element from index 2 = " + myIntegerStackList.get(2));
        System.out.println("get element from index 11 = " + myIntegerStackList.get(11));


        //size method check
        System.out.println("\nsize method check");
        System.out.println("get myIntegerStackList size = " + myIntegerStackList.size());


        //peek method check
        System.out.println("\npeek method check");
        System.out.println("return first element in stack = " + myIntegerStackList.peek());


        //pop method check
        System.out.println("\npop method check");
        getLastElementFromStack(myIntegerStackList);
        getLastElementFromStack(myIntegerStackList);
        System.out.println("get element from last index = " + myIntegerStackList.get(myIntegerStackList.size() - 1));


        //clear method check
        System.out.println("\nclear method check");
        myIntegerStackList.clear();
        System.out.println("get myIntegerStackList size = " + myIntegerStackList.size());
//        System.out.println("get element from index " + myIntegerStackList.get(0));  //use after clear() to check this method
        System.out.println();


//-----------------------------------------------MyHashMap---------------------------------------------------------------

        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();

        myHashMap.put(1, "Vasya");
        myHashMap.put(2, "Alex");
        myHashMap.put(3, "Ksy");
        System.out.println("check myHashMap size " + myHashMap.size());

        System.out.println();
        System.out.println("check myHashMap get " + myHashMap.get(3));

        System.out.println();
        System.out.println("check myHashMap remove " + myHashMap.remove(3));
        System.out.println("check myHashMap get " + myHashMap.get(3));

        myHashMap.clear();

        System.out.println();
        System.out.println("check myHashMap after clear method");
        System.out.println("check myHashMap get " + myHashMap.get(1));
        System.out.println("check myHashMap get " + myHashMap.get(2));
        System.out.println("check myHashMap get " + myHashMap.get(3));

    }

    private static void getLastElementFromStack(final MyStackList<Integer> myIntegerStackList) {
        System.out.println("get element from last index = " + myIntegerStackList.get(myIntegerStackList.size() - 1));
        System.out.println("check size before pop = " + myIntegerStackList.size());
        System.out.println("return first element in stack and delete = " + myIntegerStackList.pop());
        System.out.println("check size after pop = " + myIntegerStackList.size());
        System.out.println();
    }

    private static void addElementsToLinkedList(final MyLinkedList<Integer> myIntegerLinkedList) {
        myIntegerLinkedList.add(23);
        myIntegerLinkedList.add(34);
        myIntegerLinkedList.add(57);
        myIntegerLinkedList.add(876);
        myIntegerLinkedList.add(456);
        myIntegerLinkedList.add(78);
    }

    private static void getFirstFourItem(final MyArrayList<String> myStringArrayList) {
        System.out.println("get element from index 0 = " + myStringArrayList.get(0));
        System.out.println("get element from index 1 = " + myStringArrayList.get(1));
        System.out.println("get element from index 2 = " + myStringArrayList.get(2));
        System.out.println("get element from index 3 = " + myStringArrayList.get(3));
        System.out.println("get element from index 4 = " + myStringArrayList.get(4));
    }
}
