package sn.objis.pointscartesiens.domaine;

/**
 * @author Meum
 * @version 1.0
 * @since 2018
 */
public class Point {
	/**
	 * Un point du plan sera caractÈrisÈ par ses deux coordonnÈes cartÈsiennes (abscisse et ordonnÈes)
	 *de type flottant et son nom qui est de type (char).
	 */
	private float abcisse,ordonnee;
	private char nom;
	
	/**
	 * un constructeur ‡ deux arguments pour instancier un point avec seulement ses deux coordonnÈes,
	 */
	public Point(float abcisse,float ordonnee)
	{
		this.abcisse=abcisse;
		this.ordonnee=ordonnee;
	}
	/**
	 * un constructeur avec trois arguments (coordonnÈes et nom),
	 * Ce dernier devra faire appel au constructeur ‡ deux arguments.
	 */
	public Point(float abcisse,float ordonnee,char nom)
	{
		this(abcisse,ordonnee);
		this.nom=nom;
	}
	/**
	 * 	un constructeur sans argument pour crÈer le point origine. 
	 * Ce dernier devra faire appel au constructeur ‡ deux arguments.
	 */
	public Point()
	{
		
	}
	/**
	 *  Accesseurs
	 */
	public float getAbcisse() {
		return abcisse;
	}
	public float getOrdonnee() {
		return ordonnee;
	}
	public char getNom() {
		return nom;
	}

	/**
	 * Mutateurs
	 */
	public void setAbcisse(float abcisse) {
		this.abcisse = abcisse;
	}
	public void setOrdonnee(float ordonnee) {
		this.ordonnee = ordonnee;
	}
	public void setNom(char nom) {
		this.nom = nom;
	}
	
	
}
