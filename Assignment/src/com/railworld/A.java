package com.railworld;

import java.io.File;

public class A {
	public class FileName {

	    public static void main(String[] args) {
	        String directoryPath = ""; 

	        File directory = new File(directoryPath);

	        if (directory.exists() && directory.isDirectory()) {
	            File[] files = directory.listFiles();

	            if (files != null) {
	                System.out.println("Existing Files:");
	                for (File file : files) {
	                    if (file.isFile()) {
	                        System.out.println(file.getName());
	                    }
	                }
	            } else {
	                System.out.println("The directory is empty.");
	            }
	        } else {
	            System.out.println("The directory does not exist.");
	        }
	    }
	}

}
