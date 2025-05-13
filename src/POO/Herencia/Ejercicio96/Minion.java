package POO.Herencia.Ejercicio96;

public class Minion extends Personaje {

    String tipo; // Melee, Mago, Cañón

    public Minion(String tipo) {
        super("Minion", 0, 0, 0, 0, 0);
        this.x = (int) (Math.random() * (1520 - 400 + 1) + 400);
        this.y = (int) (Math.random() * (1520 - 400 + 1) + 400);
        this.tipo = tipo;
        if (!this.tipo.equals("Melee") || !this.tipo.equals("Mago") || !this.tipo.equals("Cañon")) {
            this.tipo = "Melee";
        }

        switch (this.tipo) {

            case "Melee":
                setMAXVIDA(50);
                setMAXESCUDO(10);
                setMAXATAQUE(10);
                break;

            case "Mago":
                setMAXVIDA(12);
                setMAXESCUDO(40);
                setMAXATAQUE(40);
                break;

            case "Cañon":
                setMAXVIDA(75);
                setMAXESCUDO(5);
                setMAXATAQUE(25);
        }
    }

}
