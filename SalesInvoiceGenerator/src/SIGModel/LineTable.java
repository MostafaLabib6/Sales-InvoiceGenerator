/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class LineTable extends AbstractTableModel {

    private String[] coluNames = {"Invoice Num", "Item Name", "Item Price", "Item Count", "Item Total"};
    ArrayList<InvoiceLine> items = new ArrayList<>();

    public ArrayList<InvoiceLine> getItems() {
        return items;
    }

    public void setItems(ArrayList<InvoiceLine> items) {
        this.items = items;
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine line = items.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return line.getInvoiceNumber();
            case 1:
                return line.getCustomerName();
            case 2:
                return line.getItemprice();
            case 3:
                return line.getItemCount();
            case 4:
                return line.getLineTotal();

        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        return coluNames[column];
    }

}
