package com.example.projectfinaljava4.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ThucVat")
public class ThucVat {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ten_thuc_vat")
    private String ten;
    @Column(name = "loai")
    private String loai;
    @Column(name = "gioi_tinh")
    private long gioiTinh;
    @Column(name = "gia")
    private float gia;
    @Column(name = "nguon_goc")
    private String nguonGoc;

    public ThucVat() {

    }

    public ThucVat(String ten, String loai, long gioiTinh, float gia, String nguonGoc) {
        this.ten = ten;
        this.loai = loai;
        this.gioiTinh = gioiTinh;
        this.gia = gia;
        this.nguonGoc = nguonGoc;
    }

    public ThucVat(int id, String ten, String loai, long gioiTinh, float gia, String nguonGoc) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.gioiTinh = gioiTinh;
        this.gia = gia;
        this.nguonGoc = nguonGoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public long getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(long gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }
}
