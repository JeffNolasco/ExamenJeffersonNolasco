package ec.edu.espe.arquitectura.examen.model;

import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "SEG_USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer cod_usuario;
    @Column(name = "MAIL", length = 128, nullable = false)
    private String mail;
    @Column(name = "CLAVE", length = 64, nullable = false)
    private String clave;
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @Column(name = "INTENTOS_FALLIDOS", precision = 8, nullable = false)
    private BigDecimal intentos_fallidos;
    @Column(name = "SUELDO", precision = 8, scale = 2, nullable = false)
    private BigDecimal sueldo;
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date Fecha_Nacimiento;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @OneToMany(mappedBy = "segUsuario")
    private List<UsuarioPerfil> segUsuarioPerfil;

    public Usuario() {

    }

    public Usuario(Integer codigo) {
        this.cod_usuario = codigo;
    }

    public Integer getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Integer codigo) {
        this.cod_usuario = codigo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getIntentos_fallidos() {
        return intentos_fallidos;
    }

    public void setIntentos_fallidos(BigDecimal intentos_fallidos) {
        this.intentos_fallidos = intentos_fallidos;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Seg_Usuario [codigo=" + cod_usuario + ", mail=" + mail + ", clave=" + clave + ", nombre=" + nombre
                + ", intentos_fallidos=" + intentos_fallidos + ", sueldo=" + sueldo + ", Fecha_Nacimiento="
                + Fecha_Nacimiento + ", version=" + version + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod_usuario == null) ? 0 : cod_usuario.hashCode());
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
        Usuario other = (Usuario) obj;
        if (cod_usuario == null) {
            if (other.cod_usuario != null)
                return false;
        } else if (!cod_usuario.equals(other.cod_usuario))
            return false;
        return true;
    }

}
