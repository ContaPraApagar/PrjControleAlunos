package PRJ.controle.alunos.PRJ.controle.alunos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PRJ.controle.alunos.PRJ.controle.alunos.repository.AlunoRepository;


@Service
public class AlunoServices {
	private final AlunoRepository alunoRepository;
	
	@Autowired
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
    
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno getAlunoById(Long id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public List<Aluno> getAllAluno() {
		return alunoRepository.findAll();
	}
	
	public void deleteAluno(Long id) {
		alunoRepository.deleteById(id);
	}
}
