package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private List<Integer> arrayList;
    private List<Integer> linkedList;

    @BeforeEach
    void setUp() {
        arrayList = new ArrayList<Integer>();
        linkedList = new LinkedList<Integer>();
    }

    @Test
    void testAddFirst() {
        long arrayListTime = CollectionTest.addFirst(arrayList);
        long linkedListTime = CollectionTest.addFirst(linkedList);

        System.out.printf("AddFirst: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime < arrayListTime, "LinkedList должен быть быстрее при добавлении в начало");
    }

    @Test
    void testAddMiddle() {
        long arrayListTime = CollectionTest.addMiddle(arrayList);
        long linkedListTime = CollectionTest.addMiddle(linkedList);

        System.out.printf("AddMiddle: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime > arrayListTime, "ArrayList должен быть быстрее при добавлении в середину");
    }

    @Test
    void testAddLast() {
        long arrayListTime = CollectionTest.addEnd(arrayList);
        long linkedListTime = CollectionTest.addEnd(linkedList);

        System.out.printf("AddMiddle: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime > arrayListTime, "ArrayList должен быть быстрее при добавлении в конец");
    }

    @Test
    void testDeleteFirst() {
        CollectionTest.fill(arrayList);
        CollectionTest.fill(linkedList);

        long arrayListTime = CollectionTest.deleteFirst(arrayList);
        long linkedListTime = CollectionTest.deleteFirst(linkedList);

        System.out.printf("AddMiddle: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime < arrayListTime, "LinkedList должен быть быстрее при удалении с начала");
    }

    @Test
    void testDeleteMiddle() {
        CollectionTest.fill(arrayList);
        CollectionTest.fill(linkedList);

        long arrayListTime = CollectionTest.deleteMiddle(arrayList);
        long linkedListTime = CollectionTest.deleteMiddle(linkedList);

        System.out.printf("AddMiddle: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime > arrayListTime, "ArrayList должен быть быстрее при удалении с середины");
    }

    @Test
    void testDeleteLast() {
        CollectionTest.fill(arrayList);
        CollectionTest.fill(linkedList);

        long arrayListTime = CollectionTest.deleteEnd(arrayList);
        long linkedListTime = CollectionTest.deleteEnd(linkedList);

        System.out.printf("AddMiddle: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime > arrayListTime, "ArrayList должен быть быстрее при удалении с конца");
    }

    @Test
    void testGetFirst() {
        CollectionTest.fill(arrayList);
        CollectionTest.fill(linkedList);

        long arrayListTime = CollectionTest.getFirst(arrayList);
        long linkedListTime = CollectionTest.getFirst(linkedList);

        System.out.printf("AddMiddle: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime < arrayListTime, "LinkedList должен быть быстрее при получении первого элемента");
    }

    @Test
    void testGetMiddle() {
        CollectionTest.fill(arrayList);
        CollectionTest.fill(linkedList);

        long arrayListTime = CollectionTest.getMiddle(arrayList);
        long linkedListTime = CollectionTest.getMiddle(linkedList);

        System.out.printf("AddMiddle: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime > arrayListTime, "ArrayList должен быть быстрее при получении элемента с середины");
    }

    @Test
    void testGetEnd() {
        CollectionTest.fill(arrayList);
        CollectionTest.fill(linkedList);

        long arrayListTime = CollectionTest.getEnd(arrayList);
        long linkedListTime = CollectionTest.getEnd(linkedList);

        System.out.printf("AddMiddle: ArrayList = %d ns, LinkedList = %d ns\n", arrayListTime, linkedListTime);
        assertTrue(linkedListTime < arrayListTime, "LinkedList должен быть быстрее при получении последнего элемента");
    }
}
