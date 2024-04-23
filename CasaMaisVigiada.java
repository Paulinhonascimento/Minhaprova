import java.util.ArrayList;
import java.util.Scanner;

class Jogador {
    String nome;
    int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public void incrementaUmVoto() {
        this.votos++;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }
}

public class CasaMaisVigiada {

    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovannna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));


        String voto;
        int maxVotos = 0;
        Jogador eliminado = null;
        while (true) {
            System.out.println("º-----------------------------°");
            System.out.println("°        BEM VINDO!           °");
            System.out.println("°    1)Escolha um nome        °");
            System.out.println("°2)Ao terminar digite Sair    °");
            System.out.println("°-----------------------------°");
            System.out.println("°   NOMES PARA VOTAÇÃO        °");
            System.out.println("°-----------------------------°");
            System.out.println("° Alane Dias | Beatriz Reis   °");
            System.out.println("° Davi Brito | Deniziane Fer..°");
            System.out.println("°Fernanda Bande | Giovanna L..°");
            System.out.println("°Giovanna Pitel | Isabelle N..°");
            System.out.println("°   Juninho | Leidy Elin      °");
            System.out.println("° Lucas Henrique |Lucas Luigi °");
            System.out.println("° Lucas Pizane | Marcus Vini..°");
            System.out.println("° Matteus Amaral | Maycon Co..°");
            System.out.println("° MC Bin Laden | Michel Nogu..°");
            System.out.println("°   Nizam | Raquele Cardozo   °");
            System.out.println("° Rodriguinho | Thalyta Alves °");
            System.out.println("° Vanessa Lopes | Vinicius R..°");
            System.out.println("° Wanessa Camargo | Yasmin B..°");
            System.out.println("°-----------------------------°");


            System.out.println("Em quem voce vota para sair da casa?");
            voto = scanner.nextLine();
            if (voto.equalsIgnoreCase("sair")) {
                break;
            }
            boolean encontrado = false;
            for (Jogador jogador : jogadores) {
                if (jogador.getNome().equalsIgnoreCase(voto)) {
                    jogador.incrementaUmVoto();
                    if (jogador.getVotos() > maxVotos) {
                        maxVotos = jogador.getVotos();
                        eliminado = jogador;
                    }
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Jogador não encontrado.");
            }
        }


        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, "
                + "se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, "
                + "se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia "
                + "em que eu vou conseguir te eliminar com alegria. Com " + maxVotos + " votos, é "
                + "você quem sai " + eliminado.getNome() + ".");


    }
}
