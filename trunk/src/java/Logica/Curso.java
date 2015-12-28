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
public class Curso {

    private String codigo;
    private String nome;
    private String area;
    private List listaCandidatos;

    public Curso(String codigo, String nome, String area, List listaCandidatos) {
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
        this.listaCandidatos = listaCandidatos;
    }

    public String getArea() {
        return area;
    }

    public String getCodigo() {
        return codigo;
    }

    public List getListaCandidatos() {
        return listaCandidatos;
    }

    public String getNome() {
        return nome;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setListaCandidatos(List listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
