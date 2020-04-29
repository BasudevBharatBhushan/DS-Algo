package lists.linkedList;

import java.io.*;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class PrintInReverseOrder {
	static SinglyLinkedListNode head;
	SinglyLinkedListNode tail;

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

//    static class SinglyLinkedList {
//        public SinglyLinkedListNode head;
//        public SinglyLinkedListNode tail;
//
//        public SinglyLinkedList() {
//            head = null;
//            tail = null;
//        }
    
    

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }

            tail = node;
        }
    
    //}
    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
    static void reversePrint(SinglyLinkedListNode head) {
        
        if(head==null);
        else{
            reversePrint(head.next);
            System.out.print(head.data+" ");
        }
        
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter no. of test cases");
        int tests = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) { 
        	PrintInReverseOrder llist = new PrintInReverseOrder();

            System.out.println("Enter the number of nodes");
            int llistCount = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            System.out.println("enter the data of nodes");
            for (int i = 0; i < llistCount; i++) {
                int llistItem = sc.nextInt();
                sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }
            System.out.print("Linked list in reverse order--> ");
            reversePrint(head);
        }

        sc.close();
    }
}
