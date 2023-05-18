/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventadecoches12.pkg0;

import java.util.Objects;

/**
 *
 * @author ivani
 */
public class Industrial extends Vehiculo{
    private float tamCaja;
    
    // Constructor por defecto
    public Industrial() {
    }
    
    // Constructor con parametros
    public Industrial(String marca, String modelo, int añofabricacion, int kms, int potencia, double precio, Tipocombustible.Combustible combustible, Medidas medidas, float tamCaja) {
        super(marca, modelo, añofabricacion, kms, potencia, precio, combustible, medidas);
        this.tamCaja = tamCaja;
    }
 
    
    // Método toString
    @Override
    public String toString() {
        return "Industrial" + super.toString() + " Tamaño caja "+ this.tamCaja + '}';
    }
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode() 
    {
        int hash;
        hash = 7;
        hash = 41 * hash + Objects.hashCode(this.tamCaja);
         
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Industrial other = (Industrial) obj;
        return Float.floatToIntBits(this.tamCaja) == Float.floatToIntBits(other.tamCaja);
    }

    /**
     * @return the tamCaja
     */
    public float getTamCaja() {
        return tamCaja;
    }

    /**
     * @param tamCaja the tamCaja to set
     */
    public void setTamCaja(float tamCaja) {
        this.tamCaja = tamCaja;
    }

    
    

}
