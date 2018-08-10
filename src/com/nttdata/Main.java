package com.nttdata;

import java.io.File;

public class Main {

    static String path = "C:/Users/cristian.chirita/Downloads";

    public static void main(String[] args) {
	// write your code here
        File dir = new File(path);
        navigate(dir);
    }

    public static void navigate(File file) {
        System.out.println(file.getAbsoluteFile());

        if(file.isDirectory()){
            String[] subNote = file.list();
            for(String filename : subNote){
                navigate(new File(file, filename));
            }
        }
    }
}
