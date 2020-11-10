package co.com.interlocutores.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.interlocutores.model.Interlocutor;
import co.com.interlocutores.model.InterlocutorId;

@Repository
public interface InterlocutorRepository extends JpaRepository<Interlocutor, InterlocutorId> {
	public List<Interlocutor> findByDireccion(long id);
}
