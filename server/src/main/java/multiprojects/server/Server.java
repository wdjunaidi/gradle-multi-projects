package multiprojects.server;

import multiprojects.shared.Util;

public class Server {

    public Server() {
        if (Util.isTrue()) {
            System.out.println("Server");
        }
    }

}