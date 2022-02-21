package dev.ahmed.service.entityservice;

import dev.ahmed.entity.Address;
import dev.ahmed.repository.AddressDao;
import dev.ahmed.service.BaseEntityService;
import lombok.RequiredArgsConstructor;
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
public class AddressEntitySerive extends BaseEntityService<Address, AddressDao> {


    public AddressEntitySerive(AddressDao dao) {
        super(dao);
    }

}
