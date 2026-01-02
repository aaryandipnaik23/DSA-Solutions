public class StackArray {
    static int top = -1;
    static int size = 5;
    static int stack[] = new int[size];

    static void push(int x){
        if(top == size - 1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    static void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    static void display(){
        for(int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        push(10);
        push(20);
        push(30);
        pop();
        display();
    }
}
