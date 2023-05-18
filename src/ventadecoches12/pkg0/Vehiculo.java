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
public abstract class Vehiculo {
    
   // public enum Combustible {
   //     diesel, gasolina, hibrido, electrico, GLP;
    //}   
    
    protected String marca;
    protected String modelo;
    protected int añofabricacion;
    protected int kms;
    protected int potencia;
    protected double precio;
    protected Tipocombustible.Combustible combustible;
    protected Medidas medidas;

    // contructor por defecto, con parametros y copia
    
    public Vehiculo () {
         marca = "null";
         modelo = "null";
         añofabricacion = 0;
         kms = 0;
         potencia = 0;
         precio = 0;
         combustible = Tipocombustible.Combustible.GLP;
         medidas = new Medidas();
    }
    
    
    public Vehiculo(String marca, String modelo, int añofabricacion, int kms, int potencia, double precio, Tipocombustible.Combustible combustible, Medidas medidas) {
        this.marca = marca;
        this.modelo = modelo;
        this.añofabricacion = añofabricacion;
        this.kms = kms;
        this.potencia = potencia;
        this.precio = precio;
        this.combustible = combustible;
        this.medidas = medidas;  
    }
    
    public Vehiculo(Vehiculo v) {
        this.marca = v.marca;
        this.modelo = v.modelo;
        this.añofabricacion = v.añofabricacion;
        this.kms = v.kms;
        this.potencia = v.potencia;
        this.precio = v.precio;
        this.combustible = v.combustible;
        this.medidas = v.medidas;  
    }
    
    // getters y setters
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the añofabricacion
     */
    public int getAñofabricacion() {
        return añofabricacion;
    }

    /**
     * @param añofabricacion the añofabricacion to set
     */
    public void setAñofabricacion(int añofabricacion) {
        this.añofabricacion = añofabricacion;
    }

    /**
     * @return the kms
     */
    public int getKms() {
        return kms;
    }

    /**
     * @param kms the kms to set
     */
    public void setKms(int kms) {
        this.kms = kms;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the combustible
     */
    public Tipocombustible.Combustible getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(Tipocombustible.Combustible combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the medidas
     */
    public Medidas getMedidas() {
        return medidas;
    }

    /**
     * @param medidas the medidas to set
     */
    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }
    
    // Hascode
    
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.añofabricacion);
        hash = 41 * hash + Objects.hashCode(this.combustible); 
        hash = 41 * hash + Objects.hashCode(this.kms);
        hash = 41 * hash + Objects.hashCode(this.marca); 
        hash = 41 * hash + Objects.hashCode(this.medidas);
        hash = 41 * hash + Objects.hashCode(this.modelo);
        hash = 41 * hash + Objects.hashCode(this.potencia);
        hash = 41 * hash + Objects.hashCode(this.precio); 
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
        final Vehiculo other = (Vehiculo) obj;
        if (this.añofabricacion != other.añofabricacion) {
            return false;
        }
        if (this.kms != other.kms) {
            return false;
        }
        if (this.potencia != other.potencia) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (this.combustible != other.combustible) {
            return false;
        }
        return Objects.equals(this.medidas, other.medidas);
    }
    
     // Método toString

    @Override
    public String toString() {
        return "{" + "marca=" + marca + ", modelo=" + modelo + ", añofabricacion=" + añofabricacion + ", kms=" + kms + ", potencia=" + potencia + ", precio=" + precio + ", combustible=" + combustible + ", medidas=" + medidas;
    }
    
    
    // metodo para pasar de kw a cv
    
    private double getPotenciakw() {
      return this.potencia * 1.34; 
    }
}
