package co.gov.mintic.tesoreria.thymeleaf.Repository;


import co.gov.mintic.tesoreria.thymeleaf.Entities.TipoDocumento;
import org.springframework.data.repository.CrudRepository;

public interface ITipoDocumentoRepository extends CrudRepository<TipoDocumento, Long> {

}