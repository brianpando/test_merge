<<<<<<< HEAD
import java.util.calendar;
import java.util.GregorianCalendar;
=======
import javax.swing.JOptionPane;
>>>>>>> 60b559f746bae0adb605eb2ac788efc782a4e2e4

public class Persona{
  private String nombre;
  private String apellidos;
  private String dni;
  private String ciudad;
  private String sexo;




  public Persona(){
    this.persona="Desconocido.";
  }


  public Persona(String dni,String nombre,String apellido,String ciudad,String fechaNacimiento,String sexo)
        this.sexo="s/n";
  	
  }
  public Persona(String dni,String nombre,String apellido
  ,String ciudad,String fechaNacimiento)
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
  	
  }



  private String nombre;
  private String sexo;

  
  public Persona(){
    this.persona="Desconocido.";
  }

  public Apellidos(String apellidoNuevo){
    this.Apellidos = this.apellidoNuevo;

  }
  
<<<<<<< HEAD
<<<<<<< HEAD
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

=======
=======
  public Persona(String nombre, String apellidos, String dni, String ciudad){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.ciudad = ciudad;

  }
>>>>>>> c2846c6ec3ef3d5ed130602fe5ddc90cb07e7e0f
  public void determinarSexo(){

    JOptionPane.showMessageDialog(null, "Determinar el sexo de una persona");
    sexo = JOptionPane.showInputDialog(null, "Tiene pito ?..");
    if (sexo == "si"){
      JOptionPane.showMessageDialog(null, "ES HOMBREEEEE...!!");

    }else if(sexo == "no"){
      JOptionPane.showMessageDialog(null, "ES MUJER...!!");

    }else if (sexo != "si" && sexo != "no"){
      JOptionPane.showMessageDialog(null, "ERES RARITO!!");
    }
  }

  //imprimir clase completo
  public String toString() {
      return "DNI: "+this.dni, "Nombre: "+this.nombre,"Apellido"+ this.apellido,"Sexo: "+this.sexo,
      "Ciudad: "+this.ciudad, "Fecha de nacimeinto: "+this.fechaNacimiento ;
  }

}

//Agregar persona vecinas
public void personaVecina(String ves){
  if(this.vecinas == ves){
    System.out.println(this.vecinas);
    
  }
>>>>>>> 60b559f746bae0adb605eb2ac788efc782a4e2e4
}
