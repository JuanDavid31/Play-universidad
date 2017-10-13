package models;


import java.util.*;
import javax.persistence.*;
import java.math.BigInteger;
import io.ebean.*;



@Entity
@Table(name = "cancion")
public class CancionEntity extends Model {

    @Id
    private int cId;
    private String dNombre;
    private String dUri;
    private UsuarioEntity usuario;
    public static final Finder<Integer, CancionEntity> find = new Finder<>(CancionEntity.class);

    @Column(name = "c_id")
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Column(name = "d_nombre")
    public String getdNombre() {
        return dNombre;
    }

    public void setdNombre(String dNombre) {
        this.dNombre = dNombre;
    }

    @Column(name = "d_uri")
    public String getdUri() {
        return dUri;
    }

    public void setdUri(String dUri) {
        this.dUri = dUri;
    }

    @ManyToOne(optional = false) @JoinColumn(name = "c_id_usuario")
    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
}
