/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.model.ModelJajarGenjang;
import com.model.ModelSegitiga;

/**
 *
 * @author shorfana
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelJajarGenjang jj = new ModelJajarGenjang();
        jj.hitungLuas();
        jj.hitungKeliling();
        System.out.println("\n");
        
        ModelSegitiga se = new ModelSegitiga();
        se.hitungLuas();
        se.hitungKeliling();
        
    }
    
}
