package com.ogog.federal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * <b><b>
 *
 * @author orderuniverse
 */
public class adminisDemo {
	public static void main(String[] args) throws Exception{
		//读取的文件地址
		String srcPath = "C:\\Users\\admin\\Desktop\\行政区划代码.txt";
		//写入的文件地址
		String descPath = "C:\\Users\\admin\\Desktop\\administrative.sql";
		//初始化BufferedReader缓冲流
		BufferedReader br = new BufferedReader(new FileReader(new File(srcPath)));
		//初始化BufferedWriter缓冲流
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(descPath)));
		//声明String类型变量str存储读取的数据
		String str ;
		//循环读取写入
		while((str = br.readLine())!=null) {
			String code = str.substring(0, 6);
			String name = str.substring(6, str.length()).trim();
			if(str.substring(2,code.length()).equals("0000")){
				// 省级信息
				bw.write("insert into sys_admin_division(code,name) values('" + code + "','" + name + "');");
				bw.newLine();
			}else if(str.substring(4,code.length()).equals("00")
					|| str.substring(0,2).equals("11") || str.substring(0,2).equals("12")
					|| str.substring(0,2).equals("31")|| str.substring(0,2).equals("50")){
				// 市级信息
				String parent = code.substring(0,2) + "0000";
				bw.write("insert into sys_admin_division(parent,name,code) values('" + parent + "','" + name + "','" + code + "');");
				bw.newLine();
			}else {
				// 区县信息
				String parent = code.substring(0,4) + "00";
				bw.write("insert into sys_admin_division(parent,name,code) values ('" + parent + "','" + name + "','" + code + "');");
				bw.newLine();
			}
		}
		System.out.println("文件写入完成");
		//关闭流
		br.close();
		bw.close();
	}
}

