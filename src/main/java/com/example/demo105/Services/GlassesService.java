package com.example.demo105.Services;
import com.example.demo105.Dao.entity.GlassesEntity;
import com.example.demo105.Dao.repository.ProductRepository;
import com.example.demo105.Mapper.GlassesMapper;
import com.example.demo105.Model.AboutDto;
import com.example.demo105.Model.ContactDto;
import com.example.demo105.Model.GlassesDto;
import com.example.demo105.Model.ShopDto;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GlassesService implements MethodService{
    private final ProductRepository productRepository;
    public GlassesService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public void saveContact(ContactDto contactEntity){
    }
    @Override
    public List<GlassesDto> showFindAll(){
        var productEntityList= productRepository.findAll();
        var productDtoList=productEntityList.parallelStream()
                .map(GlassesMapper.INSTANCE::mapToDtoGlasses)
                .toList();
        return productDtoList;
    }
    @Override
    public List<AboutDto> showAboutFindAll(){
        return null;
    }
    @Override
    public List<ShopDto> showShopFindAll(){
        return null;
    }
    @Override
    public void saveC(GlassesEntity glassesEntity){
        productRepository.save(glassesEntity);
    }
    @Override
    public GlassesEntity getGlassesById(Integer id) {
        return productRepository.findById(id).get();
    }
    @Override
        public void deleteProperty(Integer id){
        productRepository.deleteById(id);
    }
}