public abstract class HTMLHelper
{
	/*
	* Permit to convert hhtml text to plain text
	*/
	public static String convertFromHTML(String chaine)
	{
		return chaine.replace("&eacute", "�").replace("&egrave", "�").replace("&agrave", "�").replace("&eacute", "�")
				.replace("&egrave", "�").replace("&agrave", "�").replace("&ecirc", "�").replace("&ocirc", "�")
				.replace("&ucirc", "�").replace("&ugrave", "�").replace("&ccedil", "�").replace("&acirc", "�");
	}
}
