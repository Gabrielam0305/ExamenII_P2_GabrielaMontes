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
public class Torneo {
    private String nombre;
    private ArrayList <Equipo> equiposparticipantes=new ArrayList();
    private ArrayList <Partido> listapartidos=new ArrayList();
    private String periodo;

    public Torneo(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }
        

    public Torneo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquiposparticipantes() {
        return equiposparticipantes;
    }

    public void setEquiposparticipantes(ArrayList<Equipo> equiposparticipantes) {
        this.equiposparticipantes = equiposparticipantes;
    }

    public ArrayList<Partido> getListapartidos() {
        return listapartidos;
    }

    public void setListapartidos(ArrayList<Partido> listapartidos) {
        this.listapartidos = listapartidos;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}
