import animals.*;
import tp4.Econome;
import tp4.Elu;
import tp4.Mafieux;
import tp4.Personne;

import java.sql.Array;
import java.util.*;

public class MyApp {

    public static void main(String[] args) {

//        animal();
        //elu();
        //mafieux();
        econome();

    }

//    public static void animal(){
//        List<AbstractAnimal> animaux = new ArrayList<>();
//        animaux.add(new Chat("LouLou"));
//        animaux.add(new Chien("Riri"));
//        animaux.add(new Lapin("FiFi"));
//
//        for(AbstractAnimal a : animaux){
//            a.crier();
//            a.seDeplacer();
//            System.out.println(a.nom);
//        }
//    }


    public static void elu(){
        Elu e = new Elu("quentin", "wqddwq");

        e.embaucher("Thomas", "qwddqw");
        e.embaucher("Raphael", "wqddwq");
        //System.out.println(e);
        //e.licensier(1);
        //System.out.println(e);
        e.verser(200);
        //e.licensier(e.assistants.get(0));
    }

    public static void mafieux(){
        Mafieux m = new Mafieux("mafieux", "toto");
        m.embaucher("mafieux", "toto");
        m.embaucher("dwqqwd", "ewfew");
    }

    public static void econome(){
        Econome e = new Econome("econome", "qdwdqw");
        e.embaucher("mafieux", "toto");
        e.embaucher("dwqqwd", "ewfew");
        e.verser(3000);
    }

}
