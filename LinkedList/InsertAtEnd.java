import java.util.*;

public class InsertAtEnd {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        display();
    }
}
