package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    //Конструктор суперкласса UnicastRemoteObject должен бросать исключения:
    public MyRemoteImpl() throws RemoteException {

    }

    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            //регистрация в реестре RMI. После регистрации генерим rmic классы заглушки и скелета
            Naming.rebind("RemoteHello", service);

        } catch (Exception ex) {
        }
    }
}
