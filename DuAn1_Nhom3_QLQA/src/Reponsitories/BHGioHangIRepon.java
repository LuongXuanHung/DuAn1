/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reponsitories;

import DomainModels.BHGioHangDM;
import ViewModels.BHGioHangVM;
import java.util.List;

/**
 *
 * @author TRONG NGHIA
 */
public interface BHGioHangIRepon {

    List<BHGioHangVM> findAll();

    List<BHGioHangVM> getOne(String ma);

    boolean add(BHGioHangDM a);
//    boolean delete(String ma);
//
//    boolean update(BHSanPhamDM a, String ID);

   
}
