package vamosJuntos;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String localidad;
    private String fecha;
    private String hora;
    private String info;
    private String bitmap;

    public Evento(){

    }

    public Evento(int id,String nom, String localidad, String fecha, String hora, String info , String bitmap) {
        this.id=id;
        this.nom = nom;
        this.localidad = localidad;
        this.fecha = fecha;
        this.hora = hora;
        this.info = info;
        this.bitmap = bitmap;
    }
    public Evento(int id,String nom, String localidad, String fecha, String hora, String info) {
        this.id=id;
        this.nom = nom;
        this.localidad = localidad;
        this.fecha = fecha;
        this.hora = hora;
        this.info = info;
    }

    public String getNom() {
        return nom;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getFecha() {
        return fecha +"/"+this.getHora();
    }

    private String getHora() {
        return hora;
    }

    public String getInfo() {
        return info;
    }

    public long getId() {
        return id;
    }

    public String getBitmap() {
        return bitmap;
    }


    @Override
    public String toString() {
        return "vamosJuntos.Evento{" +
                "nom='" + nom + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", info='" + info + '\'' +
                ", bitmap=" + bitmap +
                '}';
    }
}
