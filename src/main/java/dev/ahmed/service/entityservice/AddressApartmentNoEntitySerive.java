package dev.ahmed.service.entityservice;

import dev.ahmed.entity.AddressApartmentNumber;
import dev.ahmed.entity.AddressCity;
import dev.ahmed.repository.AddressApartmentNoDao;
import dev.ahmed.repository.AddressCityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created: 2/20/2022 10:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
public class AddressApartmentNoEntitySerive {

    @Autowired
    private AddressApartmentNoDao addressApartmentNoDao;

    public AddressApartmentNumber save(AddressApartmentNumber address) {
        return addressApartmentNoDao.save(address);
    }

}
