package com.example.demo105.Services;
import com.example.demo105.Dao.entity.GlassesEntity;
import com.example.demo105.Dao.repository.ContactRepository;
import com.example.demo105.Mapper.ContactMapper;
import com.example.demo105.Model.AboutDto;
import com.example.demo105.Model.ContactDto;
import com.example.demo105.Model.GlassesDto;
import com.example.demo105.Model.ShopDto;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ContactService implements MethodService{
    private ContactRepository contactRepository;
    public ContactService(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }
    @Override
        public void saveContact(ContactDto contactDto) {
            contactRepository.save(ContactMapper.contactEntityDto(contactDto));
        System.out.println(ContactMapper.contactEntityDto(contactDto));
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