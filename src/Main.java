public class Main {

        //Encapsulamiento

    public class Animal {

        private String nombre; // Atributo privado: solo es accesible dentro de esta clase


        protected int edad;// Atributo protegido: accesible en esta clase, en el mismo paquete y en las subclases


        public String especie; // Atributo público: accesible desde cualquier parte


    }

    //Abstraccion
    // Clase abstracta: no se puede crear un objeto de Vehiculo directamente

    abstract class Vehiculo {

        abstract void encender();
    }


    class Carro extends Vehiculo {
        void encender() {
            System.out.println("El carro arranca con llave");
        }
    }


    class Moto extends Vehiculo {
        void encender() {
            System.out.println("La moto arranca con pedal");
        }
    }


    //Herencia

    // Clase padre
    class animal {
        void comer() {
            System.out.println("El animal está comiendo");
        }
    }

    // Clase hija que hereda de animal
    class Perro extends animal {
        void ladrar() {
            System.out.println("El perro ladra: Guau");
        }
    }
    //Polimorfismo
    public class Segundo {
        // Clase base que define una operación

        static class Operacion {
            int calcular(int a, int b) {
                return 0;
            }
        }
        // Subclase que representa una suma
        static class Suma extends Operacion {
            @Override// Indica que estamos sobrescribiendo el método de la clase padre

            int calcular(int a, int b) {
                return a + b;
            }
        }
        // Subclase que representa una multiplicación
        static class Multiplicacion extends Operacion {
            @Override
            int calcular(int a, int b) {
                return a * b;
            }
        }
        // Clase principal donde se ejecuta el programa
        public static void main(String[] args) {
            Operacion op1 = new Suma(); //Suma
            Operacion op2 = new Multiplicacion();//Multiplicacion

            System.out.println(op1.calcular(3, 4)); // 7
            System.out.println(op2.calcular(3, 4)); // 12
        }
    }

    // record
    public record Persona(String nombre, int edad) {
        public class EjemploRecord {
            public static void main(String[] args) {
                Persona p = new Persona("Yeferson", 25);

                // Acceder
                System.out.println(p.nombre()); // Yeferson
                System.out.println(p.edad());   // 25


                System.out.println(p);
            }
        }
    }
}