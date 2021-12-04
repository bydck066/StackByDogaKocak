public class ArrayBasedGenericStack<T> implements Stack<T> {
    private int MAX_SIZE;
    private int top;
    private T[] items;
    public ArrayBasedGenericStack(int MAX_SIZE){
        top =-1;
        Object[] genericArray = new Object[MAX_SIZE];
        items=(T[]) genericArray;

    }
    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull(){
        return MAX_SIZE-1<=top;
    }

    @Override
    public void push(T data) {
        if (isFull()){
            System.out.println("Stack Overflow");
            System.exit(0);
        }
        top++;
        items[top]=data;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        T tmp = items[top];
        items[top]=null;
        top--;
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        return items[top];
    }

    @Override
    public int size() {
        return top+1;
    }


}
