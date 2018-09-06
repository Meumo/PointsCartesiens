package sn.objis.pointscartesiens.service;

import sn.objis.pointscartesiens.domaine.Point;

/**
 * @author Meum
 * @version 1.0
 * @since 2018
 *
 */
public class Service {
	/**
	 * une mÈthode affiche qui imprimer sur la console les propriÈtÈs du point,
	 */
	public void afficher(Point point) {
		System.out.println(
				"Abcise = " + point.getAbcisse() + "\nOrdonnee = " + point.getOrdonnee() + "\nNom = " + point.getNom());
	}

	/**
	 * une mÈthode coÔncide qui prend en argument un point (‡ comparer avec le point
	 * courant) et qui renvoie un boolÈen (vrai si les deux points coÔncident, faux
	 * dans le cas contraire).
	 */
	public boolean coincide(Point point, Point pointC) {

		return pointC.getAbcisse() == point.getAbcisse() && pointC.getOrdonnee() == point.getOrdonnee()
				&& pointC.getNom() == point.getNom();
	}
}
