/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularedad;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Persona {

    private String identidad;
    private String nombres;
    private String apellidos;
    private String correo;
    private String genero;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String identidad, String nombres, String apellidos, String correo, String genero, Date fechaNacimiento) {
        this.identidad = identidad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void obtenerNombre(){
    }
    
    public int calcularEdad(){      
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.fechaNacimiento);
        int yearFechaNacimiento = calendar.get(Calendar.YEAR,);
        int mesNacimiento = calendar.get(Calendar.MONTH);
        int diaNacimiento = calendar.get(Calendar.DAY_OF_MONTH);
        Period edad = Period.between(LocalDate.of(yearFechaNacimiento,mesNacimiento,diaNacimiento),LocalDate.now());
        return edad.getYears();
    }
    
    public void modificarIdentificacion(){
        
    }
}
