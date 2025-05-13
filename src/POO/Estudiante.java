//78.- Define la clase Estudiante de la siguiente forma: De cada estudiante debemos
//saber su nombre, sus apellidos y una lista de calificaciones que va a tener en el curso. El
//tamaño de esa lista se pasará en el constructor. Además, todas las propiedades deben ser
//privadas.
//Al comienzo, todas las calificaciones del estudiante tendrán el valor -1 (no presentado).
//Define los siguientes métodos de la clase:
//• InsertarNota(double nota): meterá la nota que se le pasa como
//parámetro en la lista de notas. Devolverá true si consigue meterla o false si no
//consigue hacerlo (porque la lista ya esté llena).
//• MostrarNotas(): devolverá una cadena bien maquetada con las notas de ese
//estudiante.
//• CalcularMedia(): devolverá la media de las notas que tenga ese estudiante
//hasta el momento. Los ‘no presentados’ no deben contarse para calcular la
//media.
//• IndicarRangos(): este método contará cuantos insuficientes, suficientes,
//notables y sobresalientes tiene el estudiante y devolverá esos valores.
//• toString(): Este método debe generar la información del estudiante. Para
//ello sigue la siguiente plantilla:
//Estudiante: nombre y apellidos
//Notas: lista de notas
//Rangos: numero de insuficientes, suficientes, notables
//y sobresalientes.
//Media: media




package POO;

public class Estudiante {
    
   private String nombre;
   private String [] apellidos = new String[2];
   public int tam;
   public double [] calificaciones;
    
    public Estudiante(String nombre, String apellidos[], int tam){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tam = tam;
        this.calificaciones = new double[tam];
        for(int i = 0; i < this.calificaciones.length; i++){
            this.calificaciones[i] = -1;
        }
    }
    
    public boolean insertarNota(double nota){
        
        int cont = 0;
        
        while(cont < this.calificaciones.length){
            if(calificaciones[cont] == -1){
                this.calificaciones[cont] = nota;
                return true;
            }
            cont++;
        }
        return false;
    }
    
    public void mostrarNotas(){
        for(int i = 0; i < this.calificaciones.length; i++){
            System.out.print(calificaciones[i] + " ");
        }
        System.out.println();
    }
    
    public double calcularMedia(){
        int notas = 0;
        double suma = 0;
        
        for(int i = 0; i < this.calificaciones.length; i++){
            if(calificaciones[i] != -1){
                suma += calificaciones[i];
                notas++;
            }
        }
        
        return suma / notas;
    }
    
    public int [] indicarRangos(){
        
        int insuficientes = 0;
        int suficientes = 0;
        int notables = 0;
        int sobresalientes = 0;
        int noEvaluado = 0;
        
        for(int i = 0; i < this.calificaciones.length; i++){
            switch((int)calificaciones[i]){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    insuficientes++;    
                break;
                case 5:
                    suficientes++;   
                break;
                case 6:
                case 7:
                case 8:
                    notables++;  
                break;
                case 9:
                case 10:
                    sobresalientes++; 
                break;
                default:
                    noEvaluado++;        
            }
            
        }
        return new int [] {insuficientes, suficientes, notables, sobresalientes, noEvaluado};
        
    }
    
}
