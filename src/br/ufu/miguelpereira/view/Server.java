package br.ufu.miguelpereira.view;

import br.ufu.miguelpereira.control.GraphHandler;
import br.ufu.miguelpereira.thrift.*;

import org.apache.thrift.server.*;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class Server {
    public static void main(String [] args){
        try{
            GraphHandler handler = new GraphHandler();
            Operations.Processor processor = new Operations.Processor(handler);
            TServerTransport serverTransport = new TServerSocket(9080);
            TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
            //Criar concorrencia com apenas um thread
            //TNonblockingServerSocket serverTransport = new TNonblockingServerSocket(9080);
            //THsHaServer.Args argus = new THsHaServer.Args(serverTransport);
            //argus.processor(processor);
            //argus.transportFactory(new TFramedTransport.Factory());
            //TServer server = new THsHaServer(argus);
            System.out.println("Servidor Inicializado...");
            server.serve();
        } catch (Exception x){
            x.printStackTrace();
        }
    }
}
