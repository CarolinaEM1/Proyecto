
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
        a.capturar();
        a.precioHab();
        a.precioNoche();

        
        Datos da= new Datos();
        da.capturar();
        da.mostrar();
        
        
    }
    
}


abstract class Hotel{
    String habitaciones;
    double precioHab,noche,precioNo;
    abstract void capturar();

            
}
     class Habitaciones extends Hotel {

        int tipoHab;
        
        public void capturar(){
            tipoHab=Integer.parseInt(JOptionPane.showInputDialog("Elige el tipo de habitación: \n1.-Suite \n2.-Matrimonial \n3.-Individual"));
            noche=Double.parseDouble(JOptionPane.showInputDialog("¿Cuántas noches desea quedarse?"));
   
        }

        double precioHab(){
            switch(tipoHab){
                case 1:
                    tipoHab=3200;
                    break;
                case 2:
                    tipoHab=2300;
                    break;
                case 3:
                    tipoHab=1500;
                    break;
                
            }
            return precioHab;
        }

        double precioNoche(){
                        
            if (noche<=1){
                precioNo=1500;
    
            }
            else {
                precioNo=1500*noche;
            }
            return precioNo;
        }
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
                JOptionPane.showMessageDialog(null,"Nombre del encargado: "+ nombre +"\nEdad: "+ edad +"\nNúmero de teléfono: "+ celular +"\nDirección: "+ direccion +"\nDía de llegada: "+ diaLlegada +"\nDía de salida: "+ diaSalida +"\nPrecio de la habitación: "+ precioHab +"\nNoches:" + noche +"\nCosto total de noches: "+ precioNo +"\nPrecio Total: "+(precioHab+precioNo));
            }
        }