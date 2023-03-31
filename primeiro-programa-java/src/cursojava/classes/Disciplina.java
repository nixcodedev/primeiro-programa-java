package cursojava.classes;

import java.util.Objects;


/*Essa classe Disciplina servirá para todos os objetos e instância de notas e matérias(disciplinas)*/
public class Disciplina {

	private double nota;
	private String Disciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Disciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(Disciplina, other.Disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", Disciplina=" + Disciplina + "]";
	}

}
