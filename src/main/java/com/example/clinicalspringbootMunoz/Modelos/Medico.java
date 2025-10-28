package com.example.clinicalspringbootMunoz.Modelos;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nombreCompleto;
    @Column(length = 50, nullable = false)
    private String especialidad;
    @Column(length = 50, nullable = false)
    private String correo;
    @Column(length = 50, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private Integer antiguedad;
    @Column(length = 50, nullable = false)
    private String clinica;
    @Column(length = 50, nullable = false)
    private LocalDate fechaNacimiento;
    @Column(length = 50, nullable = false)
    private String direccion;
    @Column(length = 50, nullable = false)
    private String idiomaPrincipal;


    @OneToOne
    @JoinColumn(name="tarjeta_profesional_id" , referencedColumnName = "id")
    private  Tarjeta_Profesional tarjetaProfesional;

    public Medico() {
    }

    public Medico(Integer id, String nombreCompleto, String especialidad, String correo, String telefono, Integer antiguedad, String clinica, LocalDate fechaNacimiento, String direccion, String idiomaPrincipal, Tarjeta_Profesional tarjetaProfesional) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
        this.correo = correo;
        this.telefono = telefono;
        this.antiguedad = antiguedad;
        this.clinica = clinica;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.idiomaPrincipal = idiomaPrincipal;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdiomaPrincipal() {
        return idiomaPrincipal;
    }

    public void setIdiomaPrincipal(String idiomaPrincipal) {
        this.idiomaPrincipal = idiomaPrincipal;
    }

    public Tarjeta_Profesional getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(Tarjeta_Profesional tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
}
