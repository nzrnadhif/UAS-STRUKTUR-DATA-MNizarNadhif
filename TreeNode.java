/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nadhif Nizar
 */
public class TreeNode {
    public static void main(String[] args) {
	    Tree IntTree = new Tree();
	    IntTree.insert(45);
	    IntTree.insert(27);
	    IntTree.insert(10);
	    IntTree.insert(50);
	    IntTree.insert(21);
        IntTree.insert(65);
        IntTree.insert(12);
        IntTree.insert(5);
        IntTree.insert(14);

        System.out.print("\n");
        System.out.print("Transferse Order :\n");
        IntTree.traverseInOrder();
        System.out.print("\n\n");

        System.out.print("Insert :\n");
        System.out.println(IntTree.get(45));
        System.out.println(IntTree.get(10));
        System.out.print("Insert Angka 1 = ");
        System.out.println(IntTree.get(1));

        System.out.print("\n");
        System.out.print("Min Dan Max\n");
        System.out.print("Data Terkecil :");
        System.out.println(IntTree.min());

        System.out.print("Data Terbesar :");
        System.out.println(IntTree.max() + "\n");

        System.out.print("Element size :");
        System.out.println(IntTree.size() + "\n");
    }
}

