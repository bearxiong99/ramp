/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileSharingClientJFrame.java
 *
 * Created on 7-nov-2009, 11.30.30
 */

package it.unibo.deis.lia.ramp.service.application;

import it.unibo.deis.lia.ramp.service.management.*;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author useruser
 */
public class BroadcastClientJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Vector<ServiceResponse> availableServices;

    private BroadcastClient bc;
    /** Creates new form FileSharingClientJFrame */
    public BroadcastClientJFrame(BroadcastClient bc) {
        initComponents();

        this.bc=bc;
        String[] empty=new String[0];
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(empty);
        jComboBoxRemoteServices.setModel(dcm);
        jComboBoxProgramList.setModel(dcm);
        jComboBoxActivePrograms.setModel(dcm);
        jTextFieldVlcDirectory.setText(bc.getVlcDirectory());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonFindRemoteServices = new javax.swing.JButton();
        jButtonRequireProgramList = new javax.swing.JButton();
        jButtonRequireSelectedProgram = new javax.swing.JButton();
        jScrollPaneRemoteServices = new javax.swing.JScrollPane();
        jTextAreaRemoteServices = new javax.swing.JTextArea();
        jComboBoxRemoteServices = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaProgramList = new javax.swing.JTextArea();
        jComboBoxProgramList = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTTL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTimeout = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldServiceAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldVlcDirectory = new javax.swing.JTextField();
        jButtonChangeVlcDirectory = new javax.swing.JButton();
        jScrollPaneRemoteServices1 = new javax.swing.JScrollPane();
        jTextAreaActivePrograms = new javax.swing.JTextArea();
        jButtonConfigProgram = new javax.swing.JButton();
        jButtonRefreshActivePrograms = new javax.swing.JButton();
        jComboBoxActivePrograms = new javax.swing.JComboBox();
        jButtonStopSelectedProgram = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BroadcastClient");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButtonFindRemoteServices.setText("find services");
        jButtonFindRemoteServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindRemoteServicesActionPerformed(evt);
            }
        });

        jButtonRequireProgramList.setText("require program list");
        jButtonRequireProgramList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRequireProgramListActionPerformed(evt);
            }
        });

        jButtonRequireSelectedProgram.setText("require selected program");
        jButtonRequireSelectedProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRequireSelectedProgramActionPerformed(evt);
            }
        });

        jTextAreaRemoteServices.setColumns(20);
        jTextAreaRemoteServices.setEditable(false);
        jTextAreaRemoteServices.setRows(5);
        jScrollPaneRemoteServices.setViewportView(jTextAreaRemoteServices);

        jComboBoxRemoteServices.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxRemoteServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRemoteServicesActionPerformed(evt);
            }
        });

        jTextAreaProgramList.setColumns(20);
        jTextAreaProgramList.setEditable(false);
        jTextAreaProgramList.setLineWrap(true);
        jTextAreaProgramList.setRows(5);
        jScrollPane1.setViewportView(jTextAreaProgramList);

        jComboBoxProgramList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("TTL");

        jTextFieldTTL.setText("3");

        jLabel2.setText("timeout");

        jTextFieldTimeout.setText("3000");

        jLabel3.setText("serviceAmount");

        jTextFieldServiceAmount.setText("1");
        jTextFieldServiceAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServiceAmountActionPerformed(evt);
            }
        });

        jLabel4.setText("vlc directory");

        jTextFieldVlcDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVlcDirectoryActionPerformed(evt);
            }
        });

        jButtonChangeVlcDirectory.setText("change vlc directory");
        jButtonChangeVlcDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeVlcDirectoryActionPerformed(evt);
            }
        });

        jTextAreaActivePrograms.setColumns(20);
        jTextAreaActivePrograms.setEditable(false);
        jTextAreaActivePrograms.setRows(5);
        jScrollPaneRemoteServices1.setViewportView(jTextAreaActivePrograms);

        jButtonConfigProgram.setText("get program config");
        jButtonConfigProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigProgramActionPerformed(evt);
            }
        });

        jButtonRefreshActivePrograms.setText("refresh active programs");
        jButtonRefreshActivePrograms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActiveProgramsActionPerformed(evt);
            }
        });

        jComboBoxActivePrograms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonStopSelectedProgram.setText("stop selected program");
        jButtonStopSelectedProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopSelectedProgramActionPerformed(evt);
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
                        .addComponent(jButtonChangeVlcDirectory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVlcDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonRequireSelectedProgram, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxProgramList, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRequireProgramList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxRemoteServices, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneRemoteServices, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPaneRemoteServices1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jComboBoxActivePrograms, javax.swing.GroupLayout.Alignment.LEADING, 0, 288, Short.MAX_VALUE)
                            .addComponent(jButtonRefreshActivePrograms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConfigProgram, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonStopSelectedProgram))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonFindRemoteServices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTTL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldServiceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFindRemoteServices)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldServiceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneRemoteServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRemoteServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRequireProgramList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonRefreshActivePrograms)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneRemoteServices1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProgramList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxActivePrograms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRequireSelectedProgram)
                    .addComponent(jButtonConfigProgram)
                    .addComponent(jButtonStopSelectedProgram))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChangeVlcDirectory)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldVlcDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFindRemoteServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindRemoteServicesActionPerformed
        jTextAreaProgramList.setText("");
        jTextAreaRemoteServices.setText("");

        String [] emptyList = {};
        DefaultComboBoxModel emptyDcbm = new DefaultComboBoxModel(emptyList);
        jComboBoxProgramList.setModel(emptyDcbm);
        jComboBoxRemoteServices.setModel(emptyDcbm);
        
        try{
            int ttl=Integer.parseInt(jTextFieldTTL.getText());
            int timeout=Integer.parseInt(jTextFieldTimeout.getText());
            int serviceAmount=Integer.parseInt(jTextFieldServiceAmount.getText());
            availableServices = bc.findBroadcastService(ttl, timeout, serviceAmount);
            String text="";
            String[] items=new String[availableServices.size()];
            for (int i=0; i<availableServices.size(); i++){
                text+=availableServices.elementAt(i)+"\n";
                items[i]=""+availableServices.elementAt(i);
            }
            jTextAreaRemoteServices.setText(text);
            DefaultComboBoxModel dcm = new DefaultComboBoxModel(items);
            jComboBoxRemoteServices.setModel(dcm);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonFindRemoteServicesActionPerformed

    private void jButtonRequireProgramListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRequireProgramListActionPerformed
        //try{
            int index = jComboBoxRemoteServices.getSelectedIndex();
            if(index!=-1){
                ServiceResponse service = availableServices.elementAt(index);
                String[] programs = new String[0];
                String[] items = new String[0];
                String text="";
                try{
                    programs = bc.programList(service);
                    items = new String[programs.length];
                    for (int i=0; i<programs.length; i++){
                        //System.out.println("BroadcastClientJFrame.jButtonRequireProgramListActionPerformed program["+i+"] "+programs[i]);
                        text+=programs[i]+"\n";
                        items[i]=programs[i];
                    }
                }
                catch(Exception e){
                    //e.printStackTrace();
                    //System.out.println("BroadcastClientJFrame.jButtonRequireProgramListActionPerformed "+e.getMessage());
                    text = "unresponsive service: "+e.getMessage();
                }
                jTextAreaProgramList.setText(text);
                DefaultComboBoxModel dcm = new DefaultComboBoxModel(items);
                jComboBoxProgramList.setModel(dcm);
            }
        /*}
        catch(Exception e){
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_jButtonRequireProgramListActionPerformed

    private void jComboBoxRemoteServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRemoteServicesActionPerformed
        //jButtonRequireFileListActionPerformed(null);
        this.jTextAreaProgramList.setText("");
        String[] empty={};
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(empty);
        jComboBoxProgramList.setModel(dcm);
    }//GEN-LAST:event_jComboBoxRemoteServicesActionPerformed

    private void jButtonRequireSelectedProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRequireSelectedProgramActionPerformed
        try{
            int index = jComboBoxRemoteServices.getSelectedIndex();
            if( index!=-1 && jComboBoxProgramList.getSelectedItem()!=null ){

                final ServiceResponse service = availableServices.elementAt(index);

                final String program = jComboBoxProgramList.getSelectedItem().toString();
                System.out.println("BroadcastClientJFrame.jButtonRequireSelectedProgramActionPerformed program "+program);

                bc.getProgram(service, program);//, programProtocol, rampProtocol);
            }
            Thread.sleep(10);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        jButtonRefreshActiveProgramsActionPerformed(null);
    }//GEN-LAST:event_jButtonRequireSelectedProgramActionPerformed

    private void jTextFieldServiceAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServiceAmountActionPerformed
        // do nothing...
    }//GEN-LAST:event_jTextFieldServiceAmountActionPerformed

    private void jTextFieldVlcDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVlcDirectoryActionPerformed
        // do nothing...
    }//GEN-LAST:event_jTextFieldVlcDirectoryActionPerformed

    private void jButtonChangeVlcDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeVlcDirectoryActionPerformed
        bc.setVlcDirectory(jTextFieldVlcDirectory.getText());
    }//GEN-LAST:event_jButtonChangeVlcDirectoryActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        bc.stopClient();
    }//GEN-LAST:event_formWindowClosing

    private void jButtonConfigProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigProgramActionPerformed
        int index = jComboBoxActivePrograms.getSelectedIndex();
        if(index!=-1){
            String programName = (String)jComboBoxActivePrograms.getItemAt(index);
            bc.showProgramConfig(programName);
        }
    }//GEN-LAST:event_jButtonConfigProgramActionPerformed

    private void jButtonRefreshActiveProgramsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActiveProgramsActionPerformed
        String[] activePrograms = bc.getActivePrograms();
        String text="";
        //String[] items=new String[programs.length];
        for (int i=0; i<activePrograms.length; i++){
            System.out.println("BroadcastClientJFrame.jButtonRefreshActiveProgramsActionPerformed program["+i+"] "+activePrograms[i]);
            text+=activePrograms[i]+"\n";
            //items[i]=activePrograms[i];
        }
        jTextAreaActivePrograms.setText(text);
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(activePrograms);
        jComboBoxActivePrograms.setModel(dcm);
    }//GEN-LAST:event_jButtonRefreshActiveProgramsActionPerformed

    private void jButtonStopSelectedProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopSelectedProgramActionPerformed
        int index = jComboBoxActivePrograms.getSelectedIndex();
        if(index!=-1){
            String programName = (String)jComboBoxActivePrograms.getItemAt(index);
            bc.stopProgram(programName);
        }
        jButtonRefreshActiveProgramsActionPerformed(null);
    }//GEN-LAST:event_jButtonStopSelectedProgramActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangeVlcDirectory;
    private javax.swing.JButton jButtonConfigProgram;
    private javax.swing.JButton jButtonFindRemoteServices;
    private javax.swing.JButton jButtonRefreshActivePrograms;
    private javax.swing.JButton jButtonRequireProgramList;
    private javax.swing.JButton jButtonRequireSelectedProgram;
    private javax.swing.JButton jButtonStopSelectedProgram;
    private javax.swing.JComboBox jComboBoxActivePrograms;
    private javax.swing.JComboBox jComboBoxProgramList;
    private javax.swing.JComboBox jComboBoxRemoteServices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneRemoteServices;
    private javax.swing.JScrollPane jScrollPaneRemoteServices1;
    private javax.swing.JTextArea jTextAreaActivePrograms;
    private javax.swing.JTextArea jTextAreaProgramList;
    private javax.swing.JTextArea jTextAreaRemoteServices;
    private javax.swing.JTextField jTextFieldServiceAmount;
    private javax.swing.JTextField jTextFieldTTL;
    private javax.swing.JTextField jTextFieldTimeout;
    private javax.swing.JTextField jTextFieldVlcDirectory;
    // End of variables declaration//GEN-END:variables

}
