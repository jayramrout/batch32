package jrout.tutorial.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmployeeDriver {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(4444);
        IEmployeeService employee = (IEmployeeService)registry.lookup("employee");
        String employeeByID = employee.getEmployeeByID(40);
        // employee.add(50,"Jagan")
        // employee.add(60,"Rohan")
        employee.getEmployeeByID(60);

        System.out.println(employeeByID);

    }
}
