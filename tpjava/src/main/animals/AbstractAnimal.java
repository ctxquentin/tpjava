package animals;

public class AbstractAnimal implements Deplacable, Criant {

    public String nom = null;

    public AbstractAnimal(String nom){
        this.nom = nom;
    }

    private String cri;
    @Override
    public void seDeplacer() {

    }

    @Override
    public void crier() {
        System.out.println(this.cri);
    }
}
