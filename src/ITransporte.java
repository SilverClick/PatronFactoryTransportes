public interface ITransporte {
    /**  Declaramos las finales de cada tipo de embalaje.
     * Declaramos dos métodos en la interfaz que utilizaremos en los tipos de transporte.
     * Coste total recibe el Código Postal.
     * Tipo Embalaje recibe las características del producto a enviar.
     */
    public static final String Pale="Hay que utilizar el pale para el transporte";
    public static final String CajaCarton="Hay que utilizar la caja de carton para el transporte";
    public static final String CajaMadera="Hay que utilizar la caja de madera para el transporte";

    Float costeTotal(Integer CP);
    Integer tipoEmbalaje(Float x,Float y,Float z,Float peso);
}
