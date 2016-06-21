package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    //тип должен быть примитивом или сериализуемым, а также метод должен бросать исключение
    public String sayHello() throws RemoteException;
}
