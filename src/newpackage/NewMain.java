/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author renan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Metodos hacer = new Metodos();
        System.out.println("Proyecto con Matrices");
        String op,simbolo="*";
        while (true) {
            System.out.println("\nIngrese tamaño para matriz MxM");
            int tam = inEntero();
            String[][] matr = new String[tam][tam];
            do {
                System.out.println("\nMENU DE OPCIONES");
                System.out.println("1.Mostrar Ascendente\n2.Mostrar Descedente\n3.Cambiar Tamaño Matriz\n4. Cambiar Simbolo \""+simbolo+"\"\n5.Salir\nSELECCION:");
                op=sc.next();
                switch (op) {
                    case "1":
                        System.out.println("");
                        hacer.EscalonSuperior(matr,simbolo);
                        hacer.mostrar(matr);break;
                    case "2":
                        System.out.println("");
                        hacer.EscalonInferior(matr,simbolo);
                        hacer.mostrar(matr);break;
                    case "3":
                        break;
                    case "4":
                        System.out.println("\nIngrese nuevo Simbolo para reemplazar: \""+simbolo+"\"");
                        simbolo=sc.next();
                        break;
                    case "5":
                        return;
                    default:
                        System.out.println("Ninguna opcion escogida");
                }
            } while (!op.equals("3"));
        }
    }

    private static int inEntero() {
        int nume;
        while (true) {
            //System.out.println("Ingrese un entero:");
            String num = sc.next();
            try {
                nume = Integer.parseInt(num);
                if (nume>1) {
                    break;
                }
                else{
                    System.out.println("El numero debe ser mayor a 1\nIngresar de nuevo:");
                }
            } catch (NumberFormatException e) {
                System.out.println("No se ha ingresado un numero entero valido.\nIngresar de nuevo:");
            }
        }
        return nume;
    }

}
