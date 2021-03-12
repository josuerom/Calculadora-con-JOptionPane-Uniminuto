/*Crear un programa en Java que al usuario ingresar "N" horas, él las convierta
* a semanas, días y horas exactas. Por ejemplo: dado un total de 1000 horas
* debe mostrar 5 semanas, 6 días & 16 horas.
* @JosuéRomeroJ
* Date: 12/Marzo/2021
*/

//package ;
import javax.swing.JOptionPane;
public class Convertidor{
    public static void main(String[] args) throws Exception
    {//Atributos.
        float semanas, dias, hora;
        int horas;

        //Le pido al usuario digitar las Horas que desee.
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas a convertir"));
        
        //Calculos para hallar semanas, dias y horas.
        semanas = horas/168;
        dias = horas%168 /24;
        hora = horas/60;

        //Muestro los resultados con las ventanas para mejor interfaz.
        JOptionPane.showMessageDialog(null, horas+" = a las horas que acabas de ingresar");
        JOptionPane.showMessageDialog(null, horas+" horas = "+semanas+" semanas");
        JOptionPane.showMessageDialog(null, horas+" horas = "+dias+" días");
        JOptionPane.showMessageDialog(null, horas+" horas = "+hora+" horas");
    }
}
