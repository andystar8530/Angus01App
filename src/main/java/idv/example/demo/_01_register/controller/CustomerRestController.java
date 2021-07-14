package idv.example.demo._01_register.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.example.demo._01_register.entity.CustomerBean;
import idv.example.demo._01_register.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	CustomerService customerService;

	// 新增一個客戶
	@PostMapping("/createCustomer")
	public CustomerBean createCustomer(@RequestBody CustomerBean customerBean) {
//		customerBean.setPassword(null);
		customerService.addMember(customerBean);
		return customerBean;
	}

	// 編輯一個客戶 By id
	@PutMapping("/UpDataCustomer/{id}")
	public String UpDataCustomer(@RequestBody CustomerBean customerBean) {
		customerService.updateCustomer(customerBean);
		return "UpDataCustomer By id OK";
	}

	// 刪除一個客戶
	@DeleteMapping("/delete/{id}")
	public String deletById(@PathVariable("id") Integer id) {
		customerService.deleteCustomerByPrimaryKey(id);
		return "Delete by id is OK";
	}

	//查詢全部客戶
	@RequestMapping("/customers")
	public List<CustomerBean> getAllCustomers() {
		return customerService.getCustomers();
	}

	// 查詢一個客戶 By id
	@RequestMapping("/customers/{id}")
	public Optional<CustomerBean> getCustomer(@PathVariable("id") Integer id) {
		Optional<CustomerBean> customer = customerService.getCustomersById(id);
		return customer;
	}

}
