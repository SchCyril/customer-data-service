package fr.cyril.customerdataservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cyril.customerdataservice.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
