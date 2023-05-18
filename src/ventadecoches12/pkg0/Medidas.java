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
public class Medidas {
    private int alto,ancho,largo;
    
    
    // contructores por defecto, con parametros y copia
    public Medidas () {
         alto = 0;
         ancho = 0;
         largo = 0;
    }
    
    
    public Medidas(int alto, int ancho, int largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
          
    }
    
    public Medidas(Medidas m) {
        this.alto = m.alto;
        this.ancho = m.ancho;
        this.largo = m.largo;
          
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.alto);
        hash = 41 * hash + Objects.hashCode(this.ancho); 
        hash = 41 * hash + Objects.hashCode(this.largo);
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
        final Medidas other = (Medidas) obj;
        if (this.alto != other.alto) {
            return false;
        }
        if (this.ancho != other.ancho) {
            return false;
        }
        return this.largo == other.largo;
    }
    
     // Método toString
    @Override
    public String toString() {
        return "Alto: " + this.alto + " Ancho: " + this.ancho + " Largo: " + this.largo;
    }
}
