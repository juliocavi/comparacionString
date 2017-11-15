
/**
 * Write a description of class FechaYHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    private NumberDisplay hours;
    private NumberDisplay minutes; 
    private NumberDisplay dia;
    private NumberDisplay mes;
    private NumberDisplay año;
    private String displayString;
    
    /**
     * Constructor for objects of class FechaYHora.
     */
    
    public FechaYHora(){
       hours = new NumberDisplay(24);
       minutes = new NumberDisplay(60);
       dia = new NumberDisplay(31);
       mes = new NumberDisplay(13); 
       año = new NumberDisplay(100); 
       getFechaYHora();
    }
    
    /**
     * Return the complete String (day, month, year, hour and minutes).
     */
    
    public String getFechaYHora(){
       return  dia.getValue() + "-" + mes.getValue() + "-" + año.getValue() 
       + " " + hours.getValue() + ":" + minutes.getValue();
    }
    
    /**
     * Set the date and the hour with values inserted by parameters.
     */
    public void fijarFechaYHora(int day, int month, int year, int hora, int minutos)
    {
       dia.setValue(day);
       mes.setValue(month);
       año.setValue(year);
       hours.setValue(hora);
       minutes.setValue(minutos);
    }
    
    /**
     * Increment one day, month, year, hour and minute respectively.
     */
    public void avanzar(){
       minutes.increment();
       if (minutes.getValorActual() == 0){
           hours.increment();
           if (hours.getValorActual() == 0){
               dia.increment();
               if (dia.getValorActual() == 1){
                   mes.increment();
                   if (mes.getValorActual() == 1){
                       año.increment();
                   }
               }
           }
       }
    }
}
