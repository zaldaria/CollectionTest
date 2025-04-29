package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {
    private static final int ITERATION_COUNT = 10000;
    public CollectionTest(){ }
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        long arrayListAddTime = addEnd(arrayList);
        long arrayListGetTime = getFirst(arrayList);
        long arrayListDeleteTime = deleteFirst(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        long linkedListAddTime = addEnd(linkedList);
        long linkedListGetTime = getFirst(linkedList);
        long linkedListDeleteTime = deleteFirst(linkedList);

        printResults(arrayListAddTime, arrayListGetTime, arrayListDeleteTime, linkedListAddTime, linkedListGetTime, linkedListDeleteTime);

    }

    public static void fill(List<Integer> list) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.add(i);
        }
    }

    public static long addFirst(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.addFirst(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long addMiddle(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.add(list.size() / 2, i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long addEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getFirst(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            Integer i1 = list.getFirst();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getMiddle(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            Integer i1 = list.get(list.size() / 2);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            Integer i1 = list.getLast();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long deleteFirst(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.removeFirst();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long deleteMiddle(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long deleteEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.removeLast();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void printResults(long addTime1, long getTime1, long deleteTime1, long addTime2, long getTime2, long deleteTime2) {
        System.out.println("+------------+------------+--------------------------+---------------------------+");
        System.out.println("| Operation  | Iterations | ArrayList time (nanosec) | LinkedList time (nanosec) |");
        System.out.println("+------------+------------+--------------------------+---------------------------+");
        System.out.printf("| %-10s | %-10d | %-24d | %-25d |\n", "add", ITERATION_COUNT, addTime1, addTime2);
        System.out.printf("| %-10s | %-10d | %-24d | %-25d |\n", "get", ITERATION_COUNT, getTime1, getTime2);
        System.out.printf("| %-10s | %-10d | %-24d | %-25d |\n", "delete", ITERATION_COUNT, deleteTime1, deleteTime2);
        System.out.println("+------------+------------+--------------------------+---------------------------+");
    }
}