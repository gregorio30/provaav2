/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author jgregorio
 */
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String telefone;
    private String endereco;
    private String email;
    private String nome;
    private String cpf;
    private String cnpj;
    private String razaosocial;
    private int avaliacao;

    public Cliente() {
    }

    public Cliente(long id, String telefone, String endereco, String email, String nome, String cpf, String cnpj,
            String razaosocial,int avaliacao) {
        this.id = id;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.razaosocial = razaosocial;
        this.avaliacao = avaliacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }



    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}

