public class Camion implements ITransporte {

    public Float costeTotal(Integer CP) {
        Float coste;
        if (CP > 53000) {
            coste = 10000f;
        } else {
            coste = 1000f;
        }
        return coste;
    }


    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {

        Integer opcion = null;
        ;
        if (x > 100 && y > 100 && z > 100 && peso > 100) {
            opcion = 2;

        } else if(x > 50&&x<100&&y>50&&y<100&&z>50&&z<100&&peso>50&&peso<100){
            opcion = 1;

        }
        else if(x>25&&x<50&&y>25&&y<50&&z>25&&z<50&&peso>25&&peso<50){
            opcion = 0;

        }
        return opcion;
    }

}
