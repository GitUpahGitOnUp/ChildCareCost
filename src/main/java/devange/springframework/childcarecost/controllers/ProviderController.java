package devange.springframework.childcarecost.controllers;

import devange.springframework.childcarecost.entities.ProviderContactInfo;
import devange.springframework.childcarecost.services.ProviderServices;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/providerContactInfo")
public class ProviderController {
    private final ProviderServices providerServices;

    public ProviderController(ProviderServices providerServices) {
        this.providerServices = providerServices;
    }

    @PostMapping
    public ProviderContactInfo createProvider(@RequestBody ProviderContactInfo providerContactInfo) {
        return providerServices.saveProviderContactInfo(providerContactInfo);
    }

    @GetMapping("")
    public List<ProviderContactInfo> getAllProviderContactInfo() {
        return providerServices.getAllProviders();
    }
}
