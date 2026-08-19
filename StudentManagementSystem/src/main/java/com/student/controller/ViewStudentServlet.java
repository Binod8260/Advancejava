package com.student.controller;

import com.student.dao.StudentDAO;
import com.student.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/viewStudents")
public class ViewStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        StudentDAO dao = new StudentDAO();

        List<Student> students = dao.getAllStudents();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>View Students</title>");

        out.println("<style>");
        out.println("body { font-family: Arial; padding: 30px; }");
        out.println("table { width: 70%; border-collapse: collapse; }");
        out.println("th, td { border: 1px solid black; padding: 10px; text-align: center; }");
        out.println("th { background: #333; color: white; }");
        out.println("</style>");

        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Student Management System</h1>");
        out.println("<h2>All Students</h2>");

        out.println("<table>");

        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>Name</th>");
        out.println("<th>Age</th>");
        out.println("</tr>");

        for (Student student : students) {

            out.println("<tr>");

            out.println("<td>" + student.getId() + "</td>");
            out.println("<td>" + student.getName() + "</td>");
            out.println("<td>" + student.getAge() + "</td>");

            out.println("</tr>");
        }

        out.println("</table>");

        out.println("<br>");

        out.println("<a href='add-student.html'>Add New Student</a>");

        out.println("</body>");
        out.println("</html>");
    }
}