package co.gov.mintic.tesoreria.thymeleaf.Service;

import co.gov.mintic.tesoreria.thymeleaf.Entities.TipoDocumento;
import co.gov.mintic.tesoreria.thymeleaf.Repository.ITipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService implements ITipoDocumentoService{

    @Autowired
    private ITipoDocumentoRepository tipoDocumentoRepository;
    @Override
    public TipoDocumento findById(int id) {
        Optional<TipoDocumento> tipoDocumento = tipoDocumentoRepository.findById((long) id);
        return tipoDocumento.get();
    }

    @Override
    public List<TipoDocumento> finAll() {
        List<TipoDocumento> tiposDeDocumento = (List<TipoDocumento>) tipoDocumentoRepository.findAll();
        return tiposDeDocumento;
    }

    @Override
    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento newTipoDocumento = tipoDocumentoRepository.save(tipoDocumento);
        return newTipoDocumento;
    }

    @Override
    public TipoDocumento updateTipoDocumento(int id, TipoDocumento tipoDocumento) {
        TipoDocumento putTipoDocumento = tipoDocumentoRepository.save(tipoDocumento);
        return putTipoDocumento;
    }

    @Override
    public void deleteTipoDocumento(int id) {
        tipoDocumentoRepository.deleteById((long) id);
    }
}
