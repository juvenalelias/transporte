package co.com.interlocutores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.interlocutores.model.Direccion;
import co.com.interlocutores.model.InterlocutorId;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {

}
