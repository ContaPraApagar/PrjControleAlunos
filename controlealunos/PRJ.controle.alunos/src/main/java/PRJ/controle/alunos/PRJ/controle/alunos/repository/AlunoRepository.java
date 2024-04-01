package PRJ.controle.alunos.PRJ.controle.alunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import PRJ.controle.alunos.PRJ.controle.alunos.entities.AlunoEntities;

public interface AlunoRepository extends JpaRepository<AlunoEntities, Long> {
	
}