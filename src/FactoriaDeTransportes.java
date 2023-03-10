public class FactoriaDeTransportes {

    /**
     * Fabrica encargada de devolver el producto
     * que elegimos según el tipo
     */

        public static final int CAMION = 1;
        public static final int BICICLETA = 2;
        /**
         * Método que devuelve producto del tipo de la Interface
         * @param type 1: Camión, 2:Bicicleta
         * @return producto segun el tipo
         */
        public static ITransporte getProducto(int type) {
            switch (type) {
                // tipo camion
                case CAMION:
                    return new Camion();
                // tipo
                case BICICLETA:
                    return new Bicicleta();
                // otro tipo
                default:
                    return null;
            }
        }
    }


