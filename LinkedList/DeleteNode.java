public class DeleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node head;

    static void delete(int key){
        if(head == null) return;

        if(head.data == key){
            head = head.next;
            return;
        }

        Node curr = head;
        while(curr.next != null && curr.next.data != key)
            curr = curr.next;

        if(curr.next != null)
            curr.next = curr.next.next;
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
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        delete(2);
        display();
    }
}
