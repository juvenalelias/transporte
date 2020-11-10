package co.com.interlocutores.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="direcciones")
public class Direccion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_direccion")
    private Long id;
	private String pais;
    private String departamento;
    private String ciudad;
    private int estado;
    private String direccion;
    
	@OneToMany(mappedBy="direccion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)// 
    private Set<Interlocutor> interlocutores;
	
	public Direccion() {
    }

    public Direccion(String pais, String departamento, String ciudad, int estado, String direccion) {
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.estado = estado;
        this.direccion= direccion;
    }

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public String getPais() {
		return pais;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public Set<Interlocutor> getInterlocutores() {
		return interlocutores;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
	
}
