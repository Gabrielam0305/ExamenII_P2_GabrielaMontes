/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_gabrielamontes;

import java.util.ArrayList;

/**
 *
 * @author Gabriela Montes
 */
public class Equipo {
    private String nombre;
    private int puntos;
    private ArrayList <Partido> listapartidos=new ArrayList();

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Partido> getListapartidos() {
        return listapartidos;
    }

    public void setListapartidos(ArrayList<Partido> listapartidos) {
        this.listapartidos = listapartidos;
    }
    

    @Override
    public String toString() {
        return  nombre +" "+puntos;
    }
    
}
