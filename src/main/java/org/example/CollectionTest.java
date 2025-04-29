package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс для тестирования производительности ArrayList и LinkedList.
 * Сравнивает время выполнения основных операций: добавление, получение и удаление элементов.
 */
public class CollectionTest {
    private static final int ITERATION_COUNT = 10000;

    /**
     * Конструктор по умолчанию.
     */
    public CollectionTest() {
    }

    /**
     * Основной метод для запуска тестов и вывода результатов.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        long arrayListAddFirstTime = addFirst(arrayList);
        long arrayListAddMiddleTime = addMiddle(arrayList);
        long arrayListAddEndTime = addEnd(arrayList);
        long arrayListGetFirstTime = getFirst(arrayList);
        long arrayListGetMiddleTime = getMiddle(arrayList);
        long arrayListGetEndTime = getEnd(arrayList);
        long arrayListDeleteFirstTime = deleteFirst(arrayList);
        long arrayListDeleteMiddleTime = deleteMiddle(arrayList);
        long arrayListDeleteEndTime = deleteEnd(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        long linkedListAddFirstTime = addFirst(linkedList);
        long linkedListAddMiddleTime = addMiddle(linkedList);
        long linkedListAddEndTime = addEnd(linkedList);
        long linkedListGetFirstTime = getFirst(linkedList);
        long linkedListGetMiddleTime = getMiddle(linkedList);
        long linkedListGetEndTime = getEnd(linkedList);
        long linkedListDeleteFirstTime = deleteFirst(linkedList);
        long linkedListDeleteMiddleTime = deleteMiddle(linkedList);
        long linkedListDeleteEndTime = deleteEnd(linkedList);

        printResults(arrayListAddFirstTime, arrayListAddMiddleTime, arrayListAddEndTime,
                arrayListGetFirstTime, arrayListGetMiddleTime, arrayListGetEndTime,
                arrayListDeleteFirstTime, arrayListDeleteMiddleTime, arrayListDeleteEndTime,
                linkedListAddFirstTime, linkedListAddMiddleTime, linkedListAddEndTime,
                linkedListGetFirstTime, linkedListGetMiddleTime, linkedListGetEndTime,
                linkedListDeleteFirstTime, linkedListDeleteMiddleTime, linkedListDeleteEndTime);
    }

    /**
     * Заполняет список целыми числами от 0 до ITERATION_COUNT - 1.
     *
     * @param list список для заполнения
     */
    public static void fill(List<Integer> list) {
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.add(i);
        }
    }

    /**
     * Измеряет время добавления элементов в начало списка.
     *
     * @param list список, в который добавляются элементы
     * @return время выполнения в наносекундах
     */
    public static long addFirst(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.addFirst(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Измеряет время добавления элементов в середину списка.
     *
     * @param list список, в который добавляются элементы
     * @return время выполнения в наносекундах
     */
    public static long addMiddle(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.add(list.size() / 2, i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Измеряет время добавления элементов в конец списка.
     *
     * @param list список, в который добавляются элементы
     * @return время выполнения в наносекундах
     */
    public static long addEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Измеряет время получения первого элемента списка.
     *
     * @param list список, из которого получаются элементы
     * @return время выполнения в наносекундах
     */
    public static long getFirst(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            Integer i1 = list.getFirst();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Измеряет время получения элемента из середины списка.
     *
     * @param list список, из которого получаются элементы
     * @return время выполнения в наносекундах
     */
    public static long getMiddle(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            Integer i1 = list.get(list.size() / 2);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Измеряет время получения последнего элемента списка.
     *
     * @param list список, из которого получаются элементы
     * @return время выполнения в наносекундах
     */
    public static long getEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            Integer i1 = list.getLast();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Измеряет время удаления первого элемента списка.
     *
     * @param list список, из которого удаляются элементы
     * @return время выполнения в наносекундах
     */
    public static long deleteFirst(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.removeFirst();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Измеряет время удаления элемента из середины списка.
     *
     * @param list список, из которого удаляются элементы
     * @return время выполнения в наносекундах
     */
    public static long deleteMiddle(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Измеряет время удаления последнего элемента списка.
     *
     * @param list список, из которого удаляются элементы
     * @return время выполнения в наносекундах
     */
    public static long deleteEnd(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.removeLast();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Выводит результаты тестирования в виде таблицы.
     *
     * @param addFirstTime1    время добавления элемента в начало в ArrayList
     * @param addMiddleTime1    время добавления в середину ArrayList
     * @param addEndTime1    время добавления в конец ArrayList
     *                       
     * @param getFirstTime1    время получения первого элемента из ArrayList
     * @param getMiddleTime1    время получения элемента из середины ArrayList
     * @param getEndTime1    время получения элемента c конца ArrayList
     *                       
     * @param deleteFirstTime1 время удаления первого элемента из ArrayList
     * @param deleteMiddleTime1 время удаления элемента из середины ArrayList
     * @param deleteEndTime1 время удаления последнего элемента из ArrayList
     *
     * @param addFirstTime2    время добавления элемента в начало в LinkedList
     * @param addMiddleTime2    время добавления в середину LinkedList
     * @param addEndTime2    время добавления в конец LinkedList
     *
     * @param getFirstTime2    время получения первого элемента из LinkedList
     * @param getMiddleTime2    время получения элемента из середины LinkedList
     * @param getEndTime2    время получения элемента c конца LinkedList
     *
     * @param deleteFirstTime2 время удаления первого элемента из LinkedList
     * @param deleteMiddleTime2 время удаления элемента из середины LinkedList
     * @param deleteEndTime2 время удаления последнего элемента из LinkedList
     */
    public static void printResults(long addFirstTime1, long addMiddleTime1, long addEndTime1, long getFirstTime1, long getMiddleTime1, long getEndTime1, long deleteFirstTime1, long deleteMiddleTime1, long deleteEndTime1, long addFirstTime2, long addMiddleTime2, long addEndTime2, long getFirstTime2, long getMiddleTime2, long getEndTime2, long deleteFirstTime2, long deleteMiddleTime2, long deleteEndTime2) {
        System.out.println("+----------------+------------+--------------------------+---------------------------+");
        System.out.println("| Operation      | Iterations | ArrayList time (nanosec) | LinkedList time (nanosec) |");
        System.out.println("+----------------+------------+--------------------------+---------------------------+");
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "add first", ITERATION_COUNT, addFirstTime1, addFirstTime2);
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "add middle", ITERATION_COUNT, addMiddleTime1, addMiddleTime2);
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "add end", ITERATION_COUNT, addEndTime1, addEndTime2);
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "get first", ITERATION_COUNT, getFirstTime1, getFirstTime2);
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "get middle", ITERATION_COUNT, getMiddleTime1, getMiddleTime2);
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "get end", ITERATION_COUNT, getEndTime1, getEndTime2);
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "delete first", ITERATION_COUNT, deleteFirstTime1, deleteFirstTime2);
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "delete middle", ITERATION_COUNT, deleteMiddleTime1, deleteMiddleTime2);
        System.out.printf("| %-14s | %-10d | %-24d | %-25d |\n", "delete end", ITERATION_COUNT, deleteEndTime1, deleteEndTime2);
        System.out.println("+----------------+------------+--------------------------+---------------------------+");
    }
}