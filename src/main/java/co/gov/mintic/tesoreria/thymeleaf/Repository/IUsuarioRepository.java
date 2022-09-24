package co.gov.mintic.tesoreria.thymeleaf.Repository;


import co.gov.mintic.tesoreria.thymeleaf.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

}