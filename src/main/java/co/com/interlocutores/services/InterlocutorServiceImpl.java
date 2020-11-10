package co.com.interlocutores.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.interlocutores.model.Direccion;
import co.com.interlocutores.model.Interlocutor;
import co.com.interlocutores.model.InterlocutorId;
import co.com.interlocutores.repositories.DireccionRepository;
import co.com.interlocutores.repositories.InterlocutorRepository;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@Service
public class InterlocutorServiceImpl implements InterlocutorService {

	@Autowired
	private final InterlocutorRepository interlocutorRepository;
	
	//@Autowired
    private final DireccionRepository direccionRepository;
	
	@Autowired
	public InterlocutorServiceImpl(final InterlocutorRepository interlocutorRepository, final DireccionRepository direccionRepository) {
		 this.interlocutorRepository = interlocutorRepository;
		 this.direccionRepository = direccionRepository;
	}
	
	
	/*@Override
	@Transactional(readOnly = true)*/
	public List<Interlocutor> findAll() {
		return interlocutorRepository.findAll();
	}

	/*@Override
	public Interlocutor findByIdAddr(Sort id) {
		// TODO Auto-generated method stub
		return interlocutorRepository.findAll(id) ;
	}*/

	@Override
	public Interlocutor save(Interlocutor entity) {
		// TODO Auto-generated method stub
		return interlocutorRepository.save(entity);
	}
	
	@Override
	public Interlocutor update(Interlocutor entity) {
        return interlocutorRepository.save(entity);
    }

	@Override
//	@Transactional(readOnly = true)
	public List<Interlocutor> findByDireccion(long id) {
		// TODO Auto-generated method stub
		return interlocutorRepository.findByDireccion(id);
	}

	/*@Override
	public Optional<Interlocutor> findById(InterlocutorId id) {
		// TODO Auto-generated method stub
		return interlocutorRepository.findById(id);
	}*/
	
	@Override
	public void deleteById(InterlocutorId id) {
		interlocutorRepository.deleteById(id);
	}


	@Override
	public Optional<Interlocutor> findById(InterlocutorId id) {
		// TODO Auto-generated method stub
		return interlocutorRepository.findById(id);
	}
	
	/*public Interlocutor addInterlocutor(Interlocutor interlocutor) {
		 
        Direccion dir = direccionRepository.findById(interlocutor);
        if (null == dir) {
            dir = new Direccion();
        }
        dir.setDeptName(interlocutor.getDepartment().getDeptName());
        employee.setDepartment(dept);
        return employeeRepository.save(employee);
    }*/

}
