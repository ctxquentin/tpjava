package tp4;


import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class Elu extends Personne {

    public List<Personne> assistants;

    public final static int SMIC = 1480;

    @Override
    public String toString() {
        return "Elu{" +
                "assistants=" + assistants +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", compteBancaire=" + compteBancaire +
                '}';
    }

    public Elu(String nom, String prenom) {
        super(nom, prenom);
        this.assistants = new ArrayList<Personne>();
    }




    public void embaucher(String prenom, String nom){

        Personne assis =  new Personne(prenom, nom);
        this.assistants.add(assis);

    }

    public void licensier(int i){
        this.assistants.remove(i);
    }

    public void verser(int montant){
        int versement = montant / this.assistants.size();
        for(Personne assistant : this.assistants ){
            System.out.println("Le montant du compte bancaire de " + assistant.nom + " est de " + assistant.compteBancaire);
            assistant.compteBancaire += versement;
            System.out.println("Le montant du compte bancaire de " + assistant.nom + " est de " + assistant.compteBancaire);
        }
    }

}
