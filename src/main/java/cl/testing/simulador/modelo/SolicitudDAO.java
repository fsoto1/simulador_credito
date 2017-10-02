/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.modelo;

import cl.testing.simulador.entidades.Solicitud;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Franco
 */
@Service
public class SolicitudDAO {
    @PersistenceContext
    private EntityManager em;
    
    //@Transactional (rollbackFor = ServicioException.class);
    @Transactional(rollbackFor = ServicioException.class)
    public void create(Solicitud dto) throws ServicioException{
        em.persist(dto);
    }
}
