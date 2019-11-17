package Clases;
/**
 *
 * @author Alexander Tinoco
 */
public class Deportista extends Persona{
private String deporte;
private String patrocinio; 
  public Deportista()
  {
  }    
 public void setDeporte(String deporte)
 {
 this.deporte=deporte;   
 }
 public void setPatrocinio(String patrocinio)
 {
 this.patrocinio=patrocinio;
 }
 public String getPatrocinio()
 {
 return patrocinio;                   
 }   
 public String getDeporte()
 {
 return deporte;
 }      
}