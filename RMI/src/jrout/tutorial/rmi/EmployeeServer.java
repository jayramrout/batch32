package jrout.tutorial.rmi;

import jrout.tutorial.rmi.impl.EmployeeServiceImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmployeeServer {
    public static void main(String[] args) throws RemoteException {
        IEmployeeService iEmployeeService = new EmployeeServiceImpl();
        Registry registry = LocateRegistry.createRegistry(4444);
        registry.rebind("employee",iEmployeeService);
        System.out.println("My Employee Service is registered....");


    }
}
