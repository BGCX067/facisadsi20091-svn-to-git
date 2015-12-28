/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author Phederal
 */
public class Disciplina {

    private String codigo;
    private String nome;
    private String ementa;

    public Disciplina(String codigo, String nome, String ementa) {
        this.codigo = codigo;
        this.nome = nome;
        this.ementa = ementa;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
