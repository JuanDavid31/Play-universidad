package models;


import java.util.*;
import javax.persistence.*;
import java.math.BigInteger;
import io.ebean.*;



@Entity
@Table(name = "cancion", schema = "public", catalog = "playdb")
public class CancionEntity extends Model {
    private BigInteger cId;
    private String dNombre;

    @Id
    @Column(name = "c_id")
    public BigInteger getcId() {
        return cId;
    }

    public void setcId(BigInteger cId) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CancionEntity that = (CancionEntity) o;

        if (cId != null ? !cId.equals(that.cId) : that.cId != null) return false;
        if (dNombre != null ? !dNombre.equals(that.dNombre) : that.dNombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId != null ? cId.hashCode() : 0;
        result = 31 * result + (dNombre != null ? dNombre.hashCode() : 0);
        return result;
    }
}
