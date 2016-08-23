import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import sun.plugin.dom.css.CSSValueList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by dash on 8/20/16.
 */
public class start {

    public static void main(String... s) {

        try {


            String inputFile = "/home/dash/carlos/json_parser/input3.txt";
            BufferedReader in = new BufferedReader(new FileReader(inputFile));
            String l1;
           // JsonReader reader = new JsonReader(in);

            while ((l1 = in.readLine()) != null) {
                JsonParser _parser = new JsonParser();
                JsonElement jsonElement = _parser.parse(l1);
                JsonObject jsonObject1 = jsonElement.getAsJsonObject();
                System.out.println(jsonObject1.toString());
                jsonObject1.addProperty("new", "D");
                System.out.println(jsonObject1.toString());

                System.out.println(jsonObject1.get("A"));

               JsonObject O = new JsonParser().parse("{\"A\":2,\"B\":\"A green Door\",\"C\":12.50,\"D\":[\"home\",\"green\"]}").getAsJsonObject();

                //O.addProperty();


                System.out.println(O.getAsJsonObject().getAsJsonPrimitive("B"));
                System.out.println(O.getAsJsonObject());

               //Object O1  = O.getAsJsonObject("B");





            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
