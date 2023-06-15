package ec.edu.espe.arquitectura.examen.service;

import java.util.List;

import ec.edu.espe.arquitectura.examen.model.Perfil;
import ec.edu.espe.arquitectura.examen.repository.PerfilRepository;

public class PerfilService {
    
    private final PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository segPerfilRepository) {
        this.perfilRepository = segPerfilRepository;
    }

    public List<Perfil> listByNombre(String nombre) {
         return this.perfilRepository.findByNombreLikeOrderByNombre(nombre);
    }
}
