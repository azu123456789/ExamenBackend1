package com.example.clinicalspringbootMunoz.Modelos;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "historiasClinicas")
public class Historia_clinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String grupoSanguineo;
    @Column(length = 50, nullable = false)
    private String alergias;
    @Column(length = 50, nullable = false)
    private String enfermedadesPrevias;
    @Column(length = 50, nullable = false)
    private String medicamentosActuales;
    @Column(length = 50, nullable = false)
    private String antecedentesFamiliares;
    @Column(length = 50, nullable = false)
    private LocalDate fechaUltimaConsulta;
    @Column(length = 50, nullable = false)
    private String estadoActual;
    @Column(length = 50, nullable = false)
    private String motivoConsulta;
    @Column(length = 50, nullable = false)
    private String recomendaciones;

    @OneToOne(mappedBy = "historiaClinica")
    private Paciente paciente;

    public Historia_clinica() {
    }

    public Historia_clinica(Integer id, String grupoSanguineo, String alergias, String enfermedadesPrevias, String medicamentosActuales, String antecedentesFamiliares, LocalDate fechaUltimaConsulta, String estadoActual, String motivoConsulta, String recomendaciones, Paciente paciente) {
        this.id = id;
        this.grupoSanguineo = grupoSanguineo;
        this.alergias = alergias;
        this.enfermedadesPrevias = enfermedadesPrevias;
        this.medicamentosActuales = medicamentosActuales;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.fechaUltimaConsulta = fechaUltimaConsulta;
        this.estadoActual = estadoActual;
        this.motivoConsulta = motivoConsulta;
        this.recomendaciones = recomendaciones;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadesPrevias() {
        return enfermedadesPrevias;
    }

    public void setEnfermedadesPrevias(String enfermedadesPrevias) {
        this.enfermedadesPrevias = enfermedadesPrevias;
    }

    public String getMedicamentosActuales() {
        return medicamentosActuales;
    }

    public void setMedicamentosActuales(String medicamentosActuales) {
        this.medicamentosActuales = medicamentosActuales;
    }

    public String getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void setAntecedentesFamiliares(String antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public LocalDate getFechaUltimaConsulta() {
        return fechaUltimaConsulta;
    }

    public void setFechaUltimaConsulta(LocalDate fechaUltimaConsulta) {
        this.fechaUltimaConsulta = fechaUltimaConsulta;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
