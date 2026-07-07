/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mister Floppy Disk
 */
public class ArvoreBinaria implements iArvore{
    private No raiz = null;
    private String[] ordenarPor = new String[]{"",""};

    public ArvoreBinaria() {
        raiz = null;
        ordenarPor = new String[]{"",""};
    }
    
    public ArvoreBinaria(Aluno elemento, String campoOrdenamento1, String campoOrdenamento2) {
        raiz = new No(elemento, campoOrdenamento1, campoOrdenamento2);
        ordenarPor[0] = campoOrdenamento1;
        ordenarPor[1] = campoOrdenamento2;
    }
    
    public ArvoreBinaria(String campoOrdenamento1, String campoOrdenamento2) {
        raiz = null;
        ordenarPor[0] = campoOrdenamento1;
        ordenarPor[1] = campoOrdenamento2;
    }
    
    private No inserirRecursivo(No raiz, Aluno elemento)throws Exception{
        try {
            String chave;
            if(ordenarPor[0].compareTo("Nome") == 0){
                chave = elemento.getNome(); 
            }
            else {
                chave = elemento.getMatricula();
            }
            if(ordenarPor[1].compareTo("---") == 0){
                chave = "".concat(chave);
            }
            else if(ordenarPor[1].compareTo("Turno") == 0){
                chave = elemento.getTurno().concat(chave);
            }
            else if (ordenarPor[1].compareTo("Periodo") == 0){
                chave = (elemento.getPeriodo()+"").concat(chave);
            }
            else if (ordenarPor[1].compareTo("Curso") == 0){
                chave = elemento.getCurso().concat(chave);
            }
            else{
                chave = elemento.getEnfase().concat(chave);
            }
            if(raiz != null && raiz.getDado().equals(elemento)) throw new Exception("O Elemento já existe");
            if(raiz == null) {
                raiz = new No(elemento, ordenarPor[0], ordenarPor[1]);
            }
            else if(chave.compareTo(raiz.getChaves()[1]) < 0){
                raiz.setEsquerda(inserirRecursivo(raiz.getEsquerda(), elemento));
            }
            else{
                raiz.setDireita(inserirRecursivo(raiz.getDireita(), elemento));
            }
            return raiz;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public void incluir(Aluno elemento) throws Exception{
        try {
            raiz = inserirRecursivo(raiz, elemento);
        } catch (Exception erro) {
            throw erro;
        }
    }

    /*@Override
    public ArvoreBinaria clonar() throws Exception{
        try{
            return (ArvoreBinaria) this.clone();
        } catch(Exception erro){
            throw erro;
        }
    }*/
    
    @Override
    public List<String> getChaves(){
        List<String> lista = new ArrayList<>();
        getChavesRercursivo(raiz, lista);
        return lista;
    }
    
    private void getChavesRercursivo(No noAtual, List<String> lista){
        if(noAtual == null) return;
        lista.add(noAtual.getChaves()[0]);
        getChavesRercursivo(noAtual.getEsquerda(), lista);
        getChavesRercursivo(noAtual.getDireita(), lista);
    }
    
    @Override
    public List<Aluno> getDadosOrdenados(String opcao){
        List<Aluno> lista = new ArrayList<>();
        switch(opcao){
            case "Crescente":
                getCrescente(raiz, lista);
                break;
            case "Decrescente":
                getDecrescente(raiz, lista);
                break;
        }
        return lista;
    }
    
    private void getCrescente(No noAtual, List<Aluno> lista){
        if(noAtual == null) return;
        getCrescente(noAtual.getEsquerda(), lista);
        lista.add(noAtual.getDado());
        getCrescente(noAtual.getDireita(), lista);
    }
    
    private void getDecrescente(No noAtual, List<Aluno> lista){
        if(noAtual == null) return;
        getDecrescente(noAtual.getDireita(), lista);
        lista.add(noAtual.getDado());
        getDecrescente(noAtual.getEsquerda(), lista);
    }
    
    @Override
    public List<Aluno> buscarNaArvore(String chave){
        List<Aluno> listaBusca = new ArrayList<>();
        buscarNaArvoreRecursivo(raiz, chave, listaBusca);
        return listaBusca;
    }
    
    private void buscarNaArvoreRecursivo(No noAtual, String chave, List<Aluno> lista){
        if(noAtual == null) return;
        //if(noAtual.getChave().equals(chave))  saida = saida + noAtual.getDado().toString() + "\n";
        if(noAtual.getChaves()[0].contains(chave)){
            lista.addLast(noAtual.getDado());
        }
        buscarNaArvoreRecursivo(noAtual.getEsquerda(), chave, lista);
        buscarNaArvoreRecursivo(noAtual.getDireita(), chave, lista);
    }
    
    private Aluno menorElemento(No noAtual){
        String menorChave = noAtual.getChaves()[0];
        Aluno menorAluno = noAtual.getDado();
        while(noAtual.getEsquerda() != null){
            menorChave = noAtual.getEsquerda().getChaves()[0];
            menorAluno = noAtual.getDado();
            noAtual = noAtual.getEsquerda();
        }
        return menorAluno;
    }
    
    @Override
    public void deletar(String chave) throws Exception{
        List<Aluno> lista = buscarNaArvore(chave);
        if(lista.size() == 1){
            if(ordenarPor[1].compareTo("---") == 0){
                chave = "".concat(chave);
            }
            else if(ordenarPor[1].compareTo("Turno") == 0){
                chave = lista.get(0).getTurno().concat(chave);
            }
            else if (ordenarPor[1].compareTo("Periodo") == 0){
                chave = (lista.get(0).getPeriodo()+"").concat(chave);
            }
            else if (ordenarPor[1].compareTo("Curso") == 0){
                chave = lista.get(0).getCurso().concat(chave);
            }
            else{
                chave = lista.get(0).getEnfase().concat(chave);
            }
            raiz = deletarRecursivo(raiz, chave);
            System.out.println(chave.codePointAt(0));
        }
        else if (lista.size() > 1 && ordenarPor[0].compareTo("Nome") == 0){
            String listagemDeInstâncias = "";
            for(Aluno aluno : lista){
                listagemDeInstâncias = listagemDeInstâncias + aluno.toString();
            }
            throw new Exception("Não é possivel realizar a exclusão pelo nome pois "
                    + "há mais de uma instância com o mesmo nome\n" + listagemDeInstâncias);
        }
    }
    
    private No deletarRecursivo(No noAtual, String chave) {
        // Retorne se a árvore estiver vazia
        if (noAtual == null){ 
            System.out.println(chave + "; NULL");
            return noAtual;
        }

        // Encontre o nó a ser excluído
        if (chave.compareTo(noAtual.getChaves()[1]) < 0){
            System.out.println(chave + " < " + noAtual.getChaves()[1]);
            noAtual.setEsquerda(deletarRecursivo(noAtual.getEsquerda(), chave));
        }
        else if (chave.compareTo(noAtual.getChaves()[1]) > 0){
            System.out.println(chave + " > " + noAtual.getChaves()[1]);
            noAtual.setDireita(deletarRecursivo(noAtual.getDireita(), chave));
        }
        else {
            // Se o nó tiver apenas um filho ou nenhum filho
            if (noAtual.getEsquerda() == null){
                System.out.println("Esquerda Nula");
                return noAtual.getDireita();
            }
            else if (noAtual.getDireita() == null){
                System.out.println("Direita Nula");
                return noAtual.getEsquerda();
            }
            
            System.out.println(chave + " = " + noAtual.getChaves()[1]);
            
            // Se o nó tiver dois filhos
            // Coloque o sucessor da ordem 
            // na posição do nó a ser excluído
            noAtual.setDado( menorElemento(noAtual.getDireita()) );
            System.out.println(noAtual.getDado().toString());

            String[] chaveAux = new String[]{"", ""};
            if(ordenarPor[0].compareTo("Nome") == 0){
                chaveAux[0] = noAtual.getDado().getNome(); 
                chaveAux[1] = noAtual.getDado().getNome(); 
            }
            else {
                chaveAux[0] = noAtual.getDado().getMatricula(); 
                chaveAux[1] = noAtual.getDado().getMatricula();
            }
            if(ordenarPor[1].compareTo("---") == 0){
                chaveAux[1] = "".concat(chaveAux[1]);
            }
            else if(ordenarPor[1].compareTo("Turno") == 0){
                chaveAux[1] = noAtual.getDado().getTurno().concat(chaveAux[1]);
            }
            else if (ordenarPor[1].compareTo("Periodo") == 0){
                chaveAux[1] = (noAtual.getDado().getPeriodo()+"").concat(chaveAux[1]);
            }
            else if (ordenarPor[1].compareTo("Curso") == 0){
                chaveAux[1] = noAtual.getDado().getCurso().concat(chaveAux[1]);
            }
            else{
                chaveAux[1] = noAtual.getDado().getEnfase().concat(chaveAux[1]);
            }
            noAtual.setChaves(chaveAux);
            
            System.out.println("^^> " + noAtual.getChaves()[1]);
            
            // Exclua o sucessor em ordem
            noAtual.setDireita(deletarRecursivo(noAtual.getDireita(), noAtual.getChaves()[1]));
        }

        return noAtual;
    }
}
