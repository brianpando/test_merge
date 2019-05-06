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

  
  public Persona(){
    this.persona="Desconocido.";
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

  //imprimir clase completo
  public String toString() {
      return "nombre: "+this.nombre, "Sexo: "+this.sexo;
  }

}



