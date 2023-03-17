public class Barco implements ITransporte {
    /**
     *Devuelve el coste del envio en barco según el Código Postal.
     * @param CP Código Postal del lugar del envío.
     * @return costeB que es el coste del envío.
     */


    public Float costeTotal(Integer CP) {
        Float costeBar;
        if (CP < 20000) {
            costeBar = 12000f;
        } else {
            costeBar = 2000f;
        }
        return costeBar;
    }
    /**
     *Devuelve el tipo de enbalaje según las características del paquete.
     * @param x,y,z,peso Características del envío.
     * @return opcionB que es el número del tipo del embalaje.
     */
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        Integer opcionBar= null;
        ;
        if (x > 200 && y > 200 && z > 200 && peso > 200) {
            opcionBar = 2;


        } else if(x > 125&&x<150&&y>125&&y<150&&z>125&&z<150&&peso>125&&peso<150){
            opcionBar = 1;

        }
        else if(x>100&&x<125&&y>100&&y<125&&z>100&&z<125&&peso>100&&peso<125){
            opcionBar = 0;

        }
        return opcionBar;
    }
}


