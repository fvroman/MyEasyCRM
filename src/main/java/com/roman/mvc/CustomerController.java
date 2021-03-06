package com.roman.mvc;

import com.roman.jdbc.dao.CustomerDAO;
import com.roman.jdbc.entity.Customer;
import com.roman.service.CustomerService;
import com.roman.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    //Evil but ok for test
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public String listCustomers(Model model) {

        List<Customer> customers = customerService.getCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }



}
