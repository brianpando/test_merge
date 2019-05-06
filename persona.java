import javax.swing.JOptionPane;

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

  public void nombreCompleto (){
  	return "Nombre completo: "+this.nombre+" "+this.apellido;
  
  
  public Apellidos(String apellidoNuev){
    this.Apellidos = this.apellidoNuevo;

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

  public Persona(String nombre, String apellidos, String dni, String ciudad){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.ciudad = ciudad;

  }

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

  public String nombreCompleto(){

    JOptionPane.showMessageDialog(null, "Nombre: "+nombre+" Sexo: "+sexo);

  }

  //imprimir clase completo
  public String toString() {
      return "DNI: "+this.dni, "Nombre: "+this.nombre,"Apellido"+ this.apellido,"Sexo: "+this.sexo,
      "Ciudad: "+this.ciudad, "Fecha de nacimeinto: "+this.fechaNacimiento ;
  }

}

//JESSE
import java.util.Scanner;

boolean CalcularMayorEdad(){
boolean respuesta;
Scanner dato = new Scanner(System.in);
int edad=0;
System.out.printl("ALANYA ESTUVO AQUII!!/n");

System.out.println("ingrese su edad: ");
edad = dato.nextInt();
if(edad<18){
JOptionPane.showMessageDialog(null, "Es menor de edad ");
respuesta=false;
else
  {JOptionPane.showMessageDialog(null, "Es mayor de edad");
   respuesta=true;}

return respuesta;
}

//ALANYA
String nombreCompleto, nombre, apellido, espacio;
nombreCompleto = "Shaoran Da Silva";
espacio = " ";
nombre = nombreCompleto.substring(0,nombreCompleto.indexOf(espacio));
apellido = nombreCompleto.substring(nombreCompleto.indexOf(espacio)+1,nombreCompleto.length());
System.out.println("Nombre Completo: " + nombreCompleto);
System.out.println("Nombre: " + nombre);System.out.println("Apellido: " + apellido);System.out.println("Su apellido tiene " + apellido.length() + " 
letras");

//Agregar persona vecinas
public void personaVecina(String ves){
  if(this.vecinas == ves){
    System.out.println(this.vecinas);
    System.out.println("Modif");
  }
}
