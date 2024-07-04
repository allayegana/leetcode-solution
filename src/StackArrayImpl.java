import java.lang.reflect.Array;
import java.util.Arrays;

public class StackArrayImpl {

    int top;
    int stack[];
    int capasity = 10;

    StackArrayImpl(){
        top = -1;
        stack = new int[capasity];

    }

    public  boolean isEmpty(){
        System.out.println(" is empty");
        return top == -1;
    }

    public boolean isFull(){
        if(top == capasity-1){
            System.out.println("is Full");
            return true;
        }
        return top == capasity;
    }

    public int push(int data){
        if(top == capasity-1){
            System.out.println("Stack is full");
        }

        return stack[++top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }

    @Override
    public String toString() {
        return "StackArrayImpl{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                ", capasity=" + capasity +
                '}';
    }



    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    public static void main(String[] args) {


        StackArrayImpl st = new StackArrayImpl();

        st.push(1);
        st.push(2);
        st.push(3);

//        st.isFull();
//        st.peek();
//        st.pop();
//        st.isEmpty();

        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}

