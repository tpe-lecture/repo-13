package tpe.testate.crypter;
/**
 * Class für encrypt und decrypt (String).
 * */
public class CrypterImpl implements Crypter {

	/**
	 * Gültige Buchstaben und Zahlen mit final String.
	 * */
	private final String stringAllowsChars = "abcdefghijklmnopqrstuvwxyz0123456789 ";

	@Override
	/**
     * Verschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
     * so werden diese in Kleinbuchstaben umgewandelt. Ungültige Zeichen
     * werden ignoriert und nicht in den verschlüsselten Text Übernommen.
     *
     * @param input Text, der verschlüsselt werden soll.
     * @return Verschlüsselter Text.
     */
	public String encrypt(String input) {
		input = input.toLowerCase();
		return replace(input);
	}

	@Override
	 /**
     * Entschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
     * oder andere ungültige Zeichen, so wirft die Methode eine Ausnahme.
     *
     * @param input Text, der entschlüsselt werden soll.
     * @return Entschlüsselter Text.
     * @throws IllegalArgumentException Wird geworfen, wenn die Eingabe
     *      ungültige Zeichen (Großbuchstaben) enthält.
     */
	public String decrypt(String input) throws IllegalArgumentException {
		for(int i = 0; i < input.length(); i++) {
			if(!isValidChar(input.charAt(i))) {
				throw new IllegalArgumentException("String contains invalid character.");
			}
		}

		input = input.toLowerCase();

		return replace(input);
	}
	/**
	* @param Methode replace, vertauscht Zeichen durch eine Zahl oder Buchstabe und überspringt invalide Buchstaben.
	 *@return result
	**/
	private String replace(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			Character curChar = input.charAt(i);
			if(!isValidChar(curChar)) {

				continue;
			}
			switch (curChar) {
			case 'e':
				result += '3';
				break;
			case '3':
				result += 'e';
				break;
			case 'l':
				result += '1';
				break;
			case '1':
				result += 'l';
				break;
			case 'o':
				result += '0';
				break;
			case '0':
				result += 'o';
				break;
			case 'a':
				result += '4';
				break;
			case '4':
				result += 'a';
				break;
			case 't':
				result += '7';
				break;
			case '7':
				result += 't';
				break;
			default:
				result += curChar;
			}
		}
		return result;
	}
	/**
	 * @param Die Methode prüft nach valide Buchstaben.
	 * @return true oder false
	 * */
	private boolean isValidChar(Character ch) {
		if(!stringAllowsChars.contains(ch.toString())) {
			return false;
		}
		return true;
	}
}
