/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casovinilosventana;

/**
 *
 * @author diego
 */
public class Vinilo {
    private String titulo;
    private String año;

    public Vinilo(String titulo, String año) {
        this.titulo = titulo;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", año=" + año;
    }
    
}
