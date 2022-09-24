package co.gov.mintic.tesoreria.thymeleaf.Service;

import co.gov.mintic.tesoreria.thymeleaf.Entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public Usuario findById(long id);

    public List<Usuario> findAll();

    public Usuario createUsuario(Usuario usuario);

    public Usuario updateUsuario(Usuario usuario);

    public void deleteUsuario(long id);
}
