package com.example.projectfinaljava4.servlet;

import com.example.projectfinaljava4.Entity.ThucVat;
import com.example.projectfinaljava4.repository.ThucVatRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletThucVat", value = {
        "/ThucVat/hien_thi",
        "/ThucVat/add",
        "/ThucVat/view_add",
        "/ThucVat/view_update",
        "/ThucVat/update",
        "/ThucVat/delete",
})
public class ServletThucVat extends HttpServlet {
    private ThucVatRepository thucVatRepository = new ThucVatRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien_thi")) {
            this.hienThiThucVat(request, response);
        } else if (uri.contains("view_add")) {
            this.viewAdd(request, response);
        } else if (uri.contains("view_update")) {
            this.viewUpdate(request, response);
        }
        else if (uri.contains("delete")) {
            this.delete(request, response);
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id =Integer.parseInt( request.getParameter("id"));
        ThucVat thucVat = thucVatRepository.getById(id);
        thucVatRepository.delete(thucVat);
        response.sendRedirect("/ThucVat/hien_thi");

    }

    private void viewUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt( request.getParameter("id"));
        ThucVat thucVat = thucVatRepository.getById(id);
        request.setAttribute("thucVat",thucVat);
        request.getRequestDispatcher("/view/updateThucVat.jsp").forward(request, response);
    }

    private void viewAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/view/addThucVat.jsp").forward(request, response);
    }

    private void hienThiThucVat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<ThucVat> listThucVat = thucVatRepository.getAll();
        request.setAttribute("listThucVat", listThucVat);
        request.getRequestDispatcher("/view/view.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("add")) {
            this.add(request, response);
        }
        else if(uri.contains("update")){
            int id = Integer.parseInt(request.getParameter("id"));
            String ten = request.getParameter("ten");
            String loai = request.getParameter("loai");
            Long gioiTinh = Long.parseLong(request.getParameter("gioiTinh"));
            Float gia = Float.parseFloat(request.getParameter("gia"));
            String nguonGoc = request.getParameter("nguonGoc");
            ThucVat thucVat = new ThucVat();
            thucVat = thucVatRepository.getById(id);
            thucVat.setGia(gia);
            thucVat.setLoai(loai);
            thucVat.setTen(ten);
            thucVat.setGioiTinh(gioiTinh);
            thucVat.setNguonGoc(nguonGoc);
            thucVatRepository.update(thucVat);
            response.sendRedirect("/ThucVat/hien_thi");
        }
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ten = request.getParameter("ten");
        String loai = request.getParameter("loai");
        Long gioiTinh = Long.parseLong(request.getParameter("gioiTinh"));
        Float gia = Float.parseFloat(request.getParameter("gia"));
        String nguonGoc = request.getParameter("nguonGoc");
        ThucVat thucVat = new ThucVat();
        thucVat.setGia(gia);
        thucVat.setLoai(loai);
        thucVat.setTen(ten);
        thucVat.setGioiTinh(gioiTinh);
        thucVat.setNguonGoc(nguonGoc);
        thucVatRepository.add(thucVat);
        response.sendRedirect("/ThucVat/hien_thi");
    }
}
