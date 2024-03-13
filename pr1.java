import java.util.Scanner;

public class pr1 {

  static Cidade[] options = {
    new Cidade("Sao Paulo"),
    new Cidade("Rio de Janeiro"),
    new Cidade("Brasilia"),
  };

  public static void main(String[] args) {
    Scanner scanObj = new Scanner(System.in);
    {
      System.out.println("Coloque seu nome: (Sem acentos)");
      // Prompt pro usuário falar o seu nome
      String Nome = scanObj.nextLine();
      System.out.println(
        "Escolha sua cidade (1 - Sao Paulo, 2 - Rio de Janeiro, 3 - Brasilia): "
      );
      int option = scanObj.nextInt();
      scanObj.nextLine(); // Para consumir a nova linha
      String Cid = options[option - 1].getNome();
      System.out.println("Digite sua idade: ");
      int age = scanObj.nextInt();

      System.out.println("Nome: " + Nome);
      System.out.println("Cidade: " + Cid);
      System.out.println("Idade: " + age);
    }
  }
}

class Cidade {

  private String x;

  public Cidade(String x) {
    this.x = x;
  }

  public String getNome() {
    return x;
  }
}
