package dev.ahmed.service.entityservice;

import dev.ahmed.entity.Address;
import dev.ahmed.entity.AddressCountry;
import dev.ahmed.repository.AddressCountryDao;
import dev.ahmed.repository.AddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Created: 2/20/2022 10:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
public class AddressCountryEntitySerive {

    @Autowired
    private AddressCountryDao addressCountryDao;

    public AddressCountry save(AddressCountry address) {
        return addressCountryDao.save(address);
    }

    public Optional<AddressCountry> findById(Long id) {
        return addressCountryDao.findById(id);
    }

}
