/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * 
 */
public class Especi extends Categoria  {
    private String ani; //Año de la pelicula

    public Especi(String ani, String categoria, String NombrePeli) {
        super(categoria, NombrePeli);
        this.ani = ani;
    }

    public String getAni() {
        return ani;
    }

    public void setAni(String ani) {
        this.ani = ani;
    }
    
    
}
