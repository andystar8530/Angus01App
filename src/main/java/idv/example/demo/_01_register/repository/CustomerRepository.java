package idv.example.demo._01_register.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import idv.example.demo._01_register.entity.CustomerBean;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerBean, Integer> {

}
