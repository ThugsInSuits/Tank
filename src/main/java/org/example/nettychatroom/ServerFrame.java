package org.example.nettychatroom;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author XiZhuangBaoTu
 * Date 2023/5/20 10:18
 * Version 1.0
 * @description
 **/
public class ServerFrame extends Frame {
    public static final ServerFrame INSTANCE = new ServerFrame();
    TextArea taServer = new TextArea();
    TextArea taClient = new TextArea();
    private Server server = new Server();

    public ServerFrame(){
        this.setSize(800,600);
        this.setLocation(300,30);
        Panel p = new Panel(new GridLayout(1,2));
        p.add(taServer);
        p.add(taClient);
        this.add(p);

        this.updateServerMsg("Server");
        this.updateClientMsg("Client");

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0 );
            }
        });
    }

    public void updateServerMsg(String str) {
        this.taServer.setText(taServer.getText()+str+System.getProperty("line.separator"));
    }
    public void updateClientMsg(String str) {
        this.taClient.setText(taClient.getText()+str+System.getProperty("line.separator"));
    }

    public static void main(String[] args) {
        ServerFrame.INSTANCE.setVisible(true);
        ServerFrame.INSTANCE.server.start();
    }
}
