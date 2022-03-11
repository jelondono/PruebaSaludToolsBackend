package com.saludtools.api.services.impl;

import com.saludtools.api.entity.TipoCitas;
import com.saludtools.api.dao.TipoCitasRepository;
import com.saludtools.api.services.TipoCitasServices;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Esteban Londoño
 */
@Service
@Transactional
public class TipoCitasServicesImpl implements TipoCitasServices {

    @Autowired
    private TipoCitasRepository repoTipoCitas;

    @Override
    public List<TipoCitas> buscarTodosLosTipoDeCitas() {
        return repoTipoCitas.findAll();
    }

    @Override
    public TipoCitas alterarTiposDeCitas(TipoCitas tipoCitasModel) {
        if (tipoCitasModel.getId() == null) {
            tipoCitasModel.setFecCreacion(new Date());
            tipoCitasModel.setFecActualizacion(new Date());
        } else {
            tipoCitasModel.setFecActualizacion(new Date());
        }
        return repoTipoCitas.save(tipoCitasModel);
    }

    @Override
    public void eliminarTipoCitas(Integer id) {
        repoTipoCitas.deleteById(id);
    }

    @Override
    public TipoCitas buscarTipoCitaPorId(Integer id) {
        Optional<TipoCitas> objectCita = repoTipoCitas.findById(id);
        return objectCita.isPresent() ? objectCita.get() : null;
    }

}
