/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemficheiros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author ggarciamartinez
 */
public class leerNums {
    File fichero;
    Scanner sc;
    public void leerNum(String nomArch){
        fichero= new File(nomArch);
        try {  
            sc=new Scanner(fichero);
            
            while(sc.hasNextInt())
               System.out.println(sc.nextInt());
            
        } catch (FileNotFoundException ex) {
            System.out.println("error"+ ex.getMessage());
        }
            
      
    }
}
