/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casovinilosventana;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Coleccion {
    private ArrayList<Vinilo>vinilos;

    public Coleccion() {
        this.vinilos = new ArrayList();
    }

    public void agregarVinilo(String x, String y){
        vinilos.add(new Vinilo(x,y));
    }
    public boolean buscarVinilo(String x){
        boolean y=false;
        for (int i = 0; i < vinilos.size(); i++) {
            if (vinilos.get(i).getTitulo().equalsIgnoreCase(x)) {
                y=true;
            }
        }
        return y;
    }
    public ArrayList<Vinilo> resultadoBusqueda(String x){
        ArrayList<Vinilo> s = new ArrayList();
        for (int i = 0; i < 10; i++) {
            if (vinilos.get(i).getTitulo().equalsIgnoreCase(x)) {
                s.add(vinilos.get(i));
            }
        }
        return s;
    }
    public ArrayList<Vinilo> getVinilos() {
        return vinilos;
    }

    public void setVinilos(ArrayList<Vinilo> vinilos) {
        this.vinilos = vinilos;
    }
    
}
