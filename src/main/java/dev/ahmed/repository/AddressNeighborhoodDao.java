package dev.ahmed.repository;

import dev.ahmed.entity.AddressCity;
import dev.ahmed.entity.AddressNeighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created: 2/17/2022 23:59
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Repository
public interface AddressNeighborhoodDao extends JpaRepository <AddressNeighborhood, Long>{

}
