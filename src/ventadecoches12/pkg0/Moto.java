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
public class Moto extends Vehiculo {
    private int numRuedas;
    
    
    // Constructor por defecto
    public Moto() {
    }
    
    // Constructor con parametros
    public Moto(String marca, String modelo, int añofabricacion, int kms, int potencia, double precio, Tipocombustible.Combustible combustible, Medidas medidas, int numRuedas) {
        super(marca, modelo, añofabricacion, kms, potencia, precio, combustible, medidas);
        this.numRuedas = numRuedas;
    }
    
    public Moto(Moto m) {
        super(m.getMarca(), m.getModelo(), m.getAñofabricacion(), m.getKms(), m.getPotencia(), m.getPrecio(), m.getCombustible(), m.getMedidas());
        this.numRuedas = m.getnumRuedas();
    }
    // Getters & Setters
        public int getnumRuedas() {
        return numRuedas;
    }

    public void setnumRuedas(int r) {
        this.numRuedas = r;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Moto" + super.toString() + " Numero de ruedas: "+ this.numRuedas + '}';
    }
    
    @Override
    public int hashCode() 
    {
        int hash;
        hash = 7;
        hash = 41 * hash + Objects.hashCode(this.numRuedas);
         
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
        final Moto other = (Moto) obj;
        return this.numRuedas == other.numRuedas;
    }
}
