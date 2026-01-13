public class Auto extends Jarmu{

    private String marka;
    private int evjarat;
    private int vegsebesseg;

    public Auto(String marka, int evjarat, int vegsebesseg) {
        super("Autó");
        this.marka = marka;
        this.evjarat = evjarat;
        this.vegsebesseg = vegsebesseg;
    }
    @Override
    public void halad(){
        System.out.println(
                "Az autó halad. Márka" + marka +
                        ", Évjárat: " + evjarat +
                        ", Végsebesség: " + vegsebesseg + " km/h"
        );
    }
}
