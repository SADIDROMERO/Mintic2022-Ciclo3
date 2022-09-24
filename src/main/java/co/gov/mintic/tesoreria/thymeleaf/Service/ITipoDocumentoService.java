package co.gov.mintic.tesoreria.thymeleaf.Service;

import co.gov.mintic.tesoreria.thymeleaf.Entities.TipoDocumento;

import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumento findById(int id);

    public List<TipoDocumento> finAll();

    public TipoDocumento createTipoDocumento(TipoDocumento tipoDocumento);

    public TipoDocumento updateTipoDocumento(int id, TipoDocumento tipoDocumento);

    public void deleteTipoDocumento(int id);

    }

