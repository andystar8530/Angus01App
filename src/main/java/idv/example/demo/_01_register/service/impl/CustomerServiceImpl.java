package idv.example.demo._01_register.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idv.example.demo._01_register.entity.CustomerBean;
import idv.example.demo._01_register.repository.CustomerRepository;
import idv.example.demo._01_register.service.CustomerService;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Optional<CustomerBean> getCustomersById(int id) {
		return customerRepository.findById(id);
	}

	@Override
	public List<CustomerBean> getCustomers() {
		return (List<CustomerBean>)customerRepository.findAll();
	}

	@Override
	public CustomerBean addMember(CustomerBean bean) {
		return customerRepository.save(bean);
	}

	@Override
	public CustomerBean updateCustomer(CustomerBean bean) {
		return customerRepository.save(bean);
	}

	@Override
	public void deleteCustomerByPrimaryKey(int id) {
		customerRepository.deleteById(id);
	}
	
}
