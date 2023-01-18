//package com.dtrust;

import java.io.File;
import java.io.IOException;
import java.lang.NullPointerException;
import java.util.HashMap;
import java.util.Map;
import java.lang.*;
import java.util.*;

public class Repertoire {


    //.csv and .txt files directory
    //public static File fileDir = new File("C:/Users/User/Documents/Prodways/Log/23/ProcessMachine"); // (23 represents year 2023)
    public static File fileDir = new File("/mnt/c/Users/anani.djato/Downloads");

    // snapshot directory
    //public static final File snapshotDir = new File("C:/Users/User/Documents/Prodways/Log/snapshot");
    public static final File snapshotDir = new File("/mnt/c/Users/anani.djato/Downloads");

    //list to store file paths
    public static ArrayList<String> csvFilePath = new ArrayList<String>();
    public static ArrayList<String> snapshotPath = new ArrayList<String>();
    public static ArrayList<String> textFilePath = new ArrayList<String>();

    // to count the number of each file type
    //public static int nbCSVFile = 0;
    //public static int nbSnapshot = 0;
    //public static int nbTextFile = 0;


    public static void main(String args[]) throws IOException {

	/*
        //CSV file directory
        for (File elt : fileDir.listFiles()) {

            String fileName = elt.getName();

            if (elt.isFile() && fileName.endsWith(".pdf")) {

                //Store csv files' name and path in csvFilePaths map
                //pdfFilePaths.put(elt.getName(), elt.getAbsolutePath());
                //nbpdfFile++;

                pdfPath.add(elt.getAbsolutePath());

            }

            if (elt.isFile() && fileName.endsWith(".png")){

                //Store snaphot name and path in snapsPaths map
                //snapshotPaths.put(elt.getName(), elt.getAbsolutePath());
                snapshotPath.add(elt.getAbsolutePath());

            }

        }
        */


	for (File element : fileDir.listFiles()){

            String fileName = element.getName();

            if (element.isFile() && fileName.endsWith(".csv")){

                //Store csv files' name and path in csvFilePaths map
                csvFilePath.add(element.getAbsolutePath());

                //nbCSVFile ++;

            }

            if (element.isFile() && fileName.endsWith(".txt")){

                textFilePath.add(element.getAbsolutePath());

                //nbTextFile ++;

            }

	    /*
            else{

                System.out.println("Not .csv and .txt file !");

            }
	    */

        }

        //snapshot directory
        for (File element : snapshotDir.listFiles()){

            String snapshotName = element.getName();

            if (element.isFile() && snapshotName.endsWith(".png")){

                //Store snaphot name and path in snapsPaths map
                snapshotPath.add(element.getAbsolutePath());

                //nbSnapshot ++;

            }

	    /*
            else{

                System.out.println("Not image !");

            }
	    */

        }

        System.out.println("\nThe path to csv files are : \n");
        for (String element : csvFilePath) {
            System.out.println(element);
        }

        System.out.println("\nThe number of csv files is : " + csvFilePath.size());


	System.out.println("\nThe path to snapshot are : \n");
        for (String element : snapshotPath) {
            System.out.println(element);
        }

        System.out.println("\nThe number of snapshot is : " + snapshotPath.size());

	System.out.println("\nThe path to text files are : \n");
        for (String element : textFilePath) {
            System.out.println(element);
        }

        System.out.println("\nThe number of text files is : " + textFilePath.size());

    }

}
