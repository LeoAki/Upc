package samplefactorywarriors;

public class Ninja implements Warrior {

    private String grito;
    private int potenciaAtaque;

    public Ninja() {
        grito = "Ahhh";
        potenciaAtaque = 1;
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
        return "Soy un ninja " + grito;
    }

}
