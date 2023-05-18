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
public class Turismo extends Vehiculo {
    public enum Tipocarroceria {
        Compacto, Berlina, Suv, Monovolumen, Descapotable;
    }   
    
    
    
    private Tipocarroceria tipocarroceria;
    
     // Constructor por defecto
    public Turismo() {
    }
    
    // Constructor con parametros
    public Turismo(String marca, String modelo, int añofabricacion, int kms, int potencia, double precio, Tipocombustible.Combustible combustible, Medidas medidas, Tipocarroceria carroceria) {
        super(marca, modelo, añofabricacion, kms, potencia, precio, combustible, medidas);
        this.tipocarroceria = carroceria;
    }
    
    public Turismo(Turismo m) {
        
        super(m.getMarca(), m.getModelo(), m.getAñofabricacion(), m.getKms(), m.getPotencia(), m.getPrecio(), m.getCombustible(), m.getMedidas());
        this.tipocarroceria = m.getTipocarroceria();
     
    }

    /**
     * @return the tipocarroceria
     */
    public Tipocarroceria getTipocarroceria() {
        return tipocarroceria;
    }

    /**
     * @param tipocarroceria the tipocarroceria to set
     */
    public void setTipocarroceria(Tipocarroceria tipocarroceria) {
        this.tipocarroceria = tipocarroceria;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Turismo" + super.toString() + " Tipo de carroceria: "+ this.tipocarroceria + '}';
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
        hash = 41 * hash + Objects.hashCode(this.tipocarroceria);
         
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
        final Turismo other = (Turismo) obj;
        return this.tipocarroceria == other.tipocarroceria;
    }
}
