package vamosJuntos;

import javax.persistence.*;

@Entity
@Table(name = "coche")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String edad;
    private String añosC;
    private String dni;
    private String numT;
    private String modelo;
    private int plazas;
    private String localidad;

    public Coche(){

    }

    public Coche(String nombre, String edad, String añosC, String dni, String numT, String modelo, int plazas, String localidad, long id) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosC = añosC;
        this.dni = dni;
        this.numT = numT;
        this.modelo = modelo;
        this.plazas = plazas;
        this.localidad = localidad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getAñosC() {
        return añosC;
    }

    public String getDni() {
        return dni;
    }

    public String getNumT() {
        return numT;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPlazas() {
        return plazas;
    }

    public String getLocalidad() {
        return localidad;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "vamosJuntos.Coche{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", añosC='" + añosC + '\'' +
                ", dni='" + dni + '\'' +
                ", numT='" + numT + '\'' +
                ", modelo='" + modelo + '\'' +
                ", plazas=" + plazas +
                ", localidad='" + localidad + '\'' +
                ", id=" + id +
                '}';
    }
}
