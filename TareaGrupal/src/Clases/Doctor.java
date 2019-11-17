package Clases;
/**
 *
 * @author Alexander Tinoco
 */
public class Doctor extends Persona{
   private String cargo;
   private String catemedico;
   public Doctor()
   {
   }
   public void setCargo(String cargo)
   {
    this.cargo=cargo;   
   }                    
   public void setCategoriaMe(String catemedico)
   {
    this.catemedico=catemedico;    
   }                                
   public String getCargo()
   {
    return cargo;
   }   
   public String getCategoriaMe(){
   return catemedico;
   }  
}   