
//CLASSE ROBO AQUATICO (HERDADA DE ROBO (SUBCLASSE) CLASSE FILHA)
public class RoboAquatico extends Robo{
    //tudo que é da classe Robo vem pra ca, mas aqui eu ainda consigo criar objetos que vão respeitar essa classe
    private int max_depth;
    private int profundidade;

    //CONSTRUTOR DA SUBCLASSE
    public RoboAquatico(int max_depth, String modelo){
        super(modelo);
        this.max_depth = max_depth;
        this.profundidade = 0;
        //this.modelo = modelo; nao precisa passar esse parametro pq ele ja existe
        //CONSTRUTOR CRIADO :0
    }

    public int getProfundidade(){
        return this.profundidade;
    }

    //METODO DA SUBCLASSE
    public void submergir(int profundidade){
        
        if(!getLigado()){System.out.println("O Robo esta desligado");}
        else if((this.profundidade + profundidade) <= max_depth && profundidade >= 0)
        {
            this.profundidade += profundidade;
            System.out.println("O Robo "+ getModelo()+" submergiu "+ this.profundidade + "m");
        }
        else{System.out.println("Limite de profundidade atingido!");}

    }

    //Usando o método @Override
    @Override 
    public void mover(){
        if(getLigado() == true && getBateria() >= 15) //pode colocar so this.ligado tambem, pois ele vai ser só true ou false
        {
            setBateria((getBateria() - 15));
            System.out.println("Robô se moveu\n");
            System.out.println("Robô "+ getModelo() + " está com " + getBateria() + "%");
        }
        else if(!getLigado()){System.out.println("Robô desligado");}

        else{System.out.println("Bateria zerada: " + getBateria() + "%");}

    }


}