package jrout.tutorial.springmvc.employee.service;

import jrout.tutorial.springmvc.employee.dao.EmployeeDao;
import jrout.tutorial.springmvc.employee.model.Employee;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	private EmployeeDao employeeDao;
	
	@Override
	public Employee getEmployeeDetail(int empId) {
		return employeeDao.getEmployeeDetail(empId);
	}
}