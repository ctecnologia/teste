package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Carro;
import app.entity.Marca;
import app.repository.CarroRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CarroService {

	private final CarroRepository carroRespository;
	
	public String save(Carro carro) {
		this.carroRespository.save(carro);
		return "Carro salvo com sucesso!";
	}
	
	public String update(Carro carro, long id) {
		carro.setId(id);
		this.carroRespository.save(carro);
		return "Carro atualizado com sucesso!";
	}
	
	public String delete(long id) {
		this.carroRespository.deleteById(id);
		return "Carro deletado com sucesso!";
	}
	
	public List<Carro> findAll(){
		List<Carro> lista = this.carroRespository.findAll();
		return lista;
	}
	
	public Carro findById(long id) {
		Carro carro = this.carroRespository.findById(id).get();
		return carro;
	}
	
	public List<Carro> findByNome(String nome){
		return this.carroRespository.findByNome(nome);
	}
	
	public List<Carro> findByMarca(long idMarca){
		Marca marca = new Marca();
		marca.setId(idMarca);
		return this.carroRespository.findByMarca(marca);
	}
	
	public List<Carro> findAcimaAno(int ano){
		return this.carroRespository.findAcimaAno(ano);
	}
}
