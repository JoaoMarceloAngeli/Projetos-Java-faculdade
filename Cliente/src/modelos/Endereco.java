/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author eduar
 */
public class Endereco {
	private String logradouro = "";
	private int numero = 0;
	private String complemento = "";
	private int cep = 0;
        private String cidade = "";
        private String estado = "";
	public Endereco(String logradouro, int numero, String complemento, int cep, String cidade, String estado) throws Exception{
            if(logradouro.isEmpty())throw new Exception("o logradouro nao pode estar vazio");
            this.logradouro = logradouro;
            if(numero<=0)throw new Exception("o numero nao pode ser menor ou igual a 0");
            this.numero = numero;
            if(complemento.isEmpty())throw new Exception("o complemento nao pode estar vazio");
            this.complemento = complemento;
            if(cep<=0)throw new Exception("o cep nao pode ser menor ou igual a 0");
            this.cep = cep;
            if(cidade.isEmpty())throw new Exception("a cidade nao pode estar vazia");
            this.cidade = cidade;
            if(estado.isEmpty())throw new Exception("o estado nao pode estar vazia");
            this.estado = estado; 
	}
	public Endereco(){
	}
	public String getLogradouro() {
            return logradouro;
	}
	public void setLogradouro(String logradouro) throws Exception{
            if(logradouro.isEmpty())throw new Exception("o logradouro nao pode estar vazio");
            this.logradouro = logradouro;
	}
	public int getNumero() {
            return numero;
	}
	public void setNumero(int numero) throws Exception{
            if(numero<=0)throw new Exception("o numero nao pode ser menor ou igual a 0");
            this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) throws Exception{
            if(complemento.isEmpty())throw new Exception("o complemento nao pode estar vazio");
            this.complemento = complemento;
	}
	public int getCep() {
            return cep;
	}
	public void setCep(int cep) throws Exception{
            if(cep<=0)throw new Exception("o cep nao pode ser menor ou igual a 0");
            this.cep = cep;
	}
        public String getCidade() {
            return cidade;
        }
        public void setCidade(String cidade) throws Exception{
            if(cidade.isEmpty())throw new Exception("a cidade nao pode estar vazia");
            this.cidade = cidade;
        }
        public String getEstado() {
            return estado;
        }
        public void setEstado(String estado) throws Exception{
            if(estado.isEmpty())throw new Exception("o estado nao pode estar vazia");
            this.estado = estado;
        }
        @Override
        public String toString() {
            return logradouro + ";" + numero + ";" + complemento + ";" + cep + ";" + cidade + ";" + estado;
        }      
}
