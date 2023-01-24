package tp4;

public class Econome extends Elu {




    public Econome(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void verser(int montant){

        int versement = montant / this.assistants.size();
        int plusValue = 0;


        for(Personne assistant : this.assistants ){
            if(versement > SMIC){
                plusValue += versement - SMIC;
                assistant.compteBancaire = SMIC;

            }else assistant.compteBancaire = versement;
            System.out.println("On ajoute  a l'assistant " + assistant.nom + " un montant de " + versement);
        }

        this.compteBancaire += plusValue;
        System.out.println(plusValue);
    }
}
