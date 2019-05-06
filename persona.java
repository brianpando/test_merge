public class Persona{
  private nombre;
  
  public Persona(){
    this.persona="Desconocido.";
  }
  
}

//imprimir clase completo
public String toString() {
    return "nombre: "+this.nombre;
}

//Agregar persona vecinas
public void personaVecina(String ves){
  if(this.vecinas == ves){
    System.out.println(this.vecinas);
    
  }
}