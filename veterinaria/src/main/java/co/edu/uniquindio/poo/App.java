/**
 * Clase para probar el funcionamiento del código de la informacion de estudiantes
 * @author Maicol Steven Paez Cruz
 * @since 2024-03-03
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Pamela", "Perro", "Pinscher", (byte) 2, "Femenino" , "Negro", (float)3.4);
        System.out.println(mascota.toString());
    }
}