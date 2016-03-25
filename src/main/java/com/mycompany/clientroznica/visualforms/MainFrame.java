/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.visualforms;

import com.mycompany.clientroznica.datamodels.TableRecord;
import com.mycompany.clientroznica.datamodels.EditListModel;
import com.mycompany.clientroznica.datamodels.TableData;
import com.mycompany.clientroznica.entity.Bar_code;
import com.mycompany.clientroznica.entity.GlassForShop;
import com.mycompany.clientroznica.entity.GroupId;
import com.mycompany.clientroznica.entity.Kart;
import com.mycompany.clientroznica.entity.Price;
import com.mycompany.clientroznica.entity.Sklad;
import com.mycompany.clientroznica.entity.Tovar;
import com.mycompany.clientroznica.entity.Type_price;
import com.mycompany.clientroznica.entity.Val;
import com.mycompany.clientroznica.repositories.Bar_codeRepository;
import com.mycompany.clientroznica.repositories.GlassForShopRepository;
import com.mycompany.clientroznica.repositories.GroupRepository;
import com.mycompany.clientroznica.repositories.KartRepository;
import com.mycompany.clientroznica.repositories.PriceRepository;
import com.mycompany.clientroznica.repositories.SkladRepository;
import com.mycompany.clientroznica.repositories.TovarRepository;
import com.mycompany.clientroznica.repositories.Type_priceRepository;
import com.mycompany.clientroznica.repositories.ValRepository;
import java.awt.Dialog;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.AbstractList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.table.TableCellEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Date;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Евгений
 */

@Component

public class MainFrame extends javax.swing.JFrame {

    @Autowired
    private ValRepository valRepository;
    @Autowired
    private Type_priceRepository type_priceRepository;
    @Autowired
    private TovarRepository tovarRepository;
    @Autowired
    private KartRepository kartRepository;
    @Autowired
    private Bar_codeRepository bar_codeRepository;
    @Autowired
    private SkladRepository skladRepository;
    @Autowired
    private GlassForShopRepository glassForShopRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private PriceRepository priceRepository;
    
    @Autowired
    private SelectFromEditList selectFromEditList;
    


    @Autowired
    private EditListModel editListModelForTemplate;

    @Autowired
    private TableData tableData;
    
    private List<GlassForShop> itemsForSearch;
    private JList templateListForChoise=new JList();
    private JScrollPane templateScrollPane=new JScrollPane(templateListForChoise);
    private boolean bijuterija=false;

    public boolean isBijuterija() {
        return bijuterija;
    }

    public void setBijuterija(boolean bijuterija) {
        this.bijuterija = bijuterija;
    }
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        add(templateScrollPane,0);
        templateListForChoise.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    GlassForShop item=new GlassForShop();
                    item=(GlassForShop)editListModelForTemplate.getElementAtAsObject(templateListForChoise.getSelectedIndex());
                    findText.setText(item.toString());
                    templateScrollPane.setVisible(false);
                    templateListForChoise.setVisible(false);
                    findText.selectAll();
                    
                    int row=((TableData)dataTable.getModel()).add(new TableRecord(item.getName(),item.getBarcode(), 1, item.getPrice(),getIdGroup(item.getName()).getName().substring(0, 2)));
                    dataTable.repaint();
                    dataTable.editCellAt(row, 3);
                    ((JTextField)dataTable.getEditorComponent()).selectAll();
                    dataTable.requestFocus();
                }
            }
        });
        templateListForChoise.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e){
                if(!e.getOppositeComponent().equals(findText)){
                    templateScrollPane.setVisible(false);
                    templateListForChoise.setVisible(false);
                }
            }
        });
        findText.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e){
                if (e.getOppositeComponent()==null)
                    return;
                if(!e.getOppositeComponent().equals(templateListForChoise)){
                    templateScrollPane.setVisible(false);
                    templateListForChoise.setVisible(false);
                }
            }
        });
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        findLabel = new javax.swing.JLabel();
        findText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        saveXLSButton = new javax.swing.JButton();
        clearTableButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        findLabel.setText("Найти:");

        findText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTextActionPerformed(evt);
            }
        });
        findText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                findTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                findTextKeyTyped(evt);
            }
        });

        dataTable.setNextFocusableComponent(findText);
        dataTable.setVerifyInputWhenFocusTarget(false);
        dataTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dataTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataTableKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dataTableKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);

        saveXLSButton.setText("Записать XLS");
        saveXLSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveXLSButtonActionPerformed(evt);
            }
        });

        clearTableButton.setText("Очистить");
        clearTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(findLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(findText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveXLSButton, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(clearTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findLabel)
                    .addComponent(findText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveXLSButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearTableButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        dataTable.setModel(tableData);
        dataTable.getColumnModel().getColumn(0).setMinWidth(0);
        dataTable.getColumnModel().getColumn(0).setPreferredWidth(4);
        dataTable.getColumnModel().getColumn(1).setPreferredWidth(282);
        dataTable.getColumnModel().getColumn(3).setPreferredWidth(4);
        dataTable.getColumnModel().getColumn(4).setPreferredWidth(10);
        findText.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void findTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findTextKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DOWN&&templateListForChoise.isVisible()){
            templateListForChoise.grabFocus();
            templateListForChoise.setSelectedIndex(0);
        }
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            if (findText.getText()!=""){
                GlassForShop item=new GlassForShop();
                templateListForChoise.setVisible(false);
                templateScrollPane.setVisible(false);
                ArrayList <GlassForShop> glassForShops=(ArrayList)glassForShopRepository.findByNameLikeOrderByNameAsc("%"+findText.getText()+"%");
                if (glassForShops.size()==1){
                    //введен конечный продукт
                    item=glassForShops.get(0);
                }
                if (glassForShops.size()==0){
                    if (JOptionPane.showConfirmDialog(this,"Ввести новую позицию?", "Новое", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                        addNewPosition(findText.getText());
                    }else{
                        findText.setText("");
                        findText.requestFocus();
                    }
                    return;
                }
                if (glassForShops.size()>1){
                    ((EditListModel)selectFromEditList.editList.getModel()).setList(glassForShops);
//                    editListModel.setList(glassForShops);
//                    selectFromEditList.editList.setModel(editListModel);
//                    selectFromEditList.editList.repaint();
                    selectFromEditList.setModal(true);
                    selectFromEditList.setVisible(true);
                    if (selectFromEditList.getSelectedItem()==-1){
                        return;
                    }
                    item=glassForShops.get(selectFromEditList.getSelectedItem());
                }
                int row=((TableData)dataTable.getModel()).add(new TableRecord(item.getName(),item.getBarcode(), 1, item.getPrice(),getIdGroup(item.getName()).getName().substring(0, 2)));
                dataTable.repaint();
                dataTable.editCellAt(row, 3);
                ((JTextField)dataTable.getEditorComponent()).selectAll();
                dataTable.grabFocus();
            }            
        }
    }//GEN-LAST:event_findTextKeyPressed

    private void findTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTextActionPerformed

    }//GEN-LAST:event_findTextActionPerformed

    private void findTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_findTextKeyTyped
        
        String findString=findText.getText()+evt.getKeyChar();
        if((findString.length()==2)||(findString.length()>2&&!templateListForChoise.isVisible())){
            itemsForSearch= glassForShopRepository.findByNameLikeOrderByNameAsc(findString+"%");
        }
        if(findString.length()>1){

//            ((EditListModel)(templateListForChoise.getModel())).setList((ArrayList)getNameByPrefix(findString));
            ArrayList namesList=(ArrayList)getNameByPrefix(findString);
            if (namesList.size()==0){
                templateScrollPane.setVisible(false);
                templateListForChoise.setVisible(false);
                return;
            }
            editListModelForTemplate.setList(namesList);
            
            templateListForChoise.setModel(editListModelForTemplate);
            
            templateScrollPane.setBounds(findText.getBounds().x, findText.getBounds().y+findText.getBounds().height,maxLength(itemsForSearch)*10,100);
//            templateListForChoise.setBounds(findText.getBounds().x, findText.getBounds().y+findText.getBounds().height,maxLength(itemsForSearch)*5,100);
//            templateListForChoise.setVisibleRowCount(10);
            templateScrollPane.setVisible(true);
            templateListForChoise.setVisible(true);
            
//            templateListForChoise.grabFocus();
            repaint();
        }
    }//GEN-LAST:event_findTextKeyTyped

    private void saveXLSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveXLSButtonActionPerformed
        try {
            saveXLSXFile(sortList(new ArrayList(((TableData)dataTable.getModel()).getAllrecords())));
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveXLSButtonActionPerformed

    private void dataTableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataTableKeyTyped
 
    }//GEN-LAST:event_dataTableKeyTyped

    private void dataTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataTableKeyReleased
                    // TODO add your handling code here:
    }//GEN-LAST:event_dataTableKeyReleased

    private List<TableRecord> sortList(List<TableRecord> sortingList){
        List<TableRecord> sortedList=new ArrayList<TableRecord>();
        while(sortingList.size()>0){
            TableRecord tempalateItem=sortingList.get(0);
            sortingList.remove(0);
            int i=0;
            while (sortedList.size()>i&&sortedList.get(i).compareTo(tempalateItem)<=0){
                i++;
            }
            sortedList.add(i, tempalateItem);
        }
        dataTable.repaint();
        return sortedList;
    }
            
    private void dataTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataTableKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           evt.setKeyCode(evt.VK_UNDEFINED); 
           TableCellEditor edit=dataTable.getCellEditor();
                if (edit!=null){
                    edit.stopCellEditing();
                }
            findText.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTableKeyPressed

    private void clearTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTableButtonActionPerformed
        ((TableData)dataTable.getModel()).removeAll();
    }//GEN-LAST:event_clearTableButtonActionPerformed

    private List<GlassForShop> getNameByPrefix(String prefix) {
        List<GlassForShop> result=new ArrayList<GlassForShop>();
        for(GlassForShop item:itemsForSearch){
            if(item.getName().startsWith(prefix))
                result.add(item);
        }
        return result;
    }
    
    private int maxLength(List<GlassForShop> items){
        int result=0;
        for(GlassForShop item:items){
            if(item.getName().length()>result)
                result=item.getName().length();
        }
        return result;
    }
    
    private String generateNewBarcode(String name, Integer group){
        int num=getMainPartOfMaxPresentBarCodeForGroup(group);
        String code=String.format("%s%05d", group,num+1);
        code=code+getCheckSumForBarcode(String.format("%07d%05d", group,num+1));
        return code;
        }
    
    private GroupId getIdGroup(String name){
        String suffix=name.substring(name.indexOf(" ")+1);
        GroupId group;
        GroupId id=groupRepository.getByNameSuffixAndParentgroup("%"+suffix, 1310000);
        group=id;
        if (group!=null){
            setBijuterija(true);
        }else{
            group=new GroupId(2203000,"99 Other");
        
            setBijuterija(false);
            if (name.indexOf("Очки с/з")>-1)
                group=new GroupId(60000,"32 Очки");
            if (name.indexOf("Шляпа")>-1)
                group=new GroupId(1392306,"34 Шляпа");
            if (name.indexOf("Скидка")>-1)
                group=new GroupId(2203000,"33 Скидка");
            if (name.indexOf("Скидка Зима")>-1)
                group=new GroupId(2203000,"35 Скидка");


        }
        return group;
    }
    
    private int getMainPartOfMaxPresentBarCodeForGroup(Integer group){
        int num=1;
//        try {
        List <GlassForShop> barcodes=glassForShopRepository.findByBarcodeLikeOrderByBarcodeDesc(group+"%");
        if (barcodes.size()>0)
            num=new Integer(barcodes.get(0).getBarcode().substring(group.toString().length(),group.toString().length()+5));
/*        }catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
*/
        return num;    
        
    }
    
    private String getCheckSumForBarcode(String barcode){
        Integer sum=new Integer(0);
        for (int i=2;i<13;i=i+2)
            sum=sum+(Integer.valueOf(barcode.substring(i-1, i)));
        sum=sum*3;
        for (int i=1;i<12;i=i+2)
            sum=sum+(Integer.valueOf(barcode.substring(i-1, i)));
        sum=10-((Double)((((sum.doubleValue()/10)-sum/10)*10)+0.1)).intValue();
        return sum.toString().substring(sum.toString().length()-1);

    }
    
    private Integer getCostFromName(String name){
        return new Integer(name.substring(0, name.indexOf(" ")));
    }
    
    private String generateArticle(int cost,GroupId group){
        return "0"+group.getName().substring(0, group.getName().indexOf(" ")).trim()+cost;
    }
    
    private Sklad getSklad(String name){
        if (isBijuterija())
            return skladRepository.findOne(8);
        if (name.indexOf("Очки с/з")>-1)
            return skladRepository.findOne(2);
        if (name.indexOf("Шляпа")>-1)
            return skladRepository.findOne(3);
        return skladRepository.findOne(99);
    }
    
    @Transactional
    private void addNewPosition(String name){
        GroupId group=getIdGroup(name);
        String barcode=generateNewBarcode(name, group.getGroup());
        Sklad sklad =getSklad(name);
        Double cost=getCostFromName(name).doubleValue();
        GlassForShop itemGlassForShop=new GlassForShop(name, barcode, cost, sklad);
        glassForShopRepository.save(itemGlassForShop);
        int row=((TableData)dataTable.getModel()).add(new TableRecord(itemGlassForShop.getName(),itemGlassForShop.getBarcode(), 1, itemGlassForShop.getPrice(),group.getName().substring(0, 2)));
        dataTable.repaint();
        dataTable.editCellAt(row, 3);
        ((JTextField)dataTable.getEditorComponent()).selectAll();
        if (sklad.getId_skl()==8){
            Tovar tovar =new Tovar(tovarRepository.getNextId(),name, 1);
            tovarRepository.save(tovar);
            tovar=tovarRepository.getByNameTrim(tovar.getName());
            Val val=valRepository.findOne(4);
            Date date=new Date(new GregorianCalendar().getTimeInMillis());
            Kart kart = new Kart(kartRepository.getNextId(),tovar, sklad, group, cost, date, val);
            kartRepository.save(kart);
            bar_codeRepository.save(new Bar_code(barcode, tovar, sklad, 1, 1));
            bar_codeRepository.save(new Bar_code(generateArticle(cost.intValue(), group), tovar, sklad, 1, 0));
            Price price = new Price(tovar, sklad, type_priceRepository.findOne(5), cost, 0, 0);
            priceRepository.save(price);
        }
        
        
        dataTable.grabFocus();

    }

    private void saveXLSXFile(List<TableRecord> items) throws IOException {
        
        File excel=new File("Export.xlsx");
        FileOutputStream fos = new FileOutputStream(excel);
        Workbook myWorkBook = new XSSFWorkbook ();
        Sheet mySheet = myWorkBook.createSheet();
        Map<String, Object[]> data = new HashMap<String, Object[]>();
        Integer i=2;
//        Set<String> newRows=new AbstractSet<>
/*        for (TableRecord item:items){
            data.put(i.toString(), new Object[]{item.getBar_code(),item.getName(),item.getCount(),item.getCost()," ",item.getInnerGroup(),item.getCostAsString()});
            i++;
        }
         Set<String> newRows = data.keySet();
         int rownum=2;
         for (String key : newRows) {
             
                // Creating a new Row in existing XLSX sheet
                Row row = mySheet.createRow(rownum++);
                Object [] objArr = data.get(key);
                int cellnum = 0;
                for (Object obj : objArr) {
                    Cell cell = row.createCell(cellnum++);
                    if (obj instanceof String) {
                        cell.setCellValue((String) obj);
                    } else if (obj instanceof Boolean) {
                        cell.setCellValue((Boolean) obj);
                    } else if (obj instanceof Date) {
                        cell.setCellValue((Date) obj);
                    } else if (obj instanceof Double) {
                        cell.setCellValue((Double) obj);
                    } else if (obj instanceof Integer) {
                        cell.setCellValue((Integer) obj);
                    }
                }
         }
*/
        int rownum=2;
        for (TableRecord item:items){
            Row row = mySheet.createRow(rownum++);
            Cell cell = row.createCell(0);
            cell.setCellValue(item.getBar_code());
            cell = row.createCell(1);
            cell.setCellValue(item.getName());
            cell = row.createCell(2);
            cell.setCellValue(item.getCount());
            cell = row.createCell(3);
            cell.setCellValue(item.getCost());
            cell = row.createCell(5);
            cell.setCellValue(item.getInnerGroup());
            cell = row.createCell(6);
            cell.setCellValue(item.getCostAsString());
        }
        myWorkBook.write(fos);
         fos.close();
   }

    private List<TableRecord> removeNull(List<TableRecord> items){
        int i=0;
        while (items.size()>i){
            if (items.get(i).getCount()<1){
                items.remove(i);
            }else{
                i++;
            }
        }
        return items;
    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearTableButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel findLabel;
    private javax.swing.JTextField findText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveXLSButton;
    // End of variables declaration//GEN-END:variables
}
