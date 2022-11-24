
package proyectopoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class ProyectoPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Habitaciones a= new Habitaciones();
        Datos da= new Datos();
        
        
    }
    
}


abstract class Hotel{
    String habitaciones;
    double precioHab;
    abstract void capturar();
    abstract void mostrar();
    
     class Habitaciones extends Hotel {
        double tipoHab,noche,precioNoche;
        
        public void capturar(){
            tipoHab=Double.parseDouble(JOptionPane.showInputDialog("Elige el tipo de habitación: \n1.-Suite \n2.-Matrimonial \n3.-Individual"));
            noche=Double.parseDouble(JOptionPane.showInputDialog("¿Cuántas noches desea quedarse?"));
   
        }

        double precioHab(){
            if (tipoHab<=1){
                tipoHab=3200;
            }
            else {
                if (tipoHab<=2){
                    tipoHab=2000;
                }
                else {
                    if (tipoHab<=2){
                        tipoHab=1500;
                    }
                    
                }
            }

            return tipoHab;
        }

        double precioNoche(){
                        
            if (noche<=1){
                precioNoche=1500;
    
            }
            else {
                precioNoche=1500*noche;
            }
            return noche;
        }
        public void mostrar(){
            String s;
            s="Precio de la habitación: "+tipoHab+"\nNoches:" +noche+"\nCosto total de noches: "+noche+"\nPrecio Total: "+(tipoHab+noche);
        }
        
        class Datos extends Hotel{
            String nombre,direccion,diaLlegada,diaSalida;
            int edad,celular;
            
            public void capturar(){
                nombre=JOptionPane.showInputDialog("Teclea tu nombre");
                edad=Integer.parseInt(JOptionPane.showInputDialog("Teclea tu edad"));
                celular=Integer.parseInt(JOptionPane.showInputDialog("Teclea tu número de celular"));
                direccion=JOptionPane.showInputDialog("Teclea tu dirección");
                diaLlegada=JOptionPane.showInputDialog("Teclea el día de tu llegada");
                diaSalida=JOptionPane.showInputDialog("Teclea el día de tu salida");
            }
            public void mostrar(){
                String s;
                s="Nombre del encargado: "+nombre+"Edad: "+edad+"Número de teléfono: "+celular+"Dirección: "+direccion+"Día de llegada: "+diaLlegada+"Día de salida"+diaSalida;
            }
        }
    }
            
}