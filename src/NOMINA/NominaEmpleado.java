/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NOMINA;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayela
 */
public class NominaEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form NominaEmpleado
     */
    
//   JFrame..setLocationRelativeTo(null) ;
//    JFrame f = new JFrame();
//    f.setLocationRelativeTo(null);
//    f.setVisible(true);
    
    Archivonominaempleado d2=new Archivonominaempleado("Registro");
    atri atr=new atri();
    Validar v=new Validar();
    DefaultTableModel em;
    
    public NominaEmpleado(java.awt.Frame parent, boolean modal) {
      // super(parent, modal);
    }
    
    public NominaEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtidpersona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        INSS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcomboCargo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jtxtsalario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtantiguedad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxthextras = new javax.swing.JTextField();
        jbtnNomina = new javax.swing.JButton();
        jbtnmostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        txtinss = new javax.swing.JTextField();
        txtsalario = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        txtantiguedad = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jbtnguardar = new javax.swing.JButton();
        jbtnsalir = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtxtINSS = new javax.swing.JTextField();
        jtxtir = new javax.swing.JTextField();
        jtxtdeducciones = new javax.swing.JTextField();
        jtxtTOTALPAGO = new javax.swing.JTextField();
        jScrollpane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del trabajador"));
        jPanel1.setLayout(new java.awt.GridLayout(9, 2));

        jLabel1.setText("Id");
        jPanel1.add(jLabel1);

        jtxtidpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtidpersonaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtidpersona);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre);

        jLabel3.setText("inss");
        jPanel1.add(jLabel3);

        INSS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                INSSKeyTyped(evt);
            }
        });
        jPanel1.add(INSS);

        jLabel4.setText("Cedula");
        jPanel1.add(jLabel4);
        jPanel1.add(txtcedula);

        jLabel5.setText("Cargo");
        jPanel1.add(jLabel5);

        jcomboCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contador", "secretaria", "vigilante", "Afanadora", "jefe de depto" }));
        jPanel1.add(jcomboCargo);

        jLabel6.setText("Salario");
        jPanel1.add(jLabel6);

        jtxtsalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtsalarioKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtsalario);

        jLabel7.setText("Antiguedad");
        jPanel1.add(jLabel7);

        jtxtantiguedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtantiguedadKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtantiguedad);

        jLabel8.setText("H extras");
        jPanel1.add(jLabel8);

        jtxthextras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxthextrasKeyTyped(evt);
            }
        });
        jPanel1.add(jtxthextras);

        jbtnNomina.setText("Nomina");
        jbtnNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNominaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNomina);

        jbtnmostrar.setText("Mostrar");
        jbtnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnmostrar);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago de Nomina"));

        jLabel9.setText("Nombre");

        jLabel10.setText("Cargo");

        jLabel11.setText("inss");

        jLabel12.setText("Salario");

        jLabel13.setText("H extras");

        jLabel14.setText("Antiguedad");

        jLabel15.setText("TOTAL");

        jButton3.setText("Nuevo");

        jbtnguardar.setText("Guardar");
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });

        jbtnsalir.setText("Salir");
        jbtnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsalirActionPerformed(evt);
            }
        });

        jLabel16.setText("Deducciones del empleado");

        jLabel17.setText("6.25");

        jLabel18.setText("ir");

        jLabel20.setText("Total deducciones");

        jLabel21.setText("Total a pagar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(jbtnguardar)
                        .addGap(34, 34, 34)
                        .addComponent(jbtnsalir)
                        .addGap(98, 98, 98))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtantiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtinss, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtir)
                                    .addComponent(jtxtINSS)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtTOTALPAGO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(jtxtdeducciones))))
                        .addGap(60, 60, 60))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel17)))
                    .addComponent(jtxtINSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtinss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jtxtir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jtxtdeducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtantiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jtxtTOTALPAGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jbtnguardar)
                    .addComponent(jbtnsalir))
                .addGap(41, 41, 41))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Inss", "Cargo", "Salario", "Hextras", "Ingreso He", "Antiguedad", "Total ingrso", "Inss", "ir", "Total deducciones", "Salario neto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollpane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollpane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmostrarActionPerformed
        // TODO add your handling code here:
        
        double anti=Double.parseDouble(jtxtantiguedad.getText());
        double extra=Double.parseDouble(jtxthextras.getText());
        double sal=Double.parseDouble(jtxtsalario.getText());
        String name=txtnombre.getText();
        int inss=Integer.parseInt(INSS.getText());
        String op="";
        if(jcomboCargo.getSelectedIndex()==0){
           op="Contador";
        }
        if(jcomboCargo.getSelectedIndex()==1){
           op="Secretaria";
        }
        if(jcomboCargo.getSelectedIndex()==2){
           op="Vigilante";
        }
        if(jcomboCargo.getSelectedIndex()==3){
           op="afanadora";
        }
        if(jcomboCargo.getSelectedIndex()==4){
           op="jefe de depto";
        }
        
        double total=0.0;
        double deduc=0.0;
        double sum=anti+extra+sal;
        double in=sum*0.0625;
        double anual=sal*12;
        jtxtNombre.setText(name);
        txtinss.setText(inss+"");
        txtcargo.setText(op);
         jtxtTotal.setText(sum+"");
         jtxtINSS.setText(in+"");
         txtsalario.setText(sal+"");
         txtantiguedad.setText(anti+"");
         txthora.setText(extra+"");
         
         if(anual <75000){
            double ir=(anual*0) ;
              deduc=ir+in;
            total=sum-deduc;
            jtxtir.setText(ir+"");
            jtxtdeducciones.setText(deduc+"");
            jtxtTOTALPAGO.setText(total+"");
         }
         else if(anual<=100000){
             double ir2=(((anual-75000)*0.1)+0)/12;
             jtxtir.setText(ir2+"");
             deduc=ir2+in;
            total=sum-deduc;
             jtxtdeducciones.setText(deduc+"");
            jtxtTOTALPAGO.setText(total+"");
             
         }
         else if(anual<=200000){
            double ir2=(((anual-100000)*0.15)+2500)/12;
            deduc=ir2+in;
           total=sum-deduc;
             jtxtdeducciones.setText(deduc+"");
            jtxtTOTALPAGO.setText(total+"");
             
             jtxtir.setText(ir2+""); 
         }
         else if(anual<=300000){
             double ir2=(((anual-200000)*0.20)+7500)/12;
              deduc=ir2+in;
             total=sum-deduc;
             jtxtdeducciones.setText(deduc+"");
            jtxtTOTALPAGO.setText(total+"");
             jtxtir.setText(ir2+"");
         }
         else if(anual<=500000){
             double ir2=(((anual-300000)*0.25)+37500)/12;
             deduc=ir2+in;
             total=sum-deduc;
             jtxtdeducciones.setText(deduc+"");
            jtxtTOTALPAGO.setText(total+"");
             
             jtxtir.setText(ir2+"");
         }
         else if(anual >500000.001){
             double ir2=(((anual-500000)*0.30)+87500)/12;
             deduc=ir2+in;
             total=sum-deduc;
             jtxtdeducciones.setText(deduc+"");
            jtxtTOTALPAGO.setText(total+"");
             jtxtir.setText(ir2+"");
         }
        
        
    }//GEN-LAST:event_jbtnmostrarActionPerformed

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
        // TODO add your handling code here:
        
        String op="";
        int id=Integer.parseInt(jtxtidpersona.getText());
        String name=txtnombre.getText();
        int inss=Integer.parseInt(INSS.getText());
        double sal=Double.parseDouble(jtxtsalario.getText());
        double anti=Double.parseDouble(jtxtantiguedad.getText());
        double extra=Double.parseDouble(jtxthextras.getText());
        double tot=Double.parseDouble(jtxtTotal.getText());
        double ins=Double.parseDouble(jtxtINSS.getText());
        double i=Double.parseDouble(jtxtir.getText());
        double dedu=Double.parseDouble(jtxtdeducciones.getText());
        double T=Double.parseDouble(jtxtTOTALPAGO.getText());
        
        if(jcomboCargo.getSelectedIndex()==0){
           op="Contador";
        }
        if(jcomboCargo.getSelectedIndex()==1){
           op="Secretaria";
        }
        if(jcomboCargo.getSelectedIndex()==2){
           op="Vigilante";
        }
        if(jcomboCargo.getSelectedIndex()==3){
           op="afanadora";
        }
        if(jcomboCargo.getSelectedIndex()==4){
           op="jefe de depto";
        }
        
     atr.setId(id);
     atr.setNombre(name);
     atr.setOficio(op);
     atr.setINSS(inss);    
     atr.setSalario(sal);
     atr.setExtra(extra);
     atr.setAntiguedad(anti);
     atr.setTotal(tot);
     atr.setInss(ins);
     atr.setIr(i);
     atr.setDeduccion(dedu);
     atr.setTOTALPAGO(T);
     
      try {
            d2.create(atr);
        } catch (IOException ex) {
            Logger.getLogger(NominaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void jbtnNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNominaActionPerformed
        // TODO add your handling code here:
        String op="";
        int id=Integer.parseInt(jtxtidpersona.getText());
        int inss=Integer.parseInt(INSS.getText());
        double anti=Double.parseDouble(jtxtantiguedad.getText());
        double extra=Double.parseDouble(jtxthextras.getText());
        double sal=Double.parseDouble(jtxtsalario.getText());
        String name=txtnombre.getText();
        String cedu=txtcedula.getText();
        
        if(jcomboCargo.getSelectedIndex()==0){
           op="Contador";
        }
        if(jcomboCargo.getSelectedIndex()==1){
           op="Secretaria";
        }
        if(jcomboCargo.getSelectedIndex()==2){
           op="Vigilante";
        }
        if(jcomboCargo.getSelectedIndex()==3){
           op="afanadora";
        }
        if(jcomboCargo.getSelectedIndex()==4){
           op="jefe de depto";
        }
        
        double sum=0;
         double ir2=0.0;
             DefaultTableModel emp= (DefaultTableModel) tabla.getModel();
               emp.addRow(new Object[]{id,inss,name,op,sal,extra,extra,anti});
        
               for(int i=0;i<tabla.getRowCount();i++)
        {
           sum=Double.parseDouble(tabla.getValueAt(i, 4).toString())+Double.parseDouble(tabla.getValueAt(i, 6).toString())+Double.parseDouble(tabla.getValueAt(i, 7).toString());
          
           tabla.setValueAt(sum, i, 8);
           tabla.setValueAt(sum*0.0625,i ,9);
          double inss2=sum*0.0625;
        
     double ir=Double.parseDouble(tabla.getValueAt(i, 4).toString())*12; 
     if(ir<75000){
       
        tabla.setValueAt(ir2*0, i, 10);
        tabla.setValueAt(ir2*0+inss2, i, 11);
        tabla.setValueAt((sum)-(ir2*0+inss2), i, 12);
     }
     
     else if(ir<=100000){
          
         tabla.setValueAt((((ir-75000)*0.1)+0)/12, i, 10);
         tabla.setValueAt((((ir-75000)*0.1)+0)/12+inss2, i, 11);
         tabla.setValueAt((sum)-((((ir-75000)*0.1)+0)/12+inss2), i, 12);
     }
     else if(ir<=200000)
     {
         tabla.setValueAt((((ir-100000)*0.15)+2500)/12, i, 10);
     tabla.setValueAt((((ir-100000)*0.15)+2500)/12+inss2, i, 11);
     tabla.setValueAt((sum)-((((ir-100000)*0.15)+2500)/12+inss2), i, 12);
     
     }
     else if(ir<=300000){
       tabla.setValueAt((((ir-200000)*0.20)+7500)/12, i, 10);
       tabla.setValueAt(((((ir-200000)*0.20)+7500)/12)+inss2, i, 11);
     tabla.setValueAt((sum)-(((((ir-200000)*0.20)+7500)/12)+inss2), i, 12);
     
     }
     else if(ir<=500000){
         tabla.setValueAt((((ir-300000)*0.25)+37500)/12, i, 10);
     tabla.setValueAt((((ir-300000)*0.25)+37500)/12+inss2, i, 11);
     tabla.setValueAt((sum)-((((ir-300000)*0.25)+37500)/12+inss2), i, 12);
     }
     else if(ir>500000.001){
         tabla.setValueAt((((ir-500000)*0.30)+87500)/12, i, 10);
    tabla.setValueAt((((ir-500000)*0.30)+87500)/12+inss2, i, 11);
    tabla.setValueAt((sum)-((((ir-500000)*0.30)+87500)/12+inss2), i, 12);
     
     
     }
    
        }
    }//GEN-LAST:event_jbtnNominaActionPerformed

    private void jbtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_jbtnsalirActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        v.sololetra(evt, c);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void INSSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_INSSKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String t=INSS.getText().toString();
        v.solonumero(evt, c,t );
    }//GEN-LAST:event_INSSKeyTyped

    private void jtxtsalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsalarioKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String t=jtxtsalario.getText().toString();
        v.solonumero(evt, c,t );
    }//GEN-LAST:event_jtxtsalarioKeyTyped

    private void jtxtantiguedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtantiguedadKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String t=jtxtantiguedad.getText().toString();
        v.solonumero(evt, c,t );
    }//GEN-LAST:event_jtxtantiguedadKeyTyped

    private void jtxthextrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxthextrasKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String t=jtxthextras.getText().toString();
        v.solonumero(evt, c,t );
    }//GEN-LAST:event_jtxthextrasKeyTyped

    private void jtxtidpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtidpersonaActionPerformed
        // TODO add your handling code here:
//        jtxtidpersona.setEditable(false); 
//        jtxtidpersona.setEnabled(false); 

    }//GEN-LAST:event_jtxtidpersonaActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NominaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NominaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NominaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NominaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NominaEmpleado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField INSS;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollpane1;
    private javax.swing.JButton jbtnNomina;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JButton jbtnmostrar;
    private javax.swing.JButton jbtnsalir;
    private javax.swing.JComboBox jcomboCargo;
    private javax.swing.JTextField jtxtINSS;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTOTALPAGO;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTextField jtxtantiguedad;
    private javax.swing.JTextField jtxtdeducciones;
    private javax.swing.JTextField jtxthextras;
    private javax.swing.JTextField jtxtidpersona;
    private javax.swing.JTextField jtxtir;
    private javax.swing.JTextField jtxtsalario;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtantiguedad;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtinss;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsalario;
    // End of variables declaration//GEN-END:variables

    

        
       
         
     public void limpiar(){
      try {
            jtxtidpersona.setText(""+(d2.getId()+1));
        } catch (IOException ex) {
            Logger.getLogger(NominaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     txtnombre.setText("");
     txtcedula.setText("");
     jtxtsalario.setText("");
     INSS.setText("");
     jtxtantiguedad.setText("");
     jtxthextras.setText("");
   jcomboCargo.setSelectedIndex(0);
     txtnombre.setText("");
     txtinss.setText("");
     txtsalario.setText("");
     txtcargo.setText("");
     txthora.setText("");
     txtantiguedad.setText("");
     jtxtTotal.setText("");
     jtxtINSS.setText("");
     jtxtir.setText("");
     jtxtdeducciones.setText("");
     jtxtTOTALPAGO.setText("");
             }
       
}
