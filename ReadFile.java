package com.stackroute;

import java.io.*;
 class ReadFile {
    public static void main(String[] args) throws IOException {
        File folder = new File("/home/cgi/Desktop/Java/PE3");
        FilenameFilter fileNameFilter = new FilenameFilter(){
            @Override
            public boolean accept(File dir,String name){
                if (name.endsWith(".txt")){
                    return  true;
                }else
                    return false;
            }
        };
        File[] files = folder.listFiles(fileNameFilter);
        for(File file:files){
            System.out.println(file);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            System.out.println();
        }
    }
}