public class Mamifero extends Animal{
    public Mamifero () {
        super();
    }

    public Mamifero (Sexo s) {
        super(s);
    }

    public void amamanta() {
        if (this.getSexo() == Sexo.MACHO) {
            System.out.println("Soy macho, no puedo ");
        } else {
            System.out.println("Toma pecho");
        }
    }

    public void cuida() {
        System.out.println("Estoy cuidando mis crias");
    }

    public void anda() {
        System.out.println("Estoy andando");
    }
}
