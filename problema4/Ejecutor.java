public class Ejecutor {
    public static void main(String[] args) {
        Sistema sistema=new Sistema();
        Sistema sistema1=new Sistema("ANDROID",6.78,1023,12.9,"w2:6u:uk:8c","9763 677723 8");
        sistema1.calcularIvaCostoInicial();
        sistema1.calcularCostoFinal();
        System.out.println(sistema1);
    }


}
