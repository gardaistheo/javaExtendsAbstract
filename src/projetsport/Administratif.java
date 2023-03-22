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
public class Administratif extends Adherent{
    private double salaire_horaire;
    private double nbr_heures;
    private int categorie;
    
    public Administratif(String unNom, String unPrenom, String uneAdresse, double unSalaireHor, double unNbHeur, int uneCateg){
        super( unNom,  unPrenom,  uneAdresse);
        salaire_horaire=unSalaireHor;
        nbr_heures=unNbHeur;
        categorie=uneCateg;
    }
    
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Salaire horaire : "+salaire_horaire+", Nombre d'heure de travail : "+nbr_heures+", categorie : "+categorie+", le salaire :"+this.salaire());
    }
    
    public double salaire(){
        double pond = 0;
        if(categorie==1){
            pond=1;
        } else if(categorie==2){
            pond=1.1;
        } else if(categorie==3){
            pond=1.2;
        }
        return salaire_horaire*nbr_heures*pond;
    }
    
}
