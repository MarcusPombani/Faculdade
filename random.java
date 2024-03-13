import java.security.SecureRandom;

public class random {

  public static void main(String[] args) {
    randomnumber();
    System.out.println("O nosso número aleatório é:" + randomnumber());
  }

  static int randomnumber() {
    SecureRandom random = new SecureRandom();
    int numbers = 1 + random.nextInt(6);
    return numbers;
  }
}
