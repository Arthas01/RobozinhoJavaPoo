
//CLASSE ROBO (SUPERCLASSE) CLASSE PAI
public class Robo 
{ //aqui estamos criando os atributos que esse robo vai ter, a abstracao de classe
    private String modelo;
    private double bateria;
    private boolean ligado;

    public Boolean getLigado(){
        return this.ligado;
    }

    public String getModelo() {
        return this.modelo;
    }
    
    public double getBateria(){
        return this.bateria;
    }
    // isso serve pra retornar o atributo de um atributo privado
//CONSTRUTOR
    public Robo(String modelo){ // aqui estamos criando os parametros iniciais desses atributos, para que 
        // toda vez que fossemos criar um objeto novo da classe Robo, nao precisarmos toda vez definir as coisas basicas que todos tem.
        //  Outra coisa interessante, é que como a unica variavel que vai ser alterada quando criarmos um objeto, colocamos String modelo como parametro do construtor
        //pq e o unico que vai ser mudado quando formos fazer um objeto, tipo Robo r1 = new Robo(parametro do nome "Robozinhomilgrau")
        this.modelo = modelo;
        this.bateria = 100;
        this.ligado = false;
    }
//METODOS
    public void ligar(){
        this.ligado = true;

        System.out.println("Robô " + this.modelo + " ligado!");
    }

    public void mover(){
        if(this.ligado == true && this.bateria > 10) //pode colocar so this.ligado tambem, pois ele vai ser só true ou false
        {
            this.bateria -= 10;
            System.out.println("Robô se moveu\n");
            System.out.println("Robô "+ this.modelo + " está com " + this.bateria + "%");
        }
        else if(!this.ligado){System.out.println("Robô desligado");}

        else{System.out.println("Bateria zerada: " + this.bateria + "%");}

    }

    // E se eu quisesse alterar a bateria diretamente no objeto? podemos criar uma classe publica pra receber o
    //parametro e alterar de forma segura.

    public void setBateria(double setBateria){
        if(setBateria >= 0 && setBateria <=100)
        {
            this.bateria = setBateria;
        }
        else{System.out.println("Valor invalido.");}
    }

}