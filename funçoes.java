import java.util.Locale;
import java.util.Scanner;

public class funçoes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
      double preco = 0.0;
		
		System.out.println("Entre com o valor do produto: ");
		preco = leia.useLocale(ponto).nextDouble();
		
		System.out.println(RetornaCalculo(preco));
		
		
		
		leia.close();

	}

	static String RetornaCalculo(double preco) {
	double precoComImposto = preco + (preco * 0.05);
	double precoDeVenda = precoComImposto+ (precoComImposto * 0.40);
	return "Preço final do produto: "+ precoDeVenda;
		}
	}

