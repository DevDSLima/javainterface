/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceatv1;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public  abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }


    
    
}
