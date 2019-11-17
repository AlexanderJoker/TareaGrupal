package Principal;
import Clases.Deportista;
import Clases.Doctor;
import Clases.Persona;
import javax.swing.JOptionPane;
/**
  @author Alexander Tinoco
 */
public class Principal {
 public static void main(String[] args) {
  Persona per=new Persona();
  Doctor doc= new Doctor();
  Deportista dep=new Deportista();
  String nom1,nom2,patro,deporte;
  String cateme, cargo;
  int ed, categoria, salario;
  nom1=JOptionPane.showInputDialog("Ingrese su nombre");
  per.setNombre(nom1);
  nom2=JOptionPane.showInputDialog("Ingrese su apellido");
  per.setApellido(nom2);
  ed=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
  per.setEdad(ed);        
  categoria=Integer.parseInt(JOptionPane.showInputDialog("Cual es su profesion \n 1. doctor \n "
                                                          + "2. deportista"));        
  switch(categoria)
  {
   case 1:
   cargo=JOptionPane.showInputDialog("Ingrese su cargo");
   doc.setCargo(cargo);
   cateme=JOptionPane.showInputDialog("Ingrese su categoria medica");
   doc.setCategoriaMe(cateme);
   salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
   per.setSalario(salario);
   JOptionPane.showMessageDialog(null, "Persona \n nombre: " + per.getNombre() + 
                        " \n apellido: " + per.getApellido() + "\n edad: " + per.getEdad() + 
                        " \n profesion: " + "Doctor" + "\n cargo: " + doc.getCargo() + 
                        "\n categoria medica:" + doc.getCategoriaMe() + "\n sueldo: " + per.getSalario() );
   break;         
   case 2:
   deporte=JOptionPane.showInputDialog("Ingrese su deporte");
   dep.setDeporte(deporte);
   patro=JOptionPane.showInputDialog("Ingrese su representante");
   dep.setPatrocinio(patro);
   salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
   per.setSalario(salario);
   JOptionPane.showMessageDialog(null, "Persona \n nombre: " + per.getNombre() + 
                        " \n apellido: " + per.getApellido() + "\n edad: " + per.getEdad() + 
                        " \n profesion: " + "Deportista" + "\n deporte: " + dep.getDeporte() + 
                        "\n representante:" + dep.getPatrocinio() + "\n sueldo: " + per.getSalario());   
   break;
}
}
}