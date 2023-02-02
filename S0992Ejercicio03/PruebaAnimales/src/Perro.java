public class Perro extends Mamifero {

    public Perro (Sexo s) {
        super(s);
    }

    public Perro () {
        super(Sexo.HEMBRA);
    }

    public void ladra() {
        System.out.println("Guau guau");
    }

    public void sienta() {
        System.out.println("Me siento");
    }

    public void caza() {
        System.out.println("Estoy cazando perdices");
    }
}
