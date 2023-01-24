package tp4;

public class Mafieux extends Elu{


    public Mafieux(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void embaucher(String nom, String prenom){
        if(this.nom.equalsIgnoreCase(nom)){
            Personne assis =  new Personne(prenom, nom);
            this.assistants.add(assis);
            System.out.println(assis.nom + " a était embauché");
        }else System.out.println("L'assistant n'a pas le meme nom il ne peu pas etre embauché par le mafieux");
    }

}
