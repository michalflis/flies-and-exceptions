import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextReverser {



    public static void main (String[] args) throws IOException, URISyntaxException {

        System.out.println(reverseGivenText(getFileContent("data.txt")));
    }

    public static String getFileContent(String fileName) throws IOException, URISyntaxException {

        FileUri fileUri = new FileUri();

        String fileContent = Files.readString(Paths.get(fileUri.getFileUri(fileName)));
        return fileContent;
    }


    public static String reverseGivenText(String givenText) {
        String reversedGivenText = "";
        for (int i = givenText.length() - 1; i >= 0; i--)
            reversedGivenText = reversedGivenText + givenText.charAt(i);
        return reversedGivenText;
    }

}

