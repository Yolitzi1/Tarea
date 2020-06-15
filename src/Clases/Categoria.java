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
public class Categoria extends Principal {
    private String categoria;

    public Categoria(String categoria, String NombrePeli) {
        super(NombrePeli);
        this.categoria = categoria;
    }

    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
