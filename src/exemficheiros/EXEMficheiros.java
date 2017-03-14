/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemficheiros;

/**
 *
 * @author ggarciamartinez
 */
//import exemficheiros.lectura.Leer;
import exemficheiros.lectura.Leer;
import exemficheiros.lectura.leerNums;
public class EXEMficheiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Leer l = new Leer();
        l.leer("/home/local/DANIELCASTELAO/ggarciamartinez/c.txt");
/*
        leerNums ln =new leerNums();
        ln.leerNum("/home/local/DANIELCASTELAO/ggarciamartinez/nums.txt");*/
}
}