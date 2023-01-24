package animals;

public class Chat extends AbstractAnimal {

    private String cri = "Miaou";

    public Chat(String nom) {
        super(nom);
        this.nom = nom;
    }

    @Override
    public void crier() {
        System.out.println(this.cri);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace délicatement");
    }
}
