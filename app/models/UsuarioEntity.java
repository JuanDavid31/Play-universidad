package models;

import com.sun.org.apache.xpath.internal.operations.Mod;
import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "usuario", schema = "public", catalog = "playdb")
public class UsuarioEntity extends Model {

    @Id
    private int cId;
    private String dNombre;
    public static final Finder<Integer, UsuarioEntity> find = new Finder<>(UsuarioEntity.class);

    @Id
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

    @Override
    public String toString() {
        return "UsuarioEntity{" +
                "cId=" + cId +
                ", dNombre='" + dNombre + '\'' +
                '}';
    }
}
