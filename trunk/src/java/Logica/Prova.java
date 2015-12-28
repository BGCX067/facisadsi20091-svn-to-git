/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Phederal
 */
public class Prova {

    private String codigo;
    private String disciplina;
    private double nota;

    public Prova(String codigo, String disciplina, double nota) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
