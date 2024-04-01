package PRJ.controle.alunos.PRJ.controle.alunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.GeneratedValue;

@RestController
@RequestMapping("/aluno")

public class AlunoController {
 private final AlunoService alunoService;
 
 @Autowired
 public AlunoController(AlunoService alunoService) {
	 this.alunoService = alunoService;
 }
 
 @PostMapping
 public Aluno createAluno(@RequestBody Aluno aluno) {
	 return alunoService.saveAluno(aluno);
 }
 
 @GetMapping("/{id}")
 public Aluno getAluno(@PathVariable Long id) {
	 return alunoService.getAlunoById(id);
 }
 
 @GetMapping
 public List<Aluno> getAllAluno() {
	 return alunoService.getAllaluno();
 }
 
 @DeleteMapping("/{id}")
 public void deleAluno(@PathVariable Long id) {
	 alunoService.deleteAluno(id);
 }
 
}
