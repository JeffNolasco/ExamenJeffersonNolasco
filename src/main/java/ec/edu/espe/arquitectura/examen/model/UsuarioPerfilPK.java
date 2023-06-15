package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UsuarioPerfilPK implements Serializable {
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer cod_usuario;
    @Column(name = "COD_PERFIL", length = 8, nullable = false)
    private String cod_perfil;

    public UsuarioPerfilPK() {

    }

    public UsuarioPerfilPK(Integer cod_usuario, String cod_perfil) {
        this.cod_usuario = cod_usuario;
        this.cod_perfil = cod_perfil;
    }

    public Integer getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Integer cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getCod_perfil() {
        return cod_perfil;
    }

    public void setCod_perfil(String cod_perfil) {
        this.cod_perfil = cod_perfil;
    }

    @Override
    public String toString() {
        return "SegUsuarioPerfilPK [cod_usuario=" + cod_usuario + ", cod_perfil=" + cod_perfil + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod_usuario == null) ? 0 : cod_usuario.hashCode());
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
        UsuarioPerfilPK other = (UsuarioPerfilPK) obj;
        if (cod_usuario == null) {
            if (other.cod_usuario != null)
                return false;
        } else if (!cod_usuario.equals(other.cod_usuario))
            return false;
        if (cod_perfil == null) {
            if (other.cod_perfil != null)
                return false;
        } else if (!cod_perfil.equals(other.cod_perfil))
            return false;
        return true;
    }

    

}
