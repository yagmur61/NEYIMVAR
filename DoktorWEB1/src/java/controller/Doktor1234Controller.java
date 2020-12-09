/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DoktorDAO;
import entity.Doktor1234;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author lenovo
 */
@Named
@SessionScoped
public class Doktor1234Controller implements Serializable {
//Crud İşlemleri
    private DoktorDAO kdao;
    private Doktor1234 doktor;

    public String create() {
        this.getKdao().create(doktor);
        this.doktor= new Doktor1234();
        return "index";
    }

    public List<Doktor1234> getRead() {
        return this.getKdao().read();
        
    }

    public String updateForm(Doktor1234 d) {
        this.doktor = d;
        return "update";
    }

    public String update() {
        this.getKdao().update(doktor);
       this.doktor=new Doktor1234();
        return "index";
    }

    public void delete(Doktor1234 d) {
        this.getKdao().delete(d);
    }

    public Doktor1234Controller() {
    }

    public DoktorDAO getKdao() {
        if (this.kdao == null) {
            this.kdao = new DoktorDAO();
        }

        return kdao;
    }

    public void setKdao(DoktorDAO kdao) {
        this.kdao = kdao;
    }

    public Doktor1234 getDoktor() {
        if (this.doktor == null) {
            this.doktor = new Doktor1234();
        }
        return doktor;
    }

    public void setDoktor(Doktor1234 doktor) {
        this.doktor = doktor;
    }

}
