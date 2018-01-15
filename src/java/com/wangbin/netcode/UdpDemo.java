package com.wangbin.netcode;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * udp编程.
 * Created by wangbin on 2018/01/15.
 */
public class UdpDemo {

    // 发送者--->客户端 客户端--->发送者
    // 发送者发给客户端数据,客户端返回数据给发送者
    public static void send(){
        System.out.println("---send----");

        // 发送端
        try {
            // 创建发送方的套接字 对象 采用9004默认端口号
            DatagramSocket socket=new DatagramSocket(9004);
            // 发送内容
            String text = "hi 红军!";
            byte[] buf = text.getBytes();
            // 构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
            DatagramPacket packet = new DatagramPacket(buf,buf.length, InetAddress.getByName("127.0.0.1"),9001);
            //从此套接字发送数据报包
            socket.send(packet);
            // 接收，接收者返回的数据
            displayReciveInfo(socket);
            //关闭此数据报套接字。
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void recive(){
        System.out.println("---recive---");
        // 接收端
        try {
            //创建接收方的套接字 对象  并与send方法中DatagramPacket的ip地址与端口号一致
            DatagramSocket socket = new DatagramSocket(9001,
                    InetAddress.getByName("127.0.0.1"));
            //接收数据的buf数组并指定大小
            byte[] buf = new byte[1024];
            //创建接收数据包，存储在buf中
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            //接收操作
            socket.receive(packet);
            byte data[] = packet.getData();// 接收的数据
            InetAddress address = packet.getAddress();// 接收的地址
            System.out.println("接收的文本:::" + new String(data));
            System.out.println("接收的ip地址:::" + address.toString());
            System.out.println("接收发送端的端口::" + packet.getPort()); // 9004

            // 告诉发送者 我接收完毕了
            String temp = "我接收完毕了";
            byte buffer[] = temp.getBytes();
            //创建数据报，指定发送给 发送者的socketaddress地址
            DatagramPacket packet2 = new DatagramPacket(buffer, buffer.length,
                    packet.getSocketAddress());
            //发送
            socket.send(packet2);
            //关闭
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 接收数据并打印出来.
     * @param socket
     */
    private static void displayReciveInfo(DatagramSocket socket) throws IOException {

        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        socket.receive(packet);

        byte data[] = packet.getData();// 接受的数据
        InetAddress address = packet.getAddress();// 接受的地址
        System.out.println("接收的文本:::" + new String(data));
        System.out.println("接收的ip地址:::" + address.toString());
        System.out.println("接收发送端的端口::" + packet.getPort()); // 9004
    }

    public static void main(String[] args){
        new Thread() {
            @Override
            public void run() {
                recive();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                send();
            }
        }.start();
    }
}
