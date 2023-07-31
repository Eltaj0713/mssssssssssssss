package com.example.demo105.Services;
import com.example.demo105.Dao.entity.GlassesEntity;
import com.example.demo105.Model.AboutDto;
import com.example.demo105.Model.ContactDto;
import com.example.demo105.Model.GlassesDto;
import com.example.demo105.Model.ShopDto;
import java.util.List;
public interface MethodService{
    void saveContact(ContactDto contactDto);
    List<GlassesDto> showFindAll();
    List<AboutDto> showAboutFindAll();
    List<ShopDto> showShopFindAll();
    void saveC(GlassesEntity glassesEntity);
    GlassesEntity getGlassesById(Integer id);
    void deleteProperty(Integer id);
}