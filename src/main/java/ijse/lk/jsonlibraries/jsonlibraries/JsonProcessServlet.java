package ijse.lk.jsonlibraries.jsonlibraries;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "JsonProcessServlet", value = "/json")
public class JsonProcessServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedReader reader = request.getReader();
        String line = reader.readLine();

        while (line != null)
    }

    public void destroy() {
    }
}