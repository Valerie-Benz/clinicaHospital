/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ESTUDIANTE
 */
import java.util.ArrayList;

public class Hospital {
    private String nombre;
    private String ciudad;
    private ArrayList<Consulta> consultas;

    public Hospital(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consultas = new ArrayList<>();
    }

    public void registrarConsulta(Consulta consulta) {
        consultas.add(consulta);
        System.out.println("Consulta registrada: " + consulta);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    @Override
    public String toString() {
        return "Hospital " + nombre + " en " + ciudad + " con " + consultas.size() + " consultas registradas.";
    }
}
