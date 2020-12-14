/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tesji.agencia.modelo;

/**
 *
 * @author USUARIO
 */
public class AgenciaModel {

    //DATOS (Deben estar encapsulados --private--)
    private double precioCompra;
    private String origen;

    //public double getPrecioCompra(){
    //  return precioCompra;
    //}
    //public void setPrecioCompra(double precioCompra){
    //  this.precioCompra = precioCompra;
    //}
    //OPERACIONES (Metodos)
    public String calcularPrecioVenta() {
        double precioVenta;
        double aumento = 0;
        boolean bandera = true;

        switch (getOrigen()) {
            case "Italia":
                aumento = getPrecioCompra() * 0.35;
                break;
            case "Japon":
                aumento = getPrecioCompra() * 0.30;
                break;
            case "Alemania":
                aumento = getPrecioCompra() * 0.40;
                break;
            case "USA":
                aumento = getPrecioCompra() * 0.25;
                break;
            case "Nacional":

                break;
            default:
                bandera = false;
        }
        if (bandera) {
            precioVenta = getPrecioCompra() + aumento;
            return "El precio de Venta es de $" + precioVenta;
        } else {
            return "Debe seleccionar el Origen";

        }
        /**
         * @return the precioCompra
         */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
