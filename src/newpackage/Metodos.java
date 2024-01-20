/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author renan
 */
public class Metodos {
    public void mostrar(String[][] matr){
        for (int i = 0; i < matr.length; i++) {         
            for (int j = 0; j <matr.length; j++) {
                System.out.print(matr[i][j]+" ");
            }
            System.out.println("");
            
        }
    }
    //Generar matriz ascendente:
    public void EscalonSuperior(String[][] matr,String sim){
        String espacio="";
        for (int i = 0; i < sim.length(); i++) {
            espacio+=" ";
        }
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j <matr.length; j++) {
                if (j<=i) {
                    matr[i][j]=sim;
                }
                else{
                    matr[i][j]=espacio;
                }
            }
            
        }
    }
    
    //Generar matriz descendente 
    public void EscalonInferior(String[][] matr,String sim){    
        int aux=matr.length;
        String espacio="";
        for (int i = 0; i < sim.length(); i++) {
            espacio+=" ";
        }
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j <matr.length; j++) {
                if (j<aux) {
                    matr[i][j]=sim;
                }
                else{
                    matr[i][j]=espacio;
                }
            }
            aux--;            
        }
    }
}
