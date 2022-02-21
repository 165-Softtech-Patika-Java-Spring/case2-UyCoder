package dev.ahmed.service.entityservice;

import dev.ahmed.dto.AddressNeighborhoodDto;
import dev.ahmed.entity.AddressNeighborhood;
import dev.ahmed.repository.AddressNeighborhoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Created: 2/20/2022 10:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
public class AddressNeighborhoodEntitySerive {

    @Autowired
    private AddressNeighborhoodDao addressNeighborhoodDao;

    public AddressNeighborhood save(AddressNeighborhood address) {
        return addressNeighborhoodDao.save(address);
    }

    public List<AddressNeighborhoodDto> findAll(Long districtId) {
        return null;
    }
}
