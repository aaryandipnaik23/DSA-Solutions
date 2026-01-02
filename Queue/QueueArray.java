public class QueueArray {
    static int size = 5;
    static int queue[] = new int[size];
    static int front = 0, rear = -1;

    static void enqueue(int x){
        if(rear == size - 1){
            System.out.println("Queue Full");
            return;
        }
        queue[++rear] = x;
    }

    static void dequeue(){
        if(front > rear){
            System.out.println("Queue Empty");
            return;
        }
        front++;
    }

    static void display(){
        for(int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        enqueue(1);
        enqueue(2);
        enqueue(3);
        dequeue();
        display();
    }
}
