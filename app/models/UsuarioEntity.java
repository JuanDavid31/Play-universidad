package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "usuario")
public class UsuarioEntity extends Model {

    @Id
    private int cId;
    @Constraints.Required
    private String dNombre;
    private List<CancionEntity> canciones;
    public static final Finder<Integer, UsuarioEntity> find = new Finder<>(UsuarioEntity.class);

    public UsuarioEntity() {
        canciones = new ArrayList<CancionEntity>();
    }

    @Column(name = "c_id")
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "d_nombre")
    public String getdNombre() {
        return dNombre;
    }

    public void setdNombre(String dNombre) {
        this.dNombre = dNombre;
    }

    @OneToMany(mappedBy = "usuario")
    public List<CancionEntity> getCanciones() {
        return canciones;
    }

    @Override
    public String toString() {
        return "UsuarioEntity{" +
                "cId=" + cId +
                ", dNombre='" + dNombre + '\'' +
                '}';
    }
}
