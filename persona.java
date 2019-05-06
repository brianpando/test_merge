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

  public Apellidos(String apellidoNuevo){
    this.Apellidos = this.apellidoNuevo;

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
      return "DNI: "+this.dni, "Nombre: "+this.nombre,"Apellido"+ this.apellido,"Sexo: "+this.sexo,
      "Ciudad: "+this.ciudad, "Fecha de nacimeinto: "+this.fechaNacimiento ;
  }

}

//Agregar persona vecinas
public void personaVecina(String ves){
  if(this.vecinas == ves){
    System.out.println(this.vecinas);
    
  }
}
