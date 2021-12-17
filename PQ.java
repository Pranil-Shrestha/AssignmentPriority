/**
 * @author Pranil Shrestha
 */
public class PQ
{
    Node <PriorityFunction> front;
    Node <PriorityFunction> back;
    Node <PriorityFunction> current;
    int size;

    public PQ()
    {
        front = null;
        back = null;
        size = 0;
    }

    // Sorted PQ. Sorting while inserting.
    public void enqueue(Node<PriorityFunction> pf)
    {
        //if both front and back are empty, the Priority Queue is empty.
        if (front == null && back == null && size == 0)
        {
            front = pf;
            back = pf;
            size++;
            return;
        }

        // if the priority of this node is highest aka higher than the front.
        // then add it to the front.
        // visual f ->4 -> 3 <- b. We add 5. f ->5 ->4 -> 3 <-b
        if (pf.getData().getPriorities() > front.getData().getPriorities())
        {
            pf.setNext(front);
            front = pf;
            size++;
            return;
        }

        // if the priority of this node is the lowest aka lower than the back
        // then add it to the back.
        // visual f ->4 -> 3 <-b. We add 1. f -> 5 ->4 -> 1 <-b.
        if (pf.getData().getPriorities() < back.getData().getPriorities())
        {
            back.setNext(pf);
            back = pf;
            size++;
            return;
        }

        current = front;
        while (current.getNext() != null)
        {
            // if the pf and the current have same priority, add at the end of this item.
            // in order to main the FIFO status.
            // visual f -> 5 ->4 -> 1 <- b. We add 4. 
            if (current.getData().getPriorities() == pf.getData().getPriorities() && current.getNext().getData().getPriorities() < pf.getData().getPriorities())
            {
                pf.setNext(current.getNext());
                current.setNext(pf);
                size++;
                return;
            }

            // visual f -> 5 ->4 ->4 -> 1 <-b. We add 3. 
            if (pf.getData().getPriorities() > current.getNext().getData().getPriorities())
            {
                pf.setNext(current.getNext());
                current.setNext(pf);
                size++;
                return;
            }
            current = current.getNext();
        }

        // if it is the item with the lowest priority 
        // we add it to the end. 
        current.setNext(pf);
        back = current.getNext();
        size++;
        



    }

    // This is soreted priority queue. The head should
    // always have the item with the least priority.
    public Node<PriorityFunction> dequeue()
    {
        Node <PriorityFunction> returnNode = front;
        front = front.getNext();
        size--;
        return returnNode;
    }


    // public static void main (String [] args)
    // {   
    //     Node <PriorityFunction> c5 = new Node<PriorityFunction>(new PriorityFunction(), null);
    //     Node <PriorityFunction> c4 = new Node<PriorityFunction>(new PriorityFunction(), null);
    //     Node <PriorityFunction> c3 = new Node<PriorityFunction>(new PriorityFunction(), null);
    //     Node <PriorityFunction> c2 = new Node<PriorityFunction>(new PriorityFunction(), null);
    //     Node <PriorityFunction> c1 = new Node<PriorityFunction>(new PriorityFunction(), null);

    //     c5.getData().setPrioritiesDebugger(5.0);
    //     c4.getData().setPrioritiesDebugger(4.0);
    //     c3.getData().setPrioritiesDebugger(3.0);
    //     c2.getData().setPrioritiesDebugger(4.0);
    //     c1.getData().setPrioritiesDebugger(1.0);

    //     c5.getData().setAssignmentName("C5");
    //     c1.getData().setAssignmentName("C1");

    //     c4.getData().setAssignmentName("C4");
    //     c3.getData().setAssignmentName("C3");
    //     c2.getData().setAssignmentName("C2");


    //     PQ p1 = new PQ();

    //     p1.enqueue(c4);
    //     p1.enqueue(c5);
    //     p1.enqueue(c3);
    //     p1.enqueue(c1);
    //     p1.enqueue(c2);
        
    //     System.out.println(p1.dequeue().getData().getAssignmentName());
    //     System.out.println(p1.dequeue().getData().getAssignmentName());
    //     System.out.println(p1.dequeue().getData().getAssignmentName());
    //     System.out.println(p1.dequeue().getData().getAssignmentName());
    //     System.out.println(p1.dequeue().getData().getAssignmentName());



        




        
    // }

}