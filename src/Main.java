import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //test();
        genereProduit();
    }
    private static void test(){
        Produit produit1 = new Produit("Test",new PointC(80,0,8),new PointA(335,9,2,90),Type.Autre);
        System.out.println(produit1);
    }
    private static void genereProduit(){
        ArrayList<Produit> lesProduits = new ArrayList<>();
        float fruits_leg,fibres, proteines, energie, sucreSimples, acideGrasSatures, sodium;
        int nbProduitA = 0,nbProduitB = 0, nbProduitsC = 0, nbProduitD = 0, nbProduitE = 0;
        for(int i = 0; i < 1000000;i++){
            fruits_leg = (float) (Math.random()*(0+90));
            fibres = (float) (Math.random()*(0+5));
            proteines = (float) (Math.random()*(0+8));
            energie = (float) (Math.random()*(300+4000));
            sucreSimples = (float) (Math.random()*(0+300));
            acideGrasSatures = (float) (Math.random()*(0+70));
            sodium = (float) (Math.random()*(70+900));
            lesProduits.add(new Produit("Boisson"+i,new PointC(fruits_leg,fibres,proteines),new PointA(energie, sucreSimples,acideGrasSatures,sodium),Type.Boisson));
        }
        for (Produit produitCourant : lesProduits){
            switch (produitCourant.getClasse()){
                case A:
                    nbProduitA++;
                break;
                case B:
                    nbProduitB++;
                    break;
                case C:
                    nbProduitsC++;
                    break;
                case D:
                    nbProduitD++;
                    break;
                case E:
                    nbProduitE++;
                    break;
            }
            if (produitCourant.getClasse().ordinal() < Classe.C.ordinal()){
                System.out.println("\n"+produitCourant);
            }
        }
        System.out.println("\n NbProduit A : "+nbProduitA+"\n NbProduit B : "+nbProduitB+"\n NbProduitC : "+nbProduitsC+"\n nbProduitD : "+nbProduitD+" \n nbProduitE : "+nbProduitE);
        lesProduits.clear();
    }
}
