/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicahospital;
import models.*;
/**
 *
 * @author ESTUDIANTE
 */
import java.util.Date;

public class ClinicaHospital {
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital("Clinica Santa Maria", "Cartagena");
        System.out.println(hospital);

        Consulta c1 = new Consulta(new Date(), "Dolor de cabeza", "Migraña", 30);
        Consulta c2 = new Consulta(new Date(), "Dolor abdominal", "Gastritis", 45);
        Consulta c3 = new Consulta(new Date(), "Fiebre alta", "Infección viral", 20);

        hospital.registrarConsulta(c1);
        hospital.registrarConsulta(c2);
        hospital.registrarConsulta(c3);

        Medico m1 = new Medico("123", "Dr. Juan Pérez", 45, "3001234567", "Neurología", 101);
        Medico m2 = new Medico("456", "Dra. María Gómez", 38, "3009876543", "Medicina Interna", 202);

        System.out.println(m1);
        System.out.println(m2);

        m1.atender(c1);
        m2.atender(c2);
    }
}
