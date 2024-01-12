package ijse.lk.jsonlibraries.jsonlibraries.api;


import ijse.lk.jsonlibraries.jsonlibraries.model.Student;
import jakarta.json.Json;
import jakarta.json.JsonBuilderFactory;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;


@WebServlet(name = "JsonBindServlet", value = "/json-bind")
public class JsonBindServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Student s1 = new Student("S001","Kamal",25);
        Student s2 = new Student("S002","Nimal",26);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        Jsonb jsonb = JsonbBuilder.create();

        jsonb.toJson(students);



    }

}
