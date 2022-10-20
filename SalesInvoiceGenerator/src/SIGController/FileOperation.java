/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGController;

import SIGModel.InvoiceHeader;
import SIGView.MainFrame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class FileOperation {

    private ArrayList<InvoiceHeader> headers;

    protected ArrayList<String> readFile(File f) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }

    
}
