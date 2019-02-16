package com.company;

import java.util.Scanner;
public class LectorTeclado {

        public Scanner sc;

        public LectorTeclado() {
            sc = new Scanner(System.in);
        }

        int leerEntero(String mensaje, String reintento) {
            int val = 0;
            boolean primerainteracion = true;
            do {
                if(primerainteracion) {
                    System.out.print(mensaje);
                    primerainteracion = false;
                }else {
                    sc.next();
                    System.out.println(reintento);
                }
            }while (!sc.hasNextInt());
            val = sc.nextInt();
            return val;
        }

        String leerCadena(String mensaje) {
            System.out.println(mensaje);
            return sc.next();
        }
    }


