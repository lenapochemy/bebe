import java.io.File;
import java.io.Reader;
import java.util.Arrays;
import com.google.gson.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
       try {
           String aaa = "{\n" +
                   " \"name\" : \"Filya\",\n" +
                   "\"id\" : 1,\n" +
                   "\"owner\" : \"Lena\"\n" +
                   "}";

           Gson g = new Gson();
           Cat catty = g.fromJson(aaa, Cat.class);

           System.out.println(catty.getName());

           Reader reader = Files.newBufferedReader(Paths.get("test.json"));

           Cat kitty = g.fromJson(reader, Cat.class);
           System.out.println(kitty.getName() + " " + kitty.getId() + " " + kitty.getOwner());

       } catch (Exception e){
           System.out.println("is bad");
       }
    }
}