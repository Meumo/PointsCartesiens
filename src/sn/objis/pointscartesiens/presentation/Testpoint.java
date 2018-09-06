package sn.objis.pointscartesiens.presentation;

import java.util.Scanner;

import sn.objis.pointscartesiens.domaine.Point;
import sn.objis.pointscartesiens.service.Service;

public class Testpoint {

	/**
	 * @param args
	 *            tableau de chaine qui stocke les donnees saisient par les
	 *            utilisateurs La classe TestPoin, pour tester notre classe Point.
	 */
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		// Point point=new Point(0.6f,0.7f,'M');
		// creation du point 1er sur le plan
		Point point = new Point();
		System.out.println("Caracteristiques d'un Point du plan");
		System.out.println("Entrer l'abcisse:");
		point.setAbcisse(clavier.nextFloat());
		System.out.println("Entrer l'ordonnee:");
		point.setOrdonnee(clavier.nextFloat());
		System.out.println("Entrer le nom(char):");
		clavier.nextLine();
		point.setNom(clavier.nextLine().charAt(0));
		System.out.println("------------");
		// creation d'un objet de type "Service"
		Service service = new Service();
		// appellation de la methode "affiche"
		System.out.println("Les proprietes du point 1: ");
		service.afficher(point);
		System.out.println("------------");
		
		boolean vf;
		Point point2 = new Point();
		System.out.println("Caracteristiques d'un Point du plan");
		System.out.println("Entrer l'abcisse:");
		point2.setAbcisse(clavier.nextFloat());
		System.out.println("Entrer l'ordonnee:");
		point2.setOrdonnee(clavier.nextFloat());
		System.out.println("Entrer le nom(char):");
		clavier.nextLine();
		point2.setNom(clavier.nextLine().charAt(0));
		System.out.println("------------");
		System.out.println("Les proprietes du point 2: ");
		service.afficher(point2);
		System.out.println("------------");
		vf = service.coincide(point2, point);
		System.out.println("Coincident-ils ces deux points?");
		System.out.println(vf + "!");

	}

}
