package tpe.testate.crypter;
/**
 * Class für encrypt und decrypt (String)
 * */
public class CrypterImpl implements Crypter {

	private final String stringAllowsChars = "abcdefghijklmnopqrstuvwxyz0123456789 ";

	@Override
	/**
	 * Methode, die encrypt String
	 * */
	public String encrypt(String input) {
		input = input.toLowerCase();
		return replace(input);
	}

	@Override
	/**
	 * Methode, die encrypt String
	 * */
	public String decrypt(String input) throws IllegalArgumentException {
		for(int i = 0; i < input.length(); i++) {
			if(!isValidChar(input.charAt(i))) {
				//text durch konstante ersetzen
				throw new IllegalArgumentException("String contains invalid character.");
			}
		}

		input = input.toLowerCase();

		return replace(input);
	}
	/**
	 * Methode, die ersetzt die Buchstaben
	 * */
	private String replace(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			Character curChar = input.charAt(i);
			if(!isValidChar(curChar)) {
				// überspringt invalide buchstaben
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
	 * überspringt invalide buchstaben
	 * */
	private boolean isValidChar(Character ch) {
		if(!stringAllowsChars.contains(ch.toString())) {
			return false;
		}
		return true;
	}
}
