package com.saludtools.api.controller;

import com.saludtools.api.entity.TipoCitas;
import com.saludtools.api.model.ApiResponse;
import com.saludtools.api.services.TipoCitasServices;
import java.util.List;

import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan Esteban Londoño
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TipoCitasController {

    @Autowired
    private TipoCitasServices serviceTipoCitas;

    @GetMapping("/listarTipoCitas")
    public ApiResponse<TipoCitas> traerListadoTipoCitas() {
        try {
            List<TipoCitas> respuesta = serviceTipoCitas.buscarTodosLosTipoDeCitas();

            if (respuesta == null) {
                return new ApiResponse<>(HttpStatus.NOT_FOUND.value(), "No hay registros de tipos de citas", respuesta);
            }
            return new ApiResponse<>(HttpStatus.OK.value(), "Se ha encontrado tipos de citas", respuesta);
        } catch (Exception e) {
            return new ApiResponse<>(HttpStatus.CONFLICT.value(),
                    "Ocurrio un error en el servidor, contacte con el administrador", false);
        }
    }

    @GetMapping("/buscarTipoCitaPorId/{idCita}")
    public ApiResponse<TipoCitas> buscarTipoCitaPorId(@PathVariable Integer idCita) {
        try {
            TipoCitas respuesta = serviceTipoCitas.buscarTipoCitaPorId(idCita);
            if (respuesta == null) {
                return new ApiResponse<>(HttpStatus.NOT_FOUND.value(),
                        "No se encuentra ningun tipo de cita con el ID " + idCita, respuesta);
            }
            return new ApiResponse<>(HttpStatus.OK.value(), "Se ha encontrado tipos de citas", respuesta);
        } catch (Exception e) {
            return new ApiResponse<>(HttpStatus.CONFLICT.value(),
                    "Ocurrio un error en el servidor, contacte con el administrador", false);
        }
    }

    @PostMapping("/alterarInformacionTipoCitas")
    public ApiResponse<TipoCitas> alterarInformacionTipoCitas(@RequestBody TipoCitas tipoCitasModel) {
        try {
            Integer tieneId = tipoCitasModel.getId();

            TipoCitas respuesta = serviceTipoCitas.alterarTiposDeCitas(tipoCitasModel);

            if (respuesta == null) {
                return new ApiResponse<>(HttpStatus.NOT_FOUND.value(), "No hay registros de tipos de citas", respuesta);
            }
            if (tieneId == null) {
                return new ApiResponse<>(HttpStatus.OK.value(), "Se ha guardado con exito", respuesta);
            }
            return new ApiResponse<>(HttpStatus.OK.value(), "Se ha actualizado con exito", respuesta);

        } catch (Exception e) {
            return new ApiResponse<>(HttpStatus.CONFLICT.value(),
                    "Ocurrio un error en el servidor, contacte con el administrador", false);
        }
    }

    @GetMapping("/eliminarTipoDeCita/{idCita}")
    public ApiResponse<TipoCitas> eliminarTipoDeCita(@PathVariable Integer idCita) {
        try {
            TipoCitas respuesta = serviceTipoCitas.buscarTipoCitaPorId(idCita);
            if (respuesta == null) {
                return new ApiResponse<>(HttpStatus.NOT_FOUND.value(), "No existe este tipo de cita", false);
            }
            serviceTipoCitas.eliminarTipoCitas(idCita);
            return new ApiResponse<>(HttpStatus.OK.value(), "Se ha eliminado el tipo de cita", true);
        } catch (Exception e) {
            return new ApiResponse<>(HttpStatus.CONFLICT.value(),
                    "Ocurrio un error en el servidor, contacte con el administrador", false);
        }
    }

}
