package animals;

public class Lapin extends AbstractAnimal {

    private String cri = "Honk-Honk";

    public Lapin(String nom) {
        super(nom);
        this.nom = nom;
    }

    @Override
    public void crier() {
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
        System.out.println("Je me déplace en bondissant");
    }
}
