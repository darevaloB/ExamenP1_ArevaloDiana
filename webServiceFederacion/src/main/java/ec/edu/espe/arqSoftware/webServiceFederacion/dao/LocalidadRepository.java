/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqSoftware.webServiceFederacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicefederacion.arqsoftware.espe.edu.ec.ws.Localidad;

/**
 *
 * @author Diana
 */
public interface LocalidadRepository extends JpaRepository<Localidad, String> {
    
}
