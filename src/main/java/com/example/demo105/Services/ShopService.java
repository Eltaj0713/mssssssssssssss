package com.example.demo105.Services;
import com.example.demo105.Dao.entity.GlassesEntity;
import com.example.demo105.Dao.repository.ShopRepository;
import com.example.demo105.Mapper.ShopMapper;
import com.example.demo105.Model.AboutDto;
import com.example.demo105.Model.ContactDto;
import com.example.demo105.Model.GlassesDto;
import com.example.demo105.Model.ShopDto;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ShopService implements MethodService{
    private final ShopRepository shopRepository;
    public ShopService(ShopRepository shopRepository){
        this.shopRepository = shopRepository;
    }
    @Override
    public void saveContact(ContactDto contactEntity){
    }
    @Override
    public List<GlassesDto> showFindAll(){
        return null;
    }
    @Override
    public List<AboutDto> showAboutFindAll(){
        return null;
    }
    @Override
    public List<ShopDto> showShopFindAll(){
        var  shopEntityList = shopRepository.findAll();
        return shopEntityList.parallelStream()
                .map(ShopMapper.INSTANCE::mapToDtoShop)
                .toList();
    }
    @Override
    public void saveC(GlassesEntity glassesEntity){
    }
    @Override
    public GlassesEntity getGlassesById(Integer id){
        return null;
    }
    @Override
    public void deleteProperty(Integer id){
    }
}