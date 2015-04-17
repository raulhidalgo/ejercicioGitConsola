package Ejercicios;
import java.io.*;

public class Ejercicio1 {

        public static void main(String args[]) throws Exception {
                InputStreamReader ft = new InputStreamReader(System.in);
                BufferedReader bt = new BufferedReader(ft);
                System.out.print("Ruta del fichero a leer: ");
                String rutaFicheroLectura = bt.readLine();
                System.out.println("Lineas leidas de " + rutaFicheroLectura);
                int leidas = 0, escritas = 0;
                String rutaFicheroEscritura = "resultados.txt";
                try {
                        FileReader fl = new FileReader(rutaFicheroLectura);
                        BufferedReader bl = new BufferedReader(fl);
                        FileWriter fe = new FileWriter(rutaFicheroEscritura);
                        BufferedWriter be = new BufferedWriter(fe);
                        String siguienteLinea;
                        while ((siguienteLinea = bl.readLine()) != null) {
                                leidas++;
                                if (siguienteLinea.charAt(0) == '+' || siguienteLinea.charAt(0) == '-') {
                                        escritas++;
                                        be.write(siguienteLinea);
                                        be.newLine();
                                } else {
                                        System.out.println(siguienteLinea);
                                }
                        }
                        bl.close();
                        be.flush();
                        be.close();
                } catch (IOException e) {
                        System.out.println("Error---" + e.toString());
                }
                System.out.println("Lineas escritas en " + rutaFicheroEscritura + "=" + escritas);
                System.out.println("Lineas leidas de " + rutaFicheroLectura + "=" + leidas);
        }
}
