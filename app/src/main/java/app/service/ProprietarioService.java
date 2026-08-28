package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Proprietario;
import app.repository.ProprietarioRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProprietarioService {

private final ProprietarioRepository proprietarioRespository;
	
	public String save(Proprietario proprietario) {
		this.proprietarioRespository.save(proprietario);
		return "Proprietário salvo com sucesso!";
	}
	
	public String update(Proprietario proprietario, Long id) {
		proprietario.setId(id);
		this.proprietarioRespository.save(proprietario);
		return "Proprietário atualizado com sucesso!";
	}
	
	public String delete(Long id) {
		this.proprietarioRespository.deleteById(id);
		return "Carro deletado com sucesso!";
	}
	
	public List<Proprietario> findAll(){
		List<Proprietario> lista = this.proprietarioRespository.findAll();
		return lista;
	}
	
	public Proprietario findById(Long id) {
		Proprietario proprietario = this.proprietarioRespository.findById(id).get();
		return proprietario;
	}
}
