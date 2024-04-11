package com.zipcodewilmington.singlylinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//add -- add an element to the list
//remove -- remove an element (specified by numeric index) from the list
//contains -- returns true if the element is in the list, false otherwise
//find -- returns the element's index if it is in the list, -1 otherwise
//size -- returns the current size of the list
//get -- returns the element at the specified index
//copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test public void testNewLinkedList() {
        SinglyLinkedList list = new SinglyLinkedList();

        assertTrue(list.isEmpty()); // linked list should be empty
        assertEquals(0, list.length());
        // length of linked list should be zero

        // length of linked list should be 1
        list.append("ABC");
        assertTrue(list.isEmpty());
        assertEquals(1, list.length());
        // linked list should not be empty assertEquals(1, singly.length());
    }

    @Test
    public void testAddElement(){
        SinglyLinkedList list = new SinglyLinkedList();
        String elementToAdd = "D";

        List<String> actual = Collections.singletonList("ABC" + elementToAdd);
        List<String> expected = Collections.singletonList("ABC" + "D");

        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveElement(){
    }

    @Test
    public void containsElement(){

    }

    @Test
    public void findElement(){

    }

    @Test
    public void sizeOfList(){

    }

    @Test
    public void getElement(){

    }

    @Test
    public void copyList(){

    }

    @Test
    public void sortList(){

    }
}
