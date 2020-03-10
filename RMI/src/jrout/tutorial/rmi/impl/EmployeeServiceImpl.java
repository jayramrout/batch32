package jrout.tutorial.rmi.impl;

import jrout.tutorial.rmi.IEmployeeService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl extends UnicastRemoteObject implements IEmployeeService {

    static Map<Integer,String> employees = new HashMap();
    static {
        employees.put(20,"Peter");
        employees.put(30,"John");
        employees.put(31,"Dan");
        employees.put(40,"Sam");
        employees.put(45,"Jai");
//        employees.put("K","Kota");
    }

    public EmployeeServiceImpl() throws RemoteException {
        super();
    }
    // write another api to add..
    // employees.put(60,"Rohan");

    @Override
    public String getEmployeeByID(int id) throws RemoteException {
        System.out.println("Got request for "+ id);
        String name = (String)employees.get(id);
        if(name != null) {
            return name;
        }
        return "";

    }
}
