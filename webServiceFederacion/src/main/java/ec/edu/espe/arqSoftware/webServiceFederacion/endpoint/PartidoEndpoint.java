package ec.edu.espe.arqSoftware.webServiceFederacion.endpoint;


import ec.edu.espe.arqSoftware.webServiceFederacion.exception.CreateException;
import ec.edu.espe.arqSoftware.webServiceFederacion.service.PartidoService;
import java.math.BigDecimal;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import webservicefederacion.arqsoftware.espe.edu.ec.ws.ObtenerPartidosRequest;
import webservicefederacion.arqsoftware.espe.edu.ec.ws.ObtenerPartidosResponse;
import webservicefederacion.arqsoftware.espe.edu.ec.ws.Partido;

@Endpoint
@Slf4j
public class PartidoEndpoint {
    private static final String NAMESPACE_URI = "http://ec.edu.espe.arqSoftware.webServiceFederacion/ws";

    private final PartidoService service;

    @Autowired
    public PartidoEndpoint(PartidoService service){
        this.service = service;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerPartidoRequest")
    @ResponsePayload
    public ObtenerPartidosResponse obtenerProductos(@RequestPayload ObtenerPartidosRequest request) throws CreateException{
        Optional<Partido> partidoOpt = this.service.getByFecha(request.getFecha());
        if (partidoOpt.isPresent()) {
            ObtenerPartidosResponse response = new ObtenerPartidosResponse();
            response.setPartido(partidoOpt.get());
            return response;
        } else {
            log.error("No existen partidos posteriores a la fecha: {} no existen en la base de datos", request.getFecha());
            throw new CreateException("Mensaje: "+"los productos en esa fecha"+request.getFecha()+" no existe en la base de datos");
        }
    }


   
}
