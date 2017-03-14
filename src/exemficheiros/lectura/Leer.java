/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemficheiros.lectura;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ggarciamartinez
 */
public class Leer {

    File ficheiro;
    Scanner sc;

    public void leer(String nomeArquivo) {
        ficheiro = new File(nomeArquivo);
        try {
            sc = new Scanner(ficheiro).useDelimiter(",");
           while(sc.hasNext())
                //Linea a linea -while(sc.hasNextLine())
                System.out.println(sc.next());
             
            //System.out.println(sc.nextLine());
        } catch (FileNotFoundException ex) {
            System.out.print("error" + ex.getMessage());
        } finally {
            sc.close();
                }
    }
}
