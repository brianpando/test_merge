import java.util.calendar;
import java.util.GregorianCalendar;

public class Persona{
  private nombre;
  
  public Persona(){
    this.persona="Desconocido.";
  }
  
  //@Jhil
  public class int calcularEdad(String fechaNacimiento){
    String dias = fechaNacimiento.substring(0,1);
    String mes = fechaNacimiento.substring(3,4);
    String anio = fechaNacimiento.substring(6,9);

    Calendar fechaActual = Calendar.getInstance();

    int years = fechaActual.get(Calendar.YEAR) - ((int)anio);
    int months = fechaActual.get(Calendar.MONTH) - ((int)mes);
    int days = fechaActual.get(Calendar.DAY_OF_MONTH) - ((int)dias);
 
        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1a la diferencia de años
 
    if(months < 0 // Aún no es el mes de su cumpleaños
        || (months==0 && days < 0)) { // o es el mes pero no ha llegado el día.
        years--;
    }

    return years;
  }

}
