/**
 * @author Pranil Shrestha
 */
public class Node <T>
{
    T data;
    Node<T> next;

    public Node()
    {
        data = null;
        next = null;
    }

    public Node (T data, Node<T> next)
    {
        this.data = data;
        this.next = next;
    }

    //getters and setters
    public void setData(T data){this.data = data;}
    public T getData(){return data;}
    public void setNext(Node<T> next){this.next = next;}
    public Node<T> getNext(){return next;}

    // public static void main (String [] args)
    // {
    //     PriorityFunction pf1 = new PriorityFunction();
    //     PriorityFunction pf2 = new PriorityFunction();

    //     pf1.setAssignmentName("CS310");
    //     pf2.setAssignmentName("CS262");

    //     Node<PriorityFunction> head = new Node<>();
    //     head.setData(pf1);
    //     head.setNext(new Node<PriorityFunction>(pf2, null));

    //     System.out.println(head.getData().toStringDebugger());
    //     System.out.println(head.getNext().getData().toStringDebugger());
    // }

    
}