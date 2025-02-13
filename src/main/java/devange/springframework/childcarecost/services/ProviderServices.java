package devange.springframework.childcarecost.services;

import devange.springframework.childcarecost.controllers.ProviderController;
import devange.springframework.childcarecost.entities.ProviderContactInfo;
import devange.springframework.childcarecost.repository.ChildcareRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServices {

    ChildcareRepository childcareRepository;


    public ProviderServices(ChildcareRepository childcareRepository) {
        this.childcareRepository = childcareRepository;
    }

    public ProviderContactInfo saveProviderContactInfo (ProviderContactInfo providerContactInfo) {
        return childcareRepository.save(providerContactInfo);
    }

    public List<ProviderContactInfo> getAllProviders() {
        return childcareRepository.findAll();
    }
}
