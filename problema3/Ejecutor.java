public class Ejecutor {
    public static void main(String[] args) {
        InstitucionesEducativas institucion_Educativas=new InstitucionesEducativas();
        InstitucionesEducativas institucion_Educativas1=new InstitucionesEducativas(
                "UNIDAD EDUCATIVA PARTICULAR LICEO DE LOJA","particular",
                300,60,3,34.20,23.0);

        institucion_Educativas1.CalcularPresupuesto();
        System.out.println(institucion_Educativas1);

    }
}
