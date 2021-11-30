/*
 * Copyright (c) 2021 sebas.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    sebas - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.arqSoftware.webServiceFederacion.service;

import ec.edu.espe.arqSoftware.webServiceFederacion.dao.PartidoRepository;

import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import webservicefederacion.arqsoftware.espe.edu.ec.ws.Partido;


@Service
@Slf4j
public class PartidoService {

    private final PartidoRepository partidoRepository;

    public PartidoService(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }

    public List<Partido> getByFecha(Date fecha) {
        return this.partidoRepository.findByFecha(fecha);
    }
}
