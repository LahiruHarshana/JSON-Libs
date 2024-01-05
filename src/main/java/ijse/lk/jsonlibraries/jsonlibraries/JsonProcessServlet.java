package ijse.lk.jsonlibraries.jsonlibraries;

import java.io.*;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonReader;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "JsonProcessServlet", value = "/json")
public class JsonProcessServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //without json libraries
//        BufferedReader reader = request.getReader();
//        String line = reader.readLine();
//        String json ="";
//        while ((line = reader.readLine()) != null){



//use json libraries
        JsonReader reader = Json.createReader(request.getReader());
        JsonObject jsonObject = reader.readObject();
        System.out.println(jsonObject);


        //json writer
        //json libraries use
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add("id", "C001");



    }


    public void destroy() {
    }
}