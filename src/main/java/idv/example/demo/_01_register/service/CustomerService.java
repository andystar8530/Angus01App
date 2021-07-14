package idv.example.demo._01_register.service;

import java.util.List;
import java.util.Optional;

import idv.example.demo._01_register.entity.CustomerBean;

public interface CustomerService {
	
	Optional<CustomerBean> getCustomersById(int id);

	List<CustomerBean> getCustomers();

	CustomerBean addMember(CustomerBean bean);

	CustomerBean updateCustomer(CustomerBean bean);

	void deleteCustomerByPrimaryKey(int key);
}
