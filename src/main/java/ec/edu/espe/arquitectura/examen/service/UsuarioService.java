package ec.edu.espe.arquitectura.examen.service;

import ec.edu.espe.arquitectura.examen.model.Usuario;
import ec.edu.espe.arquitectura.examen.repository.UsuarioRepository;
import jakarta.transaction.Transactional;

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    //@Transactional
    //public Usuario create(Usuario usuario) {
        //Usuario usuarioTmp = this.usuarioRepository.findById(usuario.getCod_usuario());
        //if (usuarioTmp == null) {
        //    return this.usuarioRepository.save(usuario);
        //} else {
        //    throw new RuntimeException("Usuario ya existe");
        //}
   // }
}
