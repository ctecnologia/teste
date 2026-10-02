package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Acessorio;
import app.repository.AcessorioRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AcessorioService {

	private final AcessorioRepository acessorioRepository;
	
	public String save(Acessorio acessorio) {
		this.acessorioRepository.save(acessorio);
		return acessorio.getNome()+" salvo com sucesso!";
	}
	
	public String update(Acessorio acessorio, Long id) {
		acessorio.setId(id);
		this.acessorioRepository.save(acessorio);
		return acessorio.getNome()+" atualizado com sucesso!";
	}
	
	public String delete(Long id) {
		this.acessorioRepository.deleteById(id);
		return "Acessorio deletado com sucesso!";
	}
	
	public List<Acessorio> findAll(){
		List<Acessorio> lista = this.acessorioRepository.findAll();
		return lista;
	}
	
	public Acessorio findById(Long id) {
		Acessorio acessorio = this.acessorioRepository.findById(id).get();
		return acessorio;
	}
}
