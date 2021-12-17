/**
 * @author Pranil Shrestha
 */
public class PQ
{
    Node <PriorityFunction> front;
    Node <PriorityFunction> back;
    int size;

    public PQ()
    {
        front = null;
        back = null;
        size = 0;
    }

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

        //if the priority of this node is higher than the back.
        if (pf.data.getPriorities() > back.data.getPriorities())
        {
            pf.setNext(front);
            front = pf;
            size++;
            return;
        }



    }

}