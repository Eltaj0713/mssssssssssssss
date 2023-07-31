package com.example.demo105.Services;
import com.example.demo105.Dao.entity.GlassesEntity;
import com.example.demo105.Dao.repository.AboutRepository;
import com.example.demo105.Mapper.AboutMapper;
import com.example.demo105.Model.AboutDto;
import com.example.demo105.Model.ContactDto;
import com.example.demo105.Model.GlassesDto;
import com.example.demo105.Model.ShopDto;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AboutService implements MethodService{
    private final AboutRepository aboutRepository;
    public AboutService(AboutRepository aboutRepository){
        this.aboutRepository = aboutRepository;
    }
    @Override
    public void saveContact(ContactDto contactEntity){
    }
    @Override
    public List<GlassesDto> showFindAll(){
        return null;
    }
    @Override
    public List<AboutDto> showAboutFindAll() {
        var  aboutEntityList = aboutRepository.findAll();
        var aboutDtoList=aboutEntityList.parallelStream()
                .map(it -> AboutMapper.INSTANCE.mapToDtoAbout(it))
                .toList();
        return aboutDtoList;
    }
    @Override
    public List<ShopDto> showShopFindAll(){
        return null;
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