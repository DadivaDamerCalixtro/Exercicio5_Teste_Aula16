/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.text.DecimalFormat;

/**
 *
 * @author Notebook
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DecimalFormat d = new DecimalFormat("#.#");
       double pdrnh=1.50;
       double luiz=1.10;
       int anos=0;
       
       do{
           pdrnh=pdrnh+0.02;
           luiz=luiz+0.03;
           anos++;
       }while (luiz <= pdrnh);
       System.out.print("Para que Luiz seja mais alto que Pedrinho são necessarios: ");
       System.out.print(d.format(anos));
       System.out.println(" anos");
    }
}
