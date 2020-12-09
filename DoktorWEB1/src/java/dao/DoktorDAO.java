/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Doktor1234;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author lenovo
 */
public class DoktorDAO extends DBConnection {
       public void create(Doktor1234 d) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into doktor1234 (id) values ('" + d.getId() + "')");
            st.executeUpdate("insert into doktor1234 (adi) values ('" + d.getAdi() + "')");
            st.executeUpdate("insert into doktor1234 (soyadi) values ('" + d.getSoyadi() + "')");
            st.executeUpdate("insert into doktor1234 (yasi) values ('" + d.getYasi() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

        public List<Doktor1234> read () {
          List<Doktor1234>list = new ArrayList<>();
        
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from doktor1234 order by id asc");
              while (rs.next()){
             Doktor1234 tmp = new Doktor1234(rs.getInt("id"), rs.getString("adi"), rs.getString("soyadi"), rs.getInt("yasi"));
             list.add(tmp);
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      return list;
        }
     
        
        public void update(Doktor1234 d) {
        try {
            Statement st = this.connect().createStatement();
           // st.executeUpdate("insert into doktor1234  (id) values = ('" + d.getId() + "')");
           st.executeUpdate("update  doktor1234 set id = '" + d.getId()+ "'where adi=" + d.getId());
            st.executeUpdate("update  doktor1234 set adi = '" + d.getAdi() + "'where adi=" + d.getId());
            st.executeUpdate("update  doktor1234 set soyadi= '" + d.getSoyadi() + "'where soyadi=" + d.getId());
            st.executeUpdate("update  doktor1234 set yasi ='" + d.getYasi() + "'where yasi=" + d.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
       
       public void delete(Doktor1234 d) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from doktor1234 where id = " + d.getId());
            st.executeUpdate("delete from doktor1234 where adi =" + d.getAdi());
            st.executeUpdate("delete from doktor1234 where soyadi = " + d.getSoyadi());
            st.executeUpdate("delete from doktor1234 where yasi = " + d.getYasi());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

   
       
       
       
       
       
       
       
       
       
}
