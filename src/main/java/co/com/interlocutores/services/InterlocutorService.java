package co.com.interlocutores.services;

import java.util.List;
import java.util.Optional;

import co.com.interlocutores.model.Interlocutor;
import co.com.interlocutores.model.InterlocutorId;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;


public interface InterlocutorService {
	
	public List<Interlocutor> findAll();
	public Interlocutor save(Interlocutor interlocutor);
	public List<Interlocutor> findByDireccion(long id);
	public Optional<Interlocutor> findById(InterlocutorId id);
	

}
