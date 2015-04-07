package samplefactorywarriors;

public class Samurai implements Warrior {

    private String grito;
    private int potenciaAtaque;

    public Samurai() {
        grito = "Yahhhhh";
        potenciaAtaque = 50;
    }

    @Override
    public String getGritoDeGuerra() {
        return grito;
    }

    @Override
    public int getPotenciaAtaque() {
        return potenciaAtaque;
    }

    @Override
    public String imprimirGuerrero() {
        return "Soy un Samurai " + grito;
    }

}
