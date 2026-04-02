/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;
import java.time.LocalDate;

   public class Eleitor {
    private String nome =" ";
    private int anoNascimento=0;

    public Eleitor(String nome, int anoNascimento) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("Nome não pode ser vazio.");
        }
        this.nome = nome;

        if (anoNascimento <= 0) {
            throw new Exception("Ano de nascimento não pode ser vazio ou negativo.");
        }
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("O nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception {
        if (anoNascimento <= 0) {
            throw new Exception("O ano de nascimento não pode ser menor ou igual a 0.");
        }
        this.anoNascimento = anoNascimento;
    }

    public String calcularTipo() {
        int anoAtual = 2024;
        int idade = anoAtual - this.anoNascimento;

        if (idade < 16) {
            return "Não eleitor";
        } else if ((idade >= 16 && idade < 18) || idade > 65) {
            return "Eleitor facultativo";
        } else {
            return "Eleitor obrigatório";
        }
    }

    public String getTipoEleitor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
