/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author think pad
 */
public class ModelMahasiswa {

    public String nim, nama;

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void modelMahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;

    }

}
