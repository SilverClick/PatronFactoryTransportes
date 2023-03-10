# PASOS A SEGUIR:

-Primer paso: Creamos una interfaz donde declaramos constantes con 
cada tipo de embalaje y inicializadas con un texto y declaramos los 2 métodos de los transportes,
coste total y tipo de embalaje.

```
 public static final String Pale="eltexto";
 public static final String CajaCarton="eltexto";
 public static final String CajaMadera="eltexto";

    Float costeTotal(Integer CP);
    Integer tipoEmbalaje(Float x,Float y,Float z,Float peso);
```
-Segundo paso: Creamos una clase por cada transporte, bicicleta y
camión que implementan los métodos de la interfaz y
los configura para dependiendo de los valores que reciba devolver
unos valores o otros.
Poe ejemplo la bicicleta:
```
public Float costeTotal(Integer CP) {
        Float costeB;
        if (CP > 20000&&CP<54000) {
            costeB = 5000f;
        } else {
            costeB = 500f;
        }
        return costeB;
    }
    /**
     *Devuelve el tipo de enbalaje según las características del paquete.
     * @param x,y,z,peso Características del envío.
     * @return opcionB que es el número del tipo del embalaje.
     */
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        Integer opcionB= null;
        ;
        if (x > 50 && y > 50 && z > 50 && peso > 50) {
            opcionB = 2;


        } else if(x > 25&&x<50&&y>25&&y<50&&z>25&&z<50&&peso>25&&peso<50){
            opcionB = 1;

        }
        else if(x>0&&x<25&&y>0&&y<25&&z>0&&z<25&&peso>0&&peso<25){
            opcionB = 0;

        }
        return opcionB;

```

-Tercer paso: Creamos la clase FactoriaDeTransporte que declara una constante por cada
tipo de transporte y creamos un método que devuelve el objeto del transporte como
interfaz.
```
public class FactoriaDeTransportes {

        public static final int CAMION = 1;
        public static final int BICICLETA = 2;
       
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

```
-Cuarto paso: En la main creamos una variable del tipo de la interfaz y con eso y 
getProducto del paso anterior le vamos dando valores a los métodos de los transportes
y vemos por pantalla todo.
```
public class App {
    static ITransporte transporte;
    public static void main(String[] args) {


                // CAMION
                transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.CAMION);
        System.out.println("Camion:"+"El coste del envio es de: "+transporte.costeTotal(54000));
                int tipoC= transporte.tipoEmbalaje(120f,120f,120f,120f);
                if(tipoC == 0)
                    System.out.println("Camión: "+tipoC+"-->"+ITransporte.Pale);
                else if(tipoC == 1)
                    System.out.println("Camión: "+tipoC+"-->"+ITransporte.CajaCarton);
                else
                    System.out.println("Camión: "+tipoC+"-->"+ITransporte.CajaMadera);
                //BICICLETA
                transporte = FactoriaDeTransportes.getProducto(FactoriaDeTransportes.BICICLETA);
        System.out.println("Bicileta:"+"El coste del envio es de: "+transporte.costeTotal(20000));
               int tipoB =transporte.tipoEmbalaje(24f,24f,24f,24f);
               if(tipoB == 0)
                   System.out.println("Bicicleta:"+tipoB+"-->"+ITransporte.Pale);
               else if(tipoB == 1)
                   System.out.println("Bicicleta: "+tipoB+"-->"+ITransporte.CajaCarton);
               else
                   System.out.println("Bicicleta: "+tipoB+"-->"+ITransporte.CajaMadera);
            }
        }


```