package co.com.interlocutores.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class InterlocutorId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inter_seq")
    @SequenceGenerator(initialValue = 1, name = "inter_seq", sequenceName = "interlocutor_sequence")*/ 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_interlocutor", nullable = false)
    private Long id;
	
	@Column(name = "tipo_interlocutor", updatable = false)//, insertable = false
	private Long tipoInterlocutor;
	
	/*public InterlocutorId() {

	}
	
	public InterlocutorId(Long id, Long tipoInterlocutor) {
//		super();
		this.id = id;
		this.tipoInterlocutor = tipoInterlocutor;
	}

	public Long getId() {
		return id;
	}

	public void setIdInterlocutor(Long id) {
		this.id = id;
	}

	public Long getTipoInterlocutor() {
		return tipoInterlocutor;
	}

	public void setTipoInterlocutor(Long tipoInterlocutor) {
		this.tipoInterlocutor = tipoInterlocutor;
	}*/
	
}
