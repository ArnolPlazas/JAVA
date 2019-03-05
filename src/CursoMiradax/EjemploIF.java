/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AFPLAZASAC
 */
import java.util.Random;
public class EjemploIF {
    public static void main(String[] args) {
        Random aleatorio=new Random();
        int num=0,num1=aleatorio.nextInt(5),num2=aleatorio.nextInt(2500);
        
        if(num1==0){
            num++;
        }
        System.out.println(num2/num1);
    }
}
