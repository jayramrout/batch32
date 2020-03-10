package jrout.tutorial.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEmployeeService extends Remote {
    String getEmployeeByID(int id) throws RemoteException;
}