// EJERCICIO 2
public class Main {
    public static void main(String[] args) {
        coche micoche =new coche();
        micoche.incpuertas();
        System.out.println(micoche.numpuertas);
    }
}
class coche {
    public int numpuertas = 4;

    public void incpuertas(){
        this.numpuertas++;
    }
}