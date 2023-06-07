import java.util.List;
import java.util.ArrayList;

public class Stack<T>{
    private Node<T> head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        
        if (size == 0) {
            head = newNode;
        } 
        else {
            newNode.setNext(head);
            head=newNode;
        }
        size++;
    }

    public T pop() {
        if (size == 0) {
            return null;
        } 
        else {
            T value = head.getValue();
            head = head.getNext();
            size--;

            return value;
        }
    }

    public List<T> popUp() throws Exception{
        List<T> valores = new ArrayList<>();

        while(!isEmpty()) {
            if(size == 1) {
                T value = head.getValue();
                head = null;
                valores.add(value);
                size--;
            } else {
                T value = head.getValue();
                head = head.getNext();
                valores.add(value);
                size--;
            }
        }
        return valores;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } 
        else {
            return false;
        }    
    }

    public T top() {
        T first = head.getValue();
        return first;
    }

    public void display() {
        Node<T> current = head;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}