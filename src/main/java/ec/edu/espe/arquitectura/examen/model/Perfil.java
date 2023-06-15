package ec.edu.espe.arquitectura.examen.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_PERFIL")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_PERFIL", nullable = false)
    private String cod_perfil;
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @OneToMany(mappedBy = "segPerfil")
    private List<UsuarioPerfil> segUsuarioPerfil;

    public Perfil() {

    }

    public Perfil(String codigo_perfil) {
        this.cod_perfil = codigo_perfil;
    }

    public String getCod_perfil() {
        return cod_perfil;
    }

    public void setCod_perfil(String codigo_perfil) {
        this.cod_perfil = codigo_perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Seg_Perfil [codigo_perfil=" + cod_perfil + ", nombre=" + nombre + ", version=" + version + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod_perfil == null) ? 0 : cod_perfil.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perfil other = (Perfil) obj;
        if (cod_perfil == null) {
            if (other.cod_perfil != null)
                return false;
        } else if (!cod_perfil.equals(other.cod_perfil))
            return false;
        return true;
    }

}
