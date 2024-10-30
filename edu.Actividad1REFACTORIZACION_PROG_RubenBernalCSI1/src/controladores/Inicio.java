/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 301024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 301024
	 * @param args
	 */
    public static void main(String[] args) {
    	
    	//Variable Scanner
        Scanner scanner = new Scanner(System.in);

        //Titulo de la aplicación
        System.out.println("Calculadora de Factura con IVA e IRPF");
        
        //Solicito al usuario que introduzca el importe base
        System.out.print("Ingrese el importe base: ");
        double importeBase = scanner.nextDouble();

        //Calculo el IVA, el IRPF y el total de la factura
        double ivaCalculado = importeBase   *  0.21;
        double irpfCalculado = importeBase   *  0.15;
        double totalFactura = importeBase + ivaCalculado - irpfCalculado;

        //Muestro los datos por consola
        System.out.println("\nResumen de la Factura:");
        System.out.println("Importe Base: " + importeBase);
        System.out.println("IVA (" + ( 0.21  * 100) + "%): " + ivaCalculado);
        System.out.println("IRPF (" + ( 0.15  * 100) + "%): -" + irpfCalculado);
        System.out.println("Total Factura: " + totalFactura);

        scanner.close();
    }
}