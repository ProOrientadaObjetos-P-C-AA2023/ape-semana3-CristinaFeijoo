public class Terreno {

    class terreno {
        private double costoTerreno;
        private double anchoTerreno;
        private double largoTerreno;
        private double areaTerreno;
        private double valorMetroCuadrado;

        public terreno() {
        }

        public terreno(double anchoTerreno, double largoTerreno, double valorMetroCuadrado) {
            this.anchoTerreno = anchoTerreno;
            this.largoTerreno = largoTerreno;
            this.valorMetroCuadrado = valorMetroCuadrado;
        }

        public void setAnchoTerreno(double anchoTerreno) {
            this.anchoTerreno = anchoTerreno;
        }

        public void setLargoTerreno(double largoTerreno) {
            this.largoTerreno = largoTerreno;
        }

        public void setValorMetroCuadrado(double valorMetroCuadrado) {
            this.valorMetroCuadrado = valorMetroCuadrado;
        }

        public void calcularAreaTerreno() {
            this.areaTerreno = this.anchoTerreno * this.largoTerreno;
        }

        public void calcularValorTerreno() {
            this.costoTerreno = this.areaTerreno * this.valorMetroCuadrado;
        }

        public double getAreaTerreno() {
            return this.areaTerreno;
        }

        public double getCostoTerreno() {
            return this.costoTerreno;
        }

        public double getAnchoTerreno() {
            return this.anchoTerreno;
        }

        public double getLargoTerreno() {
            return this.anchoTerreno;
        }

        public double getValorMetroCuadrado() {
            return this.valorMetroCuadrado;
        }

        public String toString() {
            return String.format("SU TERRENO TIENE ESTOS PARAMETROS: \n ANCHO DEL TERRENO: %f\n LARGO DEL TERRENO: %f\n VALOR POR METRO CUADRADO DEL TERRENO: %f\n AREA DEL TERRENO: %f\n VALOR DEL TERRENO: %f", this.getAnchoTerreno(), this.getLargoTerreno(), this.getValorMetroCuadrado(), this.getAreaTerreno(), this.getCostoTerreno());
        }
    }
}
