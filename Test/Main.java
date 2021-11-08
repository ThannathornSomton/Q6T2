import java.io;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;


import java.io.IOException;

import java.lang.Object;
import java.io.InputStream;
import java.io.FileInputStream;
public class Main{
	public static void main(String[] args) {
		printPath("/home/guest/Downloads");
		//System.out.println("sdasdd");
	}

	public static void printPath(String dir){
		//System.out.print(dir);
		//System.out.println("1");
		File file = new File(dir);
		if (file.isDirectory() ) {
			System.out.println("2");
			String names[] = file.list();
			if (names != null && !file.isHidden()){
				for (int i = 0; i < names.length; i++) {
				File hidden = new File(dir+"\\"+names[i]);
					if(!hidden.isHidden()){ 
						System.out.println(dir+"\\"+names[i]);
						printPath(dir + "\\" + names[i]);

			}
			}
		}
		}

	}

	public static void GUI() {



	}

	

}

