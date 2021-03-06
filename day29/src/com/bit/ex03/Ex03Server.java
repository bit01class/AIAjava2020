package com.bit.ex03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex03Server{
	
	public static void main(String[] args) throws IOException {
		ArrayList<OutputStream> list=new ArrayList<>();
		try(ServerSocket serv=new ServerSocket(5000)){
			while(true) {
			Socket sock = serv.accept();
			Thread thr=new Thread(new Runnable() {
				public void run() {
					try(
					InputStream is=sock.getInputStream();
					OutputStream os=sock.getOutputStream();
						){
						list.add(os);
						int su=-1;
						while((su=is.read())!=-1) {
							for(int i=0; i<list.size(); i++) {
								list.get(i).write(su);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
			thr.start();
			}
		}
	}

}









