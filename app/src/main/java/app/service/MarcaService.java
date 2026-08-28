package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Marca;
import app.repository.MarcaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MarcaService {

	private final MarcaRepository marcaRepository;
	
	public String save(Marca marca) {
		this.marcaRepository.save(marca);
		return "Marca salvo com sucesso!";
	}
	
	public String update(Marca marca, Long id) {
		marca.setId(id);
		this.marcaRepository.save(marca);
		return "Marca atualizado com sucesso!";
	}
	
	public String delete(Long id) {
		this.marcaRepository.deleteById(id);
		return "Marca deletado com sucesso!";
	}
	
	public List<Marca> findAll(){
		List<Marca> lista = this.marcaRepository.findAll();
		return lista;
	}
	
	public Marca findById(Long id) {
		Marca marca = this.marcaRepository.findById(id).get();
		return marca;
	}
}
