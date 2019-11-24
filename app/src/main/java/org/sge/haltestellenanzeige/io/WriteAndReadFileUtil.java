package org.sge.haltestellenanzeige.io;

import android.content.Context;
import android.net.Uri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class WriteAndReadFileUtil {
    @SuppressWarnings("HardCodedStringLiteral")
    public static int writeStringToFile(String settingsFileName, String inhalt, Context context) {
        System.out.println("WriteAndReadFileUtil.writeStringToFile: " + settingsFileName); //NON-NLS

        String filePath = "";
        if (context != null)
            filePath = context.getFilesDir().getPath().toString() + settingsFileName;
        else filePath = settingsFileName;

        File file = null;
        try {
            file = new File(filePath);
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(inhalt);
            bw.close();
            System.out.println("File written to: " + file.getAbsoluteFile()); //NON-NLS
        } catch (IOException e) {
            if(file != null) System.out.println("Error: File could not be written to: " + file.getAbsoluteFile()); //NON-NLS
            return -1;
        }
        // System.out.println("Save content: " + inhalt);

        return 0;
    }


    @SuppressWarnings("HardCodedStringLiteral")
    public static String readStringFromFile(String settingsFileName, Context context) {
        System.out.println("WriteAndReadFileUtil.readStringFromFile: " + settingsFileName); //NON-NLS
        String text = null;

        String filePath = "";
        if (context != null)
            filePath = context.getFilesDir().getPath().toString() + settingsFileName;
        else filePath = settingsFileName;

        try {
            Scanner read = new Scanner(new File(filePath));
            text = read.nextLine();
            read.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found: " + settingsFileName); //NON-NLS
            e.printStackTrace();
            return null;
        } catch (NoSuchElementException e) {
            System.out.println("file not found: " + settingsFileName); //NON-NLS
            e.printStackTrace();
            return null;
        }

        System.out.println("File Content read: " + text); //NON-NLS
        return text;
    }


    public static void deleteFile(String settingsFileName, Context context) {
        String text = null;

        String filePath = "";
        if (context != null) filePath = context.getFilesDir().getPath().toString() + settingsFileName;
        else filePath = settingsFileName;

        new File(context.getFilesDir(), filePath).delete();
    }
}