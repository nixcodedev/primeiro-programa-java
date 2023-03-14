package cursojava.classes;

import java.util.Objects;

public class Disciplina {

	private double nota1;
	private String Disciplina1;
	private double nota2;
	private String Disciplina2;
	private double nota3;
	private String Disciplina3;
	private double nota4;
	private String Disciplina4;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public String getDisciplina1() {
		return Disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		Disciplina1 = disciplina1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public String getDisciplina2() {
		return Disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		Disciplina2 = disciplina2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public String getDisciplina3() {
		return Disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		Disciplina3 = disciplina3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public String getDisciplina4() {
		return Disciplina4;
	}

	public void setDisciplina4(String disciplina4) {
		Disciplina4 = disciplina4;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Disciplina1, Disciplina2, Disciplina3, Disciplina4, nota1, nota2, nota3, nota4);
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
		return Objects.equals(Disciplina1, other.Disciplina1) && Objects.equals(Disciplina2, other.Disciplina2)
				&& Objects.equals(Disciplina3, other.Disciplina3) && Objects.equals(Disciplina4, other.Disciplina4)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}

	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota1 + ", Disciplina1=" + Disciplina1 + ", nota2=" + nota2 + ", Disciplina2="
				+ Disciplina2 + ", nota3=" + nota3 + ", Disciplina3=" + Disciplina3 + ", nota4=" + nota4
				+ ", Disciplina4=" + Disciplina4 + "]";
	}
	
	

}
