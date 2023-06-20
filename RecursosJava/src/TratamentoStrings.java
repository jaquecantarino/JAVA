public class TratamentoStrings {

	public static void main(String[] args) {
		//Exemplicando tratamendo de variaveis do tipo String.
		
		String original = "abcde FGHIJ lmno PQRS tuvw XYZ     ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Exibindo a String original: -" + original + "-");
		System.out.println("Usando o toLowerCase para transformar tudo em minusculo: -" + s01 + "-");
		System.out.println("Usando o toUpperCase para transformar tudo em maiusculo: -" + s02 + "-");
		System.out.println("Usando trim para remover espaços no final: -" + s03 + "-");
		System.out.println("Usando substring(2) para criar uma nova string a partir da 2ª posição: -" + s04 + "-");
		System.out.println("Usando substring(2, 9) para recortar o espaço determinado e criar uma nova string: -" + s05 + "-");
		System.out.println("Usando replace('a', 'x') para substituir caracteres dentro da string: -" + s06 + "-");
		System.out.println("Usando replace('abc', 'xy') para substituir substrings dentro da string: -" + s07 + "-");
		System.out.println("Usando Index of 'bc': para descobrir a primeira posição da substring dentro da string" + i);
		System.out.println("Usando Last index of 'bc': para descobrir a ultima posição da substring dentro da string" + j);

	}

}
