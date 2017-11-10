
/**
 * Write a description of class FechaYHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        // initialise instance variables
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
    }
}
