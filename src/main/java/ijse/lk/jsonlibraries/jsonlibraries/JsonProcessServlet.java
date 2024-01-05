package ijse.lk.jsonlibraries.jsonlibraries;

import java.io.*;

import jakarta.json.Json;
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
        reader.readObject();
    }


    public void destroy() {
    }
}