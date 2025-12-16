
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String description;
    private int weight;

    /**
     * Constructor for objects of class Item
     */
    public Item(String description, int weight)
    {
        // initialise instance variables
        this.description = description;
        this.weight = weight;
    }

     public String getDescription()
    {
        return description;
    }

    public int getWeight()
    {
        return weight;
    }
}