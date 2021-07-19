import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class FileUri {

    public URI getFileUri (String resourceName) throws URISyntaxException {

        URL fileUrl = getClass().getResource(resourceName);
        return fileUrl.toURI();
    }

}
