package one.dio.gof.model;

    import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Cliente {

	/**
	 * "@Getter" e "@Setter" são utilizado com a dependencia da biblioteca "lombok".
	 * 
	 * @see <a href = "https://projectlombok.org/features/GetterSetter">Documentation</a>
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;

	//Com a library LOMBOK não se faz necessário o uso dessas estruturas abaixo.

	/* public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	} */

}
