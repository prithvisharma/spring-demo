package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Bank;
import com.demo.model.Customer;
import com.demo.service.BankService;
import com.demo.service.CustomerService;

@Controller
public class MainController {
	
	@Autowired
	CustomerService customerService ;
	
	@Autowired
	BankService bankService ;
	
	@RequestMapping("/")
	public String showIndex(Model model) {
		model.addAttribute("msg", "Hello from model, controller");		//using model
		return "index";		//display page index.jsp
	}
	
	@RequestMapping("/welcome")
	public ModelAndView showWelcome(ModelAndView mav, HttpServletRequest request) {
		//String message = request.getParameter("msg");
		//mav.addObject("msg", message); using model and view
		//System.out.println(message);
		//customerService = new CustomerService();		//auto wiring
		
		//fetching bank details
		Bank bank =bankService.fetchBank();
		//fetching customers
		List<Customer> list = customerService.fetchCustomers();
		//mav.addObject("list", list);  sending list of customer to jsp
		
		//adding customers to the bank
		bank.setCustomerList(list);
		
		//sending bank obj to jstl
		mav.addObject("bank", bank);
		
		mav.setViewName("welcome");		//display the pade welcome.jsp
		return mav;
	}

}
