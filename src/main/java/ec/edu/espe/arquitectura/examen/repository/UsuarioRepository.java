package ec.edu.espe.arquitectura.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
