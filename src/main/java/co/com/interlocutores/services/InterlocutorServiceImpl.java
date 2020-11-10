package co.com.interlocutores.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.interlocutores.model.Interlocutor;
import co.com.interlocutores.model.InterlocutorId;
import co.com.interlocutores.repositories.InterlocutorRepository;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@Service
public class InterlocutorServiceImpl implements InterlocutorService {

	private final InterlocutorRepository interlocutorRepository;
	
	@Autowired
	public InterlocutorServiceImpl(final InterlocutorRepository interlocutorRepository) {
		 this.interlocutorRepository = interlocutorRepository;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Interlocutor> findAll() {
		return interlocutorRepository.findAll();
	}

	/*@Override
	public Interlocutor findByIdAddr(Sort id) {
		// TODO Auto-generated method stub
		return interlocutorRepository.findAll(id) ;
	}*/

	@Override
	public Interlocutor save(Interlocutor interlocutor) {
		// TODO Auto-generated method stub
		return interlocutorRepository.save(interlocutor);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Interlocutor> findByDireccion(long id) {
		// TODO Auto-generated method stub
		return interlocutorRepository.findByDireccion(id);
	}

	@Override
	public Optional<Interlocutor> findById(InterlocutorId id) {
		// TODO Auto-generated method stub
		return interlocutorRepository.findById(id);
	}

}
