/*
2 – Crie as classes de acordo com o diagrama abaixo (1,5).
*/
package provapoo1;

import java.io.IOException;
import java.util.Scanner;

public class TdeEx24 {
    public static class Transporte {

        public static void recebePassageiro(){
            System.out.println("Recebendo passageiro.");
        }

        public static void acelerar() {
            System.out.println("Acelerando.");
        }

        public static void frear(){
            System.out.println("Freando.");
        }

    }
    public static class Aviao extends Transporte{
        public static void levantaVoo(){
            System.out.println("Subiiiiinndo.");
        }
        public static void pousar(){
            System.out.println("Pousando");
        }

    }

    public static class Automovel extends Transporte{
        public static void abastecer(){
            System.out.println("Abastecendo");
        }
        public static void passarMarcha(){
            System.out.println("Passando marcha.");
        }

    }

    public static class Ferrari extends Automovel{
        /*
        Colocar metodos que sao usados apenas por ferraris

        void  portaBorboleta(){
            System.out.println("Abrindo portas borboletas.")
        }

         */
    }

    public static class Navio extends Transporte {
        public static void afundar() {
            System.out.println("Afundando!");
        }

        public static void ancorar() {
            System.out.println("Ancorando!");
        }
    }
}
