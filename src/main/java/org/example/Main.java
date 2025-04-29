package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int ITERATION_COUNT = 10000;
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        long arrayListAddTime = testAdd(arrayList);
        long arrayListGetTime = testGet(arrayList);
        long arrayListDeleteTime = testDelete(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        long linkedListAddTime = testAdd(linkedList);
        long linkedListGetTime = testGet(linkedList);
        long linkedListDeleteTime = testDelete(linkedList);

        printResults(arrayListAddTime, arrayListGetTime, arrayListDeleteTime, linkedListAddTime, linkedListGetTime, linkedListDeleteTime);

    }

    private static long testAdd(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static long testGet(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            Integer i1 = list.get(i % list.size());
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static long testDelete(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.removeFirst();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    private static void printResults(long addTime1, long getTime1, long deleteTime1, long addTime2, long getTime2, long deleteTime2) {
        System.out.println("+------------+------------+--------------------------+---------------------------+");
        System.out.println("| Operation  | Iterations | ArrayList time (nanosec) | LinkedList time (nanosec) |");
        System.out.println("+------------+------------+--------------------------+---------------------------+");
        System.out.printf("| %-10s | %-10d | %-24d | %-25d |\n", "add", ITERATION_COUNT, addTime1, addTime2);
        System.out.printf("| %-10s | %-10d | %-24d | %-25d |\n", "get", ITERATION_COUNT, getTime1, getTime2);
        System.out.printf("| %-10s | %-10d | %-24d | %-25d |\n", "delete", ITERATION_COUNT, deleteTime1, deleteTime2);
        System.out.println("+------------+------------+--------------------------+---------------------------+");
    }
}