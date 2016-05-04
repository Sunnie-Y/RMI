package com.p.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
* �ͻ��˲��ԣ��ڿͻ��˵���Զ�̶����ϵ�Զ�̷����������ؽ����
*/
public class HelloClient {
    public static void main(String args[]){
        try {
            //��RMI����ע����в�������ΪRHello�Ķ��󣬲��������ϵķ���
            RMIHelloInterface rhello =(RMIHelloInterface) Naming.lookup("rmi://100.70.9.239:8888/RHello");
            System.out.println(rhello.helloWorld());
            System.out.println(rhello.sayHelloToSomeBody("����"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();  
        }
    }
}
