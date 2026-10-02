import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main
{
    public static void main(String[] args){
            //aqui vamos criar o objeto
            //para instanciar um objeto, usamos a estrutura:
        // TipodoObj nomedaVariavel = new Construtor("parametros passados")

        Scanner scanner = new Scanner(System.in);
        ArrayList<Robo> frota = new ArrayList<>();
    /*
        Robo drone = new Robo("Drone");

        drone.mover();

        drone.ligar();

        drone.mover();

        drone.setBateria(5);
        drone.mover();
    */
        /*
        System.out.print("Profundidade maxima: ");
        int profundidadeMax = scanner.nextInt(); // lê oq foi digitado ate o espaco

        scanner.nextLine(); //limpa o buffer ('\n sobrando dps do enter')

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        
        RoboAquatico submarino = new RoboAquatico(profundidadeMax, modelo);
        */
        /* 
        submarino.submergir(40);
        
        submarino.submergir(49);
        submarino.mover();

        submarino.submergir(1);
        submarino.submergir(1);
        submarino.submergir(1);
        
        System.in.read()
        
        
        aqui é pra cadastrar o submarino e profundidade
        submarino.ligar();
        while (submarino.getProfundidade() < profundidadeMax ) {
            System.out.print("Comando: ");
            int comando = scanner.nextInt();
            submarino.submergir(comando);
        }
        
        scanner.close();
        }
        */
        //IMPLEMENTAR O ARRAYLIST DO GEMINI (PRECISA IMPORTAR java.util.arraylist (ja coloquei))

        int opcao = 0;

        do 
        {
            System.out.println("FROTA DE ROBOS");
            System.out.println("1. Cadastrar Robô Terrestre");
            System.out.println("2. Cadastrar Robô Aquático");
            System.out.println("3. Cadastrar Robô Aéreo nao usar ainda");
            System.out.println("4. ligar TODOS os Robôs");
            System.out.println("5. Mover TODOS (c/polimorfismo pro aquatico)");
            System.out.println("Sair");
            System.out.println("ESCOLHA: ");

            try{
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do \n     
            }catch(InputMismatchException e){
                System.out.println("Digite um número do menu!");
                scanner.nextLine(); //limpabuffer
            }
            


            switch (opcao) {
                case 1:
                    System.out.println("Modelo do Robô Terrestre: ");
                    String modeloTerrestre = scanner.nextLine();
                    
                    frota.add(new Robo(modeloTerrestre));
                    System.out.println("Cadastrado.");
                    break;
                case 2:
                    System.out.println("Modelo do Robô Aquatico: ");

                    System.out.println("Profundidade Máxima: ");
                    try{
                        int prof_max = scanner.nextInt(); // vai ler oq foi inputado
                        scanner.nextLine(); //limpa o buffer
                        String modeloAquatico = scanner.nextLine();

                        //vai executar se der certo
                        frota.add(new RoboAquatico(prof_max, modeloAquatico));

                        System.out.println("Cadastrado.");
                        
                    } catch(InputMismatchException e){

                        System.out.println("ERRO: Profundidade deve ser um inteiro válido\nRobô não cadastrado");
                        scanner.nextLine();//limparbuffer

                    }
                    break;
                case 3:// ainda nao funciona
                    System.out.println("Modelo do Robô Aereo: ");
                    String modeloAereo = scanner.nextLine();
                    
                    frota.add(new Robo(modeloAereo));
                    System.out.println("Cadastrado.");

                case 4:
                    System.out.println("TODOS Robôs ligados");
                    
                    for (Robo r : frota)
                    {
                        r.ligar();
                    }
                    break;
                case 5:
                    System.out.println("Movendo TODOS Robôs");
                    
                    for (Robo r : frota)
                    {
                        r.mover();//o normal vai gastar 10% e o aquatico 15%
                    }
                    break;
                case 6:
                    System.out.println("Desligado");
                    break;
                


                default:
                    System.out.println("Opção invalida"); 
            }

            
        } while (opcao != 6);

        scanner.close();
    }
}

/*  EXCEPTION (QUE O PROF PEDIU PRA FAZER)

try {
    // Código perigoso que pode lançar uma exceção
} catch (NomeDaExcecao e) {
    // Código de emergência executado se der erro
} finally {
    // Roda SEMPRE (com ou sem erro)
}


*/