package Problema2.src;

public class Ejecutor {
        public static void main(String[] args) {
            Equivalentehora hora1= new Equivalentehora();
            Equivalentehora hora2= new Equivalentehora(56);
            hora2.calcularDias();
            hora2.calcularMinutos();
            hora2.calcularSegundos();
            System.out.println(hora2);
        }
    }

