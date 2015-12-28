/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.List;

/**
 *
 * @author Phederal
 */
public class Candidato {

    private String nome;
    private String cpf;
    private String rg;
    private char sexo;
    private int idade;
    private String email;
    private String inscricao;
    private List listaprova;
    private Curso curso;

    public Candidato(){

    }

    public String getCpf() {
        return cpf;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public String getInscricao() {
        return inscricao;
    }

    public List getListaprova() {
        return listaprova;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public void setListaprova(List listaprova) {
        this.listaprova = listaprova;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
