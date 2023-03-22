/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsport;

/**
 *
 * @author TGARDAIS
 */
public class Sportif extends Adherent{
    private double salaire_unitaire;
    private int nbr_compet_disp;
    
    
    public Sportif (String unNom, String unPrenom, String uneAdresse, double unSalaireUnit, int unNbreCompet)
    {
        super( unNom,  unPrenom,  uneAdresse);
        salaire_unitaire=unSalaireUnit;
        nbr_compet_disp=unNbreCompet;
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Salaire unitaire : "+salaire_unitaire+", Nombre de compétitions disputés : "+nbr_compet_disp+", le salaire : "+this.salaire());
    }
    
    public double salaire(){
        return salaire_unitaire*nbr_compet_disp;
    }
}
