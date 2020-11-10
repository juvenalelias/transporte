package co.com.interlocutores.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="interlocutores")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Interlocutor implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
	@EmbeddedId
//	@AttributeOverride(name = "id", column = @Column(name = "id_interlocutor"))
    private InterlocutorId interlocutorID;
	
    private String idExterno;
    private String identificacion;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String comentarios;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    private int estado;
    
    @Enumerated(EnumType.STRING)
    private TipoIdentificacion tipoIdentificacion;
    
    //@MapsId("direccion_id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)//,  optional = false
    @JoinColumn(foreignKey = @ForeignKey(name = "direccion_id"), name = "direccion_id")
//    @JoinColumn(name="direccion_id", nullable=false)
    private Direccion direccion;
    
    
	/*public Interlocutor() {
		//super();
	}

	public Interlocutor(InterlocutorId interlocutorID, String idExterno, String identificacion, String nombre1,
			String nombre2, String apellido1, String apellido2, String comentarios, Date fechaCreacion, int estado,
			TipoIdentificacion tipoIdentificacion, Direccion direccion) {
		//super();
		this.interlocutorID = interlocutorID;
		this.idExterno = idExterno;
		this.identificacion = identificacion;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.comentarios = comentarios;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
		this.tipoIdentificacion = tipoIdentificacion;
		this.direccion = direccion;
	}

	
	public String getIdExterno() {
		return idExterno;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public String getNombre1() {
		return nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public String getComentarios() {
		return comentarios;
	}

	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public InterlocutorId getInterlocutorID() {
		return interlocutorID;
	}

	public void setInterlocutorID(InterlocutorId interlocutorID) {
		this.interlocutorID = interlocutorID;
	}

	public void setIdExterno(String idExterno) {
		this.idExterno = idExterno;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}*/
	
	
       
}
