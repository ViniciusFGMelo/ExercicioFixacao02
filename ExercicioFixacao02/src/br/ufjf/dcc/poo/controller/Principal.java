package br.ufjf.dcc.poo.controller;

import java.util.ArrayList;

import br.ufjf.dcc.poo.model.Aluno;
import br.ufjf.dcc.poo.model.Disciplina;
import br.ufjf.dcc.poo.model.Professor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disciplina d1= new Disciplina();

		d1.setNome("POO");

		d1.setCargaHoraria(60);


		Disciplina d2= new Disciplina();

		d2.setNome("Modelagem");

		d2.setCargaHoraria(60);


		Disciplina d3= new Disciplina();

		d3.setNome("BD");

		d3.setCargaHoraria(60);


		Disciplina d4= new Disciplina();

		d3.setNome("Redes");

		d3.setCargaHoraria(60);


		ArrayList<Disciplina> disciplinasAluno = new ArrayList<Disciplina>();

		disciplinasAluno.add(d1);

		disciplinasAluno.add(d2);

		disciplinasAluno.add(d3);


		ArrayList<Disciplina> disciplinasProfessor = new ArrayList<Disciplina>();

		disciplinasProfessor.add(d3);

		disciplinasProfessor.add(d4);


		Aluno a = new Aluno();


		a.setNome("Afú");

		a.setIdade(30);

		a.setSexo("M");

		a.setMatricula("2511547");

		a.setMensalidade(950.00f);

		a.setBolsa(120.00f);

		a.setDisciplinas(disciplinasAluno);


		Aluno a2 = new Aluno();

		a2.setNome("Carol");

		a2.setIdade(25);

		a2.setSexo("F");

		a2.setMatricula("7741582");

		a2.setMensalidade(950.00f);

		a2.setBolsa(120.00f);

		a2.setDisciplinas(disciplinasAluno);



		Professor p = new Professor();


		p.setNome("Fulano");

		p.setIdade(45);

		p.setSexo("M");

		p.setCodigo("8877492");

		p.setHoraAula(2f);

		p.setFormacao("Doutorado");

		p.setQuantidadeAulas(30);

		p.setDisciplinas(disciplinasProfessor);



		ArrayList<Aluno> alunosDisciplina = new ArrayList<>();

		alunosDisciplina.add(a);

		alunosDisciplina.add(a2);


		Disciplina d5 = new Disciplina();

		d5.setNome("Prog Web");

		d5.setCargaHoraria(60);

		d5.setProfessores(p);

		d5.setAlunos(alunosDisciplina);


		for(Aluno aluno : d5.getAlunos()) {

		System.out.println("Nome: "+aluno.getNome());

		System.out.println("Sexo: "+aluno.getSexo());

		}
		
	}

}
