package co.gov.mintic.tesoreria.thymeleaf.Service;


import co.gov.mintic.tesoreria.thymeleaf.Entities.Usuario;
import co.gov.mintic.tesoreria.thymeleaf.Repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("UserDetailsService")
public class LoginService implements UserDetailsService {

    @Autowired
    private IUsuarioRepository usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findByUsername(username);

        if(usuario == null){
            throw new UsernameNotFoundException(username);
        }

        var roles = new ArrayList<GrantedAuthority>();

        roles.add(new SimpleGrantedAuthority( usuario.getRol().getDescripcion()));

        return new User(usuario.getUsername(), usuario.getClave(), roles);
    }
}