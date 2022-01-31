package maps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesLegacy {
	
	public void m1() throws Exception {
		
		Properties pobj=new Properties();
		FileInputStream fis=new FileInputStream("E:\\My Workspace\\javaConcept\\src\\maps\\property.properties");
		pobj.load(fis);
		System.out.println(pobj);
		String s1=pobj.getProperty("username");
		System.out.println(s1);
		pobj.setProperty("username", "YC03RK3");
		System.out.println(pobj);
		FileOutputStream fos=new FileOutputStream("E:\\My Workspace\\javaConcept\\src\\maps\\property2.properties");
		pobj.store(fos, "Updated!!!");
		pobj.load(fis);
		pobj.setProperty("username1", "yc03mv1");
		pobj.setProperty("password1", "gspann8000");
		System.out.println(pobj.get("username1"));
		System.out.println(pobj);
	}
	
	public static void main(String[] args) throws Exception{
		PropertiesLegacy obj=new PropertiesLegacy();
		obj.m1();
	}

}
