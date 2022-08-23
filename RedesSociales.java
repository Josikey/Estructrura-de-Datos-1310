
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class RedesSociales {

    public static void main(String[] args) {

        String linea;

        double Visualizaciones, MesI, MesF;
        int numero,Twitter, Facebook, Promediodecrecimiento;

        numero = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Escoge una opción: \n "
                        + "\n1. Diferencia de seguidores en Twitter"
                        + "\n2. Diferencia de visualizaciones en Youtube"
                        + "\n3. Promedio de crecimiento de Twitter y Facebook"
                        + "\n4. Precencia en redes "));

        switch (numero) {
            case 1: {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("Twitter.txt"));
                    linea = br.readLine();
                    while (linea != null) {
                        System.out.println(linea);
                        linea = br.readLine();
                    }

                } catch (FileNotFoundException ex) {
                    System.err.println(ex.getMessage());
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }

            }
            break;

            case 2:
                try {
                BufferedReader br = new BufferedReader(new FileReader("Youtube.txt"));
                linea = br.readLine();
                while (linea != null) {
                    String datos[] = linea.split(",");
                    MesI = Double.parseDouble(datos[0]);
                    MesF = Double.parseDouble(datos[1]);
                    Visualizaciones = MesF - MesI;
                    System.out.println(linea);
                    System.out.println(" Visitas: " + Visualizaciones);
                    linea = br.readLine();
                }

            } catch (FileNotFoundException ex) {
                System.err.println(ex.getMessage());
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            break;
            
            case 3:
                try {
                    BufferedReader br = new BufferedReader(new FileReader("Twitter y Facebook.txt"));
                    linea = br.readLine();
                    while (linea != null) {
                        System.out.println(linea);
                        linea = br.readLine();
                    }

                } catch (FileNotFoundException ex) {
                    System.err.println(ex.getMessage());
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
                break;
            case 4:
                try {
                    BufferedReader br = new BufferedReader(new FileReader("Presencia Redes.txt"));
                    linea = br.readLine();
                    while (linea != null) {
                        System.out.println(linea);
                        linea = br.readLine();
                    }

                } catch (FileNotFoundException ex) {
                    System.err.println(ex.getMessage());
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
                break;
            default:
                System.out.println("Error de mono-ware!!!!");
        }
    }

}
