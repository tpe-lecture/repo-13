package tpe.testate.crypter;

/**
 * Class f�r encrypt und decrypt (String).
 */
public class CrypterImpl implements Crypter {

	/**
	 * G�ltige Buchstaben und Zahlen mit final String.
	 */
	private final String stringAllowsChars = "abcdefghijklmnopqrstuvwxyz0123456789 ";

	/**
	 * Verschl�sselt den gegebenen Text. Enth�lt die Eingabe Gro�buchstaben, so
	 * werden diese in Kleinbuchstaben umgewandelt. Ung�ltige Zeichen werden
	 * ignoriert und nicht in den verschl�sselten Text �bernommen.
	 *
	 * @param input
	 *            Text, der verschl�sselt werden soll.
	 * @return Verschl�sselter Text.
	 */
	@Override
	public String encrypt(String input) {
		input = input.toLowerCase();
		return replace(input);
	}

	/**
	 * Entschl�sselt den gegebenen Text. Enth�lt die Eingabe Gro�buchstaben,
	 * oder andere ung�ltige Zeichen, so wirft die Methode eine Ausnahme.
	 *
	 * @param input
	 *            Text, der entschl�sselt werden soll.
	 * @return Entschl�sselter Text.
	 * @throws IllegalArgumentException
	 *             Wird geworfen, wenn die Eingabe ung�ltige Zeichen
	 *             (Gro�buchstaben) enth�lt.
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		for (int i = 0; i < input.length(); i++) {
			if (!isValidChar(input.charAt(i))) {
				throw new IllegalArgumentException("String contains invalid character.");
			}
		}

		input = input.toLowerCase();

		return replace(input);
	}

	/**
	 * Methode replace, vertauscht Zeichen durch eine Zahl oder Buchstabe und
	 * �berspringt invalide Buchstaben.
	 *
	 * @param input
	 *            String Variable die ersetzt wird
	 * @return result
	 **/
	private String replace(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			Character curChar = input.charAt(i);
			if (!isValidChar(curChar)) {

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
	 * Die Methode pr�ft nach valide Buchstaben.
	 * @param ch Der �berpr�fene Character
	 * @return true oder false
	 */
	private boolean isValidChar(Character ch) {
		if (!stringAllowsChars.contains(ch.toString())) {
			return false;
		}
		return true;
	}
}
