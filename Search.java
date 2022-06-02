package wtf.droid;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String urlString = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI(urlString));
    }
}
