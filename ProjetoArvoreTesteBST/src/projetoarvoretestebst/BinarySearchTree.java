/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoarvoretestebst;

/**
 *
 * @author ejmcc
 */
class BinarySearchTree {
  class Node {
    int key;
    Node left, right;

    public Node(int item) {
      key = item;
      left = right = null;
    }
  }

  Node root;

  BinarySearchTree() {
    root = null;
  }

  void insert(int key) {
    root = insertKey(root, key);
  }

  // Insert key in the tree
  Node insertKey(Node root, int key) {
    // Return a new node if the tree is empty
    if (root == null) {
      root = new Node(key);
      return root;
    }

    // Traverse to the right place and insert the node
    if (key < root.key)
      root.left = insertKey(root.left, key);
    else if (key > root.key)
      root.right = insertKey(root.right, key);

    return root;
  }

  void inorder() {
    inorderRec(root);
  }

  // Inorder Traversal
  void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.print(root.key + " -> ");
      inorderRec(root.right);
    }
  }

  void deleteKey(int key) {
    root = deleteRec(root, key);
  }

  Node deleteRec(Node root, int key) {
    // Retorne se a árvore estiver vazia
    if (root == null) return root;

    // Encontre o nó a ser excluído
    if (key < root.key)
      root.left = deleteRec(root.left, key);
    else if (key > root.key)
      root.right = deleteRec(root.right, key);
    else {
      // Se o nó tiver apenas um filho ou nenhum filho
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;

      // Se o nó tiver dois filhos
      // Coloque o sucessor da ordem 
      // na posição do nó a ser excluído
      root.key = minValue(root.right);

      // Exclua o sucessor em ordem
      root.right = deleteRec(root.right, root.key);
    }

    return root;
  }

  // Encontre o sucessor em ordem
  int minValue(Node root) {
    int minv = root.key;
    while (root.left != null) {
      minv = root.left.key;
      root = root.left;
    }
    return minv;
  }
}
