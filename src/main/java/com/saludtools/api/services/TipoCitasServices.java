package com.saludtools.api.services;

import com.saludtools.api.entity.TipoCitas;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Juan Esteban Londoño
 */
public interface TipoCitasServices {

    /* Busca todos los tipos de citas */
    List<TipoCitas> buscarTodosLosTipoDeCitas();

    /* Guarda o actualiza un tipo de cita */
    TipoCitas alterarTiposDeCitas(TipoCitas tipoCitasModel);

    /* Elimina un tipo de cita por su idCita */
    void eliminarTipoCitas(Integer idCita);

    /* Elimina un tipo de cita por su idCita */
    TipoCitas buscarTipoCitaPorId(Integer idCita);

}
