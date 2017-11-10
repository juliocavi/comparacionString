
/**
 * Write a description of class CalendarioBasico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Declaramos variables dia, mes y año
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres ano;
    
    /**
     * Constructor de la clase CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        ano = new DisplayDosCaracteres(3000);
    }

    /**
     *Fijamos la fecha nueva
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
       dia.setValorAlmacenado(nuevoDia);
       mes.setValorAlmacenado(nuevoMes);
       ano.setValorAlmacenado(nuevoAnio);
    }

    /**
     *Metodo para obtener fecha
     */
    public String obtenerFecha()
    {
        return dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay();
    }

    /**
     * Avanza un dia la fecha
     */
    public void avanzarFecha()
    {
        dia.incrementaValorAlmacenado();
        if (dia.getValorAlmacenado() == 1){
            mes.incrementaValorAlmacenado();
            if (mes.getValorAlmacenado() == 1){
                ano.incrementaValorAlmacenado();
            }
        }
    }
}
