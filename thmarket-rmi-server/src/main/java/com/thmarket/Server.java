package com.thmarket;

import com.thmarket.rpc.impl.ServiceImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) throws RemoteException {
        // 注册管理器
        Registry registry = null;
        // 创建一个服务注册管理器
        registry = LocateRegistry.createRegistry(8088);
        // 创建一个服务
        ServiceImpl server = new ServiceImpl();
        // 将服务绑定命名
        registry.rebind("vince", server);
    }
}
