public class Pinguino extends Ave{
    public Pinguino() {}

    public Pinguino(Sexo s) {
        super(s);
    }

    public void vuela() {
        System.out.println("Soy un pingüino, no puedo volar");
    }

    public void desliza() {
        System.out.println("me deslizo por el hielo usando mi panza");
    }

    public void nada() {
        System.out.println("Estoy nadando");
    }

}
