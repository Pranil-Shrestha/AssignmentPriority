/**
 * @author Pranil Shrestha
 */
public class PriorityFunction
{
    private Double weight;
    private Double deadline;
    private Double volume;
    private Double priorities;
    private String assignmentName;

    // constructors
    public PriorityFunction()
    {
        weight = 0.0;
        deadline = 15.0;
        volume = 0.0;
        priorities = 0.0;
        assignmentName = "";
        setPriorities();
    }

    public PriorityFunction(String assignmentName, double weight, double deadline, double volume)
    {
        this.weight = weight;
        this.deadline = deadline;
        this.volume = volume;
        this.assignmentName = assignmentName;
        setPriorities();
    }

    //Setters and getters
    public Double getWeight()
    {
        return weight;
    }

    public Double getDeadline()
    {
        return deadline;
    }

    public Double getVolume()
    {
        return volume;
    }

    public Double getPriorities()
    {
        return priorities;
    }

    public String getAssignmentName()
    {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName)
    {
        this.assignmentName = assignmentName;
    }

    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    public void setDeadline(Double deadline)
    {
        this.deadline = deadline;
    }

    public void setVolume(Double volume)
    {
        this.volume = volume;
    }

    public void setPriorities()
    {
        priorities = 150 * weight/100 + (15/deadline) + 3 * volume;
    }

    //Dont use this for other than testing.
    public void setPrioritiesDebugger(Double prioroties)
    {
        this.priorities = prioroties;
    }

    //for debugging.
    public String toStringDebugger()
    {
        String returnString = "[" + assignmentName + "] " + "Weight: " + weight + "," + " Deadline: " + deadline + "," + " Volume: " + volume + "," + " priorities: " + priorities;
        return returnString;
    }

    @Override
    public String toString()
    {
        return assignmentName + " : " + this.priorities;
    }


    // public static void main (String [] args)
    // {
    //     PriorityFunction pf = new PriorityFunction("Class",10, 4,3);
    //     System.out.println(pf.toString());
    //     System.out.println(pf.toStringDebugger());
    // }
}