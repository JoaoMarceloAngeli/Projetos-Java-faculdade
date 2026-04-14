/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturadeDados;

public class ArvoreBinaria implements IArvore {
    private no raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    private int contarRecursivo(no raiz) {
        if (raiz == null) return 0;
        return 1 + contarRecursivo(raiz.getEsquerda()) + contarRecursivo(raiz.getDireita());
    }

    public int contarElementos() {
        return contarRecursivo(raiz);
    }

    @Override
    public String percursoCentralEsquerda() {
        return "ARVORE BINARIA = { " + percursoCentralEsquerdaRecursivo(raiz) + " }";
    }

    private String percursoCentralEsquerdaRecursivo(no raiz) {
        if (raiz == null) return "";
        return percursoCentralEsquerdaRecursivo(raiz.getEsquerda()) + raiz.getDado() + ", " + percursoCentralEsquerdaRecursivo(raiz.getDireita());
    }

    public String percursoPreOrdemEsquerda() {
        return "ARVORE BINARIA = { " + percursoPreOrdemEsquerdaRecursivo(raiz) + " }";
    }

    private String percursoPreOrdemEsquerdaRecursivo(no raiz) {
        if (raiz == null) return "";
        return raiz.getDado() + ", " + percursoPreOrdemEsquerdaRecursivo(raiz.getEsquerda()) + percursoPreOrdemEsquerdaRecursivo(raiz.getDireita());
    }

    public String percursoPosOrdemEsquerda() {
        return "ARVORE BINARIA = { " + percursoPosOrdemEsquerdaRecursivo(raiz) + " }";
    }

    private String percursoPosOrdemEsquerdaRecursivo(no raiz) {
        if (raiz == null) return "";
        return percursoPosOrdemEsquerdaRecursivo(raiz.getEsquerda()) + percursoPosOrdemEsquerdaRecursivo(raiz.getDireita()) + raiz.getDado() + ", ";
    }

    public String percursoCentralDireita() {
        return "ARVORE BINARIA = { " + percursoCentralDireitaRecursivo(raiz) + " }";
    }

    private String percursoCentralDireitaRecursivo(no raiz) {
        if (raiz == null) return "";
        return percursoCentralDireitaRecursivo(raiz.getDireita()) + raiz.getDado() + ", " + percursoCentralDireitaRecursivo(raiz.getEsquerda());
    }

    public String percursoPreOrdemDireita() {
        return "ARVORE BINARIA = { " + percursoPreOrdemDireitaRecursivo(raiz) + " }";
    }

    private String percursoPreOrdemDireitaRecursivo(no raiz) {
        if (raiz == null) return "";
        return raiz.getDado() + ", " + percursoPreOrdemDireitaRecursivo(raiz.getDireita()) + percursoPreOrdemDireitaRecursivo(raiz.getEsquerda());
    }

    public String percursoPosOrdemDireita() {
        return "ARVORE BINARIA = { " + percursoPosOrdemDireitaRecursivo(raiz) + " }";
    }

    private String percursoPosOrdemDireitaRecursivo(no raiz) {
        if (raiz == null) return "";
        return percursoPosOrdemDireitaRecursivo(raiz.getDireita()) + percursoPosOrdemDireitaRecursivo(raiz.getEsquerda()) + raiz.getDado() + ", ";
    }
@Override
    public void incluir(int elemento) {
    if (contains(raiz, elemento)) {
        throw new IllegalArgumentException("Número já existe na árvore: " + elemento);
    }
    raiz = inserirRecursivo(raiz, elemento);
}

private boolean contains(no no, int elemento) {
    if (no == null) {
        return false;
    }
    if (no.getDado() == elemento) {
        return true;
    }
    return contains(no.getEsquerda(), elemento) || contains(no.getDireita(), elemento);
}

    private no inserirRecursivo(no raiz, int elemento) {
        if (raiz == null) raiz = new no(elemento);
        else if (elemento < raiz.getDado())
            raiz.setEsquerda(inserirRecursivo(raiz.getEsquerda(), elemento));
        else raiz.setDireita(inserirRecursivo(raiz.getDireita(), elemento));
        return raiz;
    }
}

