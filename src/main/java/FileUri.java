import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUri {

    public URI getFileUri (String resourceName) throws URISyntaxException {

        URL fileUrl = getClass().getClassLoader().getResource(resourceName);
        return fileUrl.toURI();
    }

}
