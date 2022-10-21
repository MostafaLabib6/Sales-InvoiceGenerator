/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGModel;

import SIGModel.InvoiceHeader;
import SIGView.MainFrame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public class FileOperation {
    private final MainFrame mainFrame;

    public FileOperation(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    private ArrayList<InvoiceHeader> headers;

    public ArrayList<String> readFile(File f) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        FileReader fileReader = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }
    
    public void writeFile(ArrayList<String>list){
    
    
    
    }

    public void testMain(){
       ArrayList<InvoiceHeader> headers= mainFrame.getHeadersArray();
       for(InvoiceHeader h:headers){
           System.out.println(" ");
           System.out.println("Invoice "+h.getInvoiceNumber()+" NUM");
           System.out.println("{");
           System.out.println(h.getInvoiceDate()+" "+h.getCustomerName());
           for(InvoiceLine l:h.getLines()){
               System.out.println(l.getitemName()+" "+l.getItemprice()+" "+l.getItemCount());
           
           }
       System.out.println("}");
       
       }
    
    
    
    }
    
}
