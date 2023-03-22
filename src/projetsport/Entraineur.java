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
public class Entraineur extends Adherent{
    private double salaire_mensu;
//    private double indemn;
    private int nb_sportifs;
    private char degre;
    
    public Entraineur (String unNom, String unPrenom, String uneAdresse, double unSalaire, int unNbrSport, char unDeg){
        super( unNom,  unPrenom,  uneAdresse);
        salaire_mensu=unSalaire;
        nb_sportifs=unNbrSport;
        degre=unDeg;
        
    }
    
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Le salaire mensuel est de : "+salaire_mensu+", le nombre de sportif de cet entraineur est de : "+nb_sportifs+", cet entraineur est de degré :"+degre+", le salaire :"+this.salaire());
    }
    
    public double salaire(){
        double indemn = 0;
        if (nb_sportifs<10){
            if(degre=='A'){
                indemn=20;
            } else if(degre=='B'){
                indemn=10;
            } else if(degre=='C'){
                indemn=6;
            }
        } else if(nb_sportifs<51){
            if(degre=='A'){
                indemn=200;
            } else if(degre=='B'){
                indemn=150;
            } else if(degre=='C'){
                indemn=80;
            }
        } else if(nb_sportifs<101){
            if(degre=='A'){
                indemn=800;
            } else if(degre=='B'){
                indemn=600;
            } else if(degre=='C'){
                indemn=500;
            }
        } else {
            if(degre=='A'){
                indemn=2400;
            } else if(degre=='B'){
                indemn=1700;
            } else if(degre=='C'){
                indemn=1400;
            }
        }
        return salaire_mensu + indemn;
    }
}
