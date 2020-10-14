package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class StartServer {

    public static void main(String[] args) {
        new Server().start();


    }
}
