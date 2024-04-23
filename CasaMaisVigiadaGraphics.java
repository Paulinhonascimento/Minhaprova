import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Jogador {
    String nome;
    int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementaUmVoto() {
        this.votos++;
    }
}

public class CasaMaisVigiada {

    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        // Cadastro de jogadores
        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
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

        String votoEm = "";
        int totalVotos = 0;

        // Votos
        while (!votoEm.equalsIgnoreCase("sair")) {
            votoEm = JOptionPane.showInputDialog(null,
                    "Em quem você vota para sair da casa?");

            if (!votoEm.equalsIgnoreCase("sair")) {
                boolean votou = false;

                for (Jogador jogador : jogadores) {
                    if (votoEm.equalsIgnoreCase(jogador.getNome())) {
                        jogador.incrementaUmVoto();
                        totalVotos++;
                        votou = true;
                    }
                }

                if (!votou) {
                    JOptionPane.showMessageDialog(null, "Jogador não encontrado!");
                }
            }
        }

        // Apuração final dos votos (discurso de eliminação)
        int votoMaior = 0;
        String eliminado = "";

        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > votoMaior) {
                votoMaior = jogador.getVotos();
                eliminado = jogador.getNome();
            }
        }

        JOptionPane.showMessageDialog(null, "Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, "+ "se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, "
                + "se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia "
                + "em que eu vou conseguir te eliminar com alegria. Com " + votoMaior + " votos, é você quem "
                + "sai " + eliminado + ".");
    }
}
