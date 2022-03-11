package com.saludtools.api.dao;

import com.saludtools.api.entity.TipoCitas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juan Esteban Londoño
 */
public interface TipoCitasRepository extends JpaRepository<TipoCitas, Integer> {
    /* Se crea con el fin de implementar consultas personalizadas */
}
