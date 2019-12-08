import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class LocalVariableType {


    public static void main (String ... str) throws IOException {

        /**
         * Before
         */
        URL url = new URL("/temp/test");
        URLConnection urlConnection = url.openConnection();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(urlConnection.getInputStream());


        /**
         * New :)
         */

        // It's clear
        var bookUrl = new URL("/temp/book");
        var connection = bookUrl.openConnection();
        var bookStream = new BufferedInputStream(connection.getInputStream());

        //Names
        var a = Book.getBook().getAuthors().stream().findFirst().map(String::length).orElse(0);

        // It isn't a good idea
        var result = Main.findTheThning();

        // is it possible?
        //var var = "var";
        //var num;
        //int[] ints = {1,2,3,4};
        //var empty = null;
    }


}
