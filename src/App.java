public class App {
    static ITransporte transporte;
    public static void main(String[] args) {
/**
 * Clase principal que llama a la factoria
 * para crear los objetos de la bicicleta y del camión
 * y sacar por pantalla todas las características del envío.
 */




                // CAMION
                transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.CAMION);
        System.out.println("Camion:"+"El coste del envio es de: "+transporte.costeTotal(54000));
                int tipoC= transporte.tipoEmbalaje(120f,120f,120f,120f);
                if(tipoC == 0)
                    System.out.println(tipoC+"-->"+ITransporte.Pale);
                else if(tipoC == 1)
                    System.out.println(tipoC+"-->"+ITransporte.CajaCarton);
                else
                    System.out.println(tipoC+"-->"+ITransporte.CajaMadera);
                //BICICLETA
                transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BICICLETA);
        System.out.println("Bicileta:"+"El coste del envio es de: "+transporte.costeTotal(20000));
               int tipoB =transporte.tipoEmbalaje(24f,24f,24f,24f);
               if(tipoB == 0)
                   System.out.println(tipoB+"-->"+ITransporte.Pale);
               else if(tipoB == 1)
                   System.out.println(tipoB+"-->"+ITransporte.CajaCarton);
               else
                   System.out.println(tipoB+"-->"+ITransporte.CajaMadera);
        //Barco
        transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BARCO);
        System.out.println("Barco:"+"El coste del envio es de: "+transporte.costeTotal(18000));
        int tipoBar= transporte.tipoEmbalaje(220f,220f,220f,220f);
        if(tipoBar == 0)
            System.out.println(tipoBar+"-->"+ITransporte.Pale);
        else if(tipoBar == 1)
            System.out.println(tipoBar+"-->"+ITransporte.CajaCarton);
        else
            System.out.println(tipoBar+"-->"+ITransporte.CajaMadera);
            }
        }

