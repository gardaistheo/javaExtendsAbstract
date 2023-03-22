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
public abstract class  Adherent {
    
    private String nom;
    private String prenom;
    private String adresse;
    
    public Adherent(String unNom, String unPrenom, String uneAdresse){
        nom=unNom;
        prenom=unPrenom;
        adresse=uneAdresse;
    }
    public void afficher(){
        System.out.println("Nom : "+nom+", Prenom : "+prenom+", Adresse : "+adresse+".");
    }
    public void modifNom(String unNom){
        nom=unNom;
    }
    
    public abstract double salaire(); 
 // méthode abstraite de la classe Adherent
    
}
