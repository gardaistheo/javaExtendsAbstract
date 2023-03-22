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
public class SportifCombat extends Sportif{
 //   private double prime_mensu;
    private int nb_win;
    private int nb_loose;
    
    public SportifCombat(String unNom, String unPrenom, String uneAdresse, double unSalaireUnit, int unNbreCompet, int unNbWin, int unNbLoose){
        super( unNom,  unPrenom,  uneAdresse,  unSalaireUnit,  unNbreCompet);
        nb_win=unNbWin;
        nb_loose=unNbLoose;
        /*
        double ratio = nb_win/nb_loose;
        if(ratio>=3){
            prime_mensu=1500;
        }else if(ratio>=2){
            prime_mensu=600;
        }
*/
    }
    public void afficher(){
        super.afficher();
        System.out.println("Le nombre de victoire est de : "+nb_win+", le nombre de défaite :"+nb_loose+", le salaire est de :"+this.salaire());
    }
    
    public double salaire(){
        double ratio = nb_win/nb_loose;
        double prime = 0;
        
        if (ratio<2){
            prime=0;
        } else if (ratio<3 && ratio>=2){
            prime = 600;
        } else {
            prime = 1500;
        }
        
        return super.salaire() + prime;
    }
}
