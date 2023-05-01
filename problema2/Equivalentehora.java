package Problema2.src;

public class Equivalentehora {
    private int horas;
    private int dias;
    private int minutos;
    private int segundos;
    public Equivalentehora(){

    }

    public Equivalentehora(int horas) {
        this.horas=horas;

    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    public int getHoras(){
        return this.horas;
    }

    public void calcularDias() {
        this.dias = this.horas / 24;

    }

    public void calcularMinutos() {
        this.minutos = this.horas * 60;
    }

    public void calcularSegundos() {
        this.segundos = this.horas * 3600;
    }

    public int getcalcularDias() {
        return this.dias;
    }

    public int getcalcularMinutos() {
        return this.minutos;
    }

    public int getcalcularSegundos() {
        return this.segundos;
    }


    public String toString() {
        return String.format("EL EQUIVALENTE ES "
                        + "\n DIAS: %s"
                        + "\n MINUTOS: %s"
                        + "\n SEGUNDOS: %s",
                this.getHoras(),this.getcalcularDias(), this.getcalcularMinutos(), this.getcalcularSegundos());
    }
}
