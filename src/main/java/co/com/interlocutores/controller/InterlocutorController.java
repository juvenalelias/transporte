package co.com.interlocutores.controller;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.interlocutores.model.Interlocutor;
import co.com.interlocutores.model.InterlocutorId;
import co.com.interlocutores.services.InterlocutorService;

@RestController
@RequestMapping("/interlocutores")
public class InterlocutorController {
	
	@Autowired
    private InterlocutorService interlocutorService;
	
	@GetMapping
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})//value = "/{id}", 
	@ResponseBody
    public ResponseEntity<List<Interlocutor>> getInterlocutores() {
		List<Interlocutor> interlocutores = interlocutorService.findAll();
        return new ResponseEntity<>(interlocutores, HttpStatus.OK);
//		return ResponseEntity.ok(interlocutorService.findAll());
		 
	}
	
	@GetMapping("/{direccionId}")
	@ResponseBody
    public ResponseEntity<?> findByDireccion(@PathVariable (value = "direccionId") Long direccionId) {
		
        return ResponseEntity.ok(interlocutorService.findByDireccion(direccionId));
    }
	
	@PostMapping("/create")
    public ResponseEntity<Interlocutor> createInterlocutor(@RequestBody Interlocutor interlocutor) {
		Interlocutor emp = interlocutorService.save(interlocutor);
        return new ResponseEntity<>(emp, HttpStatus.OK);
//		return interlocutorService.save(interlocutor);
    }
	
	@PutMapping("/update")
    public ResponseEntity<Interlocutor> updateInterlocutor(@RequestBody Interlocutor interlocutor) {
 
		Interlocutor intr = interlocutorService.update(interlocutor);
        return new ResponseEntity<>(intr, HttpStatus.OK);
    }
	
	/*@PutMapping("/update/{interlocutorId}")
	@ResponseBody
    public Optional<Interlocutor> update(@PathVariable InterlocutorId interlocutorId, @RequestBody Interlocutor interRequest) {
        return interlocutorService.findById(interlocutorId).map(inter -> {
        	inter.setNombre1(interRequest.getNombre1());
        	inter.setNombre2(interRequest.getNombre2());
        	inter.setApellido1(interRequest.getApellido1());
        	inter.setApellido2(interRequest.getApellido2());
        	inter.setComentarios(interRequest.getComentarios());
        	inter.setDireccion(interRequest.getDireccion());
        	inter.setEstado(interRequest.getEstado());
        	inter.setIdentificacion(interRequest.getIdentificacion());
        	inter.setIdExterno(interRequest.getIdExterno());
        	inter.setFechaCreacion(interRequest.getFechaCreacion());
        	
            return interlocutorService.save(inter);
        });
    }*/
	

}
