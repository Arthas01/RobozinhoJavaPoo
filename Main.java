import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        //aqui vamos criar o objeto
        //para instanciar um objeto, usamos a estrutura:
    // TipodoObj nomedaVariavel = new Construtor("parametros passados")

    Scanner scanner = new Scanner(System.in);
/*
    Robo drone = new Robo("Drone");

    drone.mover();

    drone.ligar();

    drone.mover();

    drone.setBateria(5);
    drone.mover();
*/
    
    System.out.print("Profundidade maxima: ");
    int profundidadeMax = scanner.nextInt(); // lê oq foi digitado ate o espaco

    scanner.nextLine(); //limpa o buffer ('\n sobrando dps do enter')

    System.out.print("Modelo: ");
    String modelo = scanner.nextLine();
    
    RoboAquatico submarino = new RoboAquatico(profundidadeMax, modelo);

    /* 
    submarino.submergir(40);
    
    submarino.submergir(49);
    submarino.mover();

    submarino.submergir(1);
    submarino.submergir(1);
    submarino.submergir(1);
    
    System.in.read()
    */
    
    submarino.ligar();
    while (submarino.getProfundidade() < profundidadeMax ) {
        System.out.print("Comando: ");
        int comando = scanner.nextInt();
        submarino.submergir(comando);
    }
    
    scanner.close();
    }
    
    //IMPLEMENTAR O ARRAYLIST DO GEMINI (PRECISA IMPORTAR java.util.arraylist (ja coloquei))

}