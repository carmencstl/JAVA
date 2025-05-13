package T2P1;

public class Mago {

    //Propiedades de la clase
    private String nombre;
    private final int nMaximoHechizos;
    private String listaHechizos[];

    //Metodo constructor
    public Mago(String nombre, int nMaximoHechizos) {
        this.nombre = nombre;
        this.nMaximoHechizos = nMaximoHechizos;
        //A la lista de hechizos le asignamos el tamaño del numero limite de hechizos
        this.listaHechizos = new String[nMaximoHechizos];
        //Esta lista la creamos vacia por defecto
        for (int i = 0; i < nMaximoHechizos; i++) {
            this.listaHechizos[i] = "Ninguno";
        }
    }

    public boolean llena() {
        boolean llena = true;//Comprobamos el estado del array, diciendo que por defecto esta llena
        int i = 0;//Variable contador

        while (llena && i < this.listaHechizos.length) {//Busca un hueco vacio            
            if (this.listaHechizos[i].equals("Ninguno")) {//Si lo encuentra
                llena = false;//Cambia el estado del array y se sale del bucle
            }
            i++;
        }
        return llena;//Devuelve el estado, si esta llena o no
    }

    public void aniadirHechizo(String nombreHechizo) {
        if (!llena()) {
            int i = 0;//Contador
            boolean hueco = false;//Variable para encontrar el primer hueco libre y salirse
            while (!hueco) {
                if (this.listaHechizos[i].equals("Ninguno")) {
                    hueco = true;//Si encuentra el hueco vacio se sale
                    this.listaHechizos[i] = nombreHechizo;//Guarda el nombre en esa posicion
                }
                i++;
            }
        } else {
            System.out.println("No se pueden aprender más hechizos.");
        }
    }

    //Metodo get y set del nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] mostrarLista() {//Creo un array de string con el tamaño del numero maximo de hechizos
        String lista[] = new String[this.nMaximoHechizos];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = "";//Relleno el array vacio para que luego pueda compararlo
        }
        for (int i = 0; i < lista.length; i++) {//Recorro dicho array
            if (lista[i].equals("Ninguno")) {//Si no hay hechizo, asigno la frase sin hechizo
                lista[i] = "SIN HECHIZO\n";
            } else {
                lista[i] = this.listaHechizos[i];
            }
        }
        return lista;
    }

    public Mago(String nombre) {
        this.nombre = nombre;
        this.nMaximoHechizos = (int) (Math.random() * 8 + 5);
        this.listaHechizos = new String[this.nMaximoHechizos];//Le asigno ese tamaño aleatorio a la lista de hechizos
        for (int i = 0; i < this.listaHechizos.length; i++) {
            this.listaHechizos[i] = "Ninguno";//Le asignamo el valor vacio
        }
    }
    //Constructor de copias, al nos ser un tipo basico no se copian, apuntan la mismo espacio de memoria
    public Mago(Mago acopiar) {
        this.nombre = acopiar.getNombre();
        this.nMaximoHechizos = acopiar.nMaximoHechizos;
        for (int i = 0; i < this.nMaximoHechizos; i++) {
            this.listaHechizos[i] = acopiar.listaHechizos[i];
        }
    }

    public String toString() {
        String res = "";
        res += getNombre() + "\n"
                + "Hechizos aprendidos:\n";
        for (int i = 0; i < mostrarLista().length; i++) {
            res += mostrarLista()[i] +" "+i+"\n";
        }

        return res;
    }
    
}
