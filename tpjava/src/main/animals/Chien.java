package animals;

public class Chien extends AbstractAnimal {

    private String cri = "Oaf-Oaf";

    private String nom = null;

    public Chien(String nom) {
        super(nom);
        this.nom = nom;
    }

    @Override
    public void  crier() {
        System.out.println(this.cri);
    }

    public String getCri() {
        return cri;
    }

    public void setCri(String cri) {
        this.cri = cri;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace en courant sur mes 4 pattes");
    }
}
