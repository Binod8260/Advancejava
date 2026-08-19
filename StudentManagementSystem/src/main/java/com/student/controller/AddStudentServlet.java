package com.student.controller;

import com.student.dao.StudentDAO;
import com.student.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        try {
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));

            Student student = new Student(name, age);

            StudentDAO dao = new StudentDAO();

            boolean result = dao.addStudent(student);

            if (result) {
                response.getWriter().println(
                        "<h2>Student Added Successfully!</h2>"
                );
            } else {
                response.getWriter().println(
                        "<h2>Failed to Add Student!</h2>"
                );
            }

        } catch (Exception e) {

            response.getWriter().println("<h2>ERROR:</h2>");
            response.getWriter().println(
                    "<pre>" + e.getMessage() + "</pre>"
            );

            e.printStackTrace();
        }
    }
}