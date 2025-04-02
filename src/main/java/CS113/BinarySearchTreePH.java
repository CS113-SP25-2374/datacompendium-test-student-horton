package CS113;

import CS113.interfaces.BinarySearchTreeInterface;

public class BinarySearchTreePH <E extends Comparable<E>> implements BinarySearchTreeInterface<E> {
    class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;
        Node(E element) {
            this.element = element;
        }
    }
    Node<E> root;

    public BinarySearchTreePH() {
        root = null;
    }

    Node<E> insertRecursive(Node<E> node, E element) {
        if (node == null) {
            return new Node<>(element);
        }

        if (element.compareTo(node.element) < 0) {
            node.left = insertRecursive(node.left, element);
        }

        if (element.compareTo(node.element) > 0) {
            node.right = insertRecursive(node.right, element);
        }

        return node;

    }

    @Override
    public void insert(E value) {
        root = insertRecursive(root, value);
    }


    int heightRecursive(Node<E> node) {
        if (node == null) { return 0; }
        return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
    }

    @Override
    public int height() {
        return heightRecursive(root);
    }

    String toStringRecursive(Node<E> node) {
        if (node == null) {
            return "";
        }

        String left = toStringRecursive(node.left);
        String center = node.element.toString();
        String right = toStringRecursive(node.right);

        if (left != "") {
            left += ", ";
        }
        if (right != "") {
            center += ", ";
        }
        return left + center + right;
    }

    public String toString() {
        return toStringRecursive(root);
    }

    @Override
    public boolean delete(E value) {
        return false;
    }

    @Override
    public boolean contains(E value) {
        return false;
    }

    @Override
    public E findMin() {
        return null;
    }

    @Override
    public E findMax() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
