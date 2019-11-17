package Clases;
/**
 *
 * @author Alexander Tinoco
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int salario;
    public Persona()
    {    
    }
    public void setNombre(String nombre)
    {
     this.nombre=nombre;
    }
     public void setSalario(int salario)
     {
        this.salario=salario;
     }
        public int getSalario()
    {
        return salario;
    }  
    public void setApellido(String apellido)
    {
     this.apellido=apellido;   
    }
    public void setEdad(int edad){
        this.edad=edad;
    }            
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad() {
        return edad;
    }   
}

