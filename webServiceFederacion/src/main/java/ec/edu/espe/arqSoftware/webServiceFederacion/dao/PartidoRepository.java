package ec.edu.espe.arqSoftware.webServiceFederacion.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import webservicefederacion.arqsoftware.espe.edu.ec.ws.Partido;

public interface PartidoRepository extends JpaRepository<Partido, String> {
    
    List<Partido> findByFecha(Date Fecha);
}
