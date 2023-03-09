public class App {
    static ITransporte transporte;
    public static void main(String[] args) {
/**
 * Calse principal que llama a la factoria
 * para crear los onjetos
 */




                // CAMION
                transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.CAMION);
        System.out.println("El coste del envio es de: "+transporte.costeTotal(54000));
                int tipoC= transporte.tipoEmbalaje(120f,120f,120f,120f);
                if(tipoC == 0)
                    System.out.println(tipoC+"-->"+ITransporte.Pale);
                else if(tipoC == 1)
                    System.out.println(tipoC+"-->"+ITransporte.CajaCarton);
                else
                    System.out.println(tipoC+"-->"+ITransporte.CajaMadera);
                //BICICLETA
                transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BICICLETA);
        System.out.println("El coste del envio es de: "+transporte.costeTotal(20000));
               int tipoB =transporte.tipoEmbalaje(24f,24f,24f,24f);
               if(tipoB == 0)
                   System.out.println(tipoB+"-->"+ITransporte.Pale);
               else if(tipoB == 1)
                   System.out.println(tipoB+"-->"+ITransporte.CajaCarton);
               else
                   System.out.println(tipoB+"-->"+ITransporte.CajaMadera);
            }
        }

