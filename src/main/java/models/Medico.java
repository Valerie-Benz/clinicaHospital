/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ESTUDIANTE
 */
public class Medico extends Persona {
    private String especialidad;
    private int consultorio;

    public Medico(String cedula, String nombre, int edad, String telefono, String especialidad, int consultorio) {
        super(cedula, nombre, edad, telefono);
        this.especialidad = especialidad;
        this.consultorio = consultorio;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getConsultorio() { return consultorio; }
    public void setConsultorio(int consultorio) { this.consultorio = consultorio; }

    public void atender(Consulta consulta) {
        System.out.println("El médico " + getNombre() + " atendió la consulta: " + consulta.getMotivo());
    }

    @Override
    public String toString() {
        return super.toString() + " - Especialidad: " + especialidad + " Consultorio: " + consultorio;
    }
}
