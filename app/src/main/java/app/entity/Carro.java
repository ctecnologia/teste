package app.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String modelo;
	private String nome;
	private int ano;

	@ManyToOne(cascade = CascadeType.ALL)
	private Marca marca;
	
	@ManyToAny(cascade = CascadeType.ALL) //Salve o carro e com todos os objetos que tem dentro, no caso o prorietario
	@JoinTable(name = "carro_proprietario")
	private List<Proprietario> proprietarios;
}
