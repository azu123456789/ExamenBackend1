# Proyecto Clínica Spring Boot

Este proyecto fue hecho para el parcial práctico de Programación Backend I.  
El tema era **modelar entidades y relaciones 1:1** usando **Spring Boot, JPA y MySQL**.

---

## 🏥 Descripción

La idea es representar una **Clínica Médica**, con sus entidades principales.  
Se crean las clases (modelos) con sus atributos y relaciones uno a uno.

El proyecto se llama:
clinica Spring Boot Munoz


---

## Entidades

Cada entidad tiene **mínimo 10 atributos** (incluyendo el id).

- **Paciente** → representa al paciente de la clínica.  
- **HistoriaClinica** → contiene la información médica del paciente.  
- **Medico** → representa al doctor.  
- **TarjetaProfesional** → información profesional del médico.
- **Sexo** → Información intima del paciente.
- **Ocupación**→ Información intima del paciente.

---

## 🔗 Relaciones 1:1

- Paciente ↔ HistoriaClinica  
- Medico ↔ TarjetaProfesional  

Se usaron las anotaciones:
```java
@OneToOne
@JoinColumn(name = "id_xxx")
@Entity
@Table(name = "xxx")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

para la union con la base datos se utilizo

spring.datasource.url=jdbc:h2:mem:clinica
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true


