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
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author useruser
 */
public class StreamClientJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Vector<ServiceResponse> availableServices;

    private StreamClient sc;
    /** Creates new form FileSharingClientJFrame */
    public StreamClientJFrame(StreamClient sc) {
        initComponents();

        this.sc=sc;
        String[] empty=new String[0];
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(empty);
        jComboBoxRemoteServices.setModel(dcm);
        jComboBoxFileList.setModel(dcm);
        jTextFieldVlcDirectory.setText(sc.getVlcDirectory());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStreamProtocol = new javax.swing.ButtonGroup();
        buttonGroupRampProtocol = new javax.swing.ButtonGroup();
        jButtonFindRemoteServices = new javax.swing.JButton();
        jButtonRequireStreamList = new javax.swing.JButton();
        jButtonRequireSelectedStream = new javax.swing.JButton();
        jScrollPaneRemoteServices = new javax.swing.JScrollPane();
        jTextAreaRemoteServices = new javax.swing.JTextArea();
        jComboBoxRemoteServices = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStreamList = new javax.swing.JTextArea();
        jComboBoxFileList = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTTL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTimeout = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldServiceAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldVlcDirectory = new javax.swing.JTextField();
        jButtonChangeVlcDirectory = new javax.swing.JButton();
        jRadioButtonUDP = new javax.swing.JRadioButton();
        jRadioButtonRTP = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonUdp = new javax.swing.JRadioButton();
        jRadioButtonTcp = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StreamClient");
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

        jButtonRequireStreamList.setText("require stream list");
        jButtonRequireStreamList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRequireStreamListActionPerformed(evt);
            }
        });

        jButtonRequireSelectedStream.setText("require selected stream");
        jButtonRequireSelectedStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRequireSelectedStreamActionPerformed(evt);
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

        jTextAreaStreamList.setColumns(20);
        jTextAreaStreamList.setEditable(false);
        jTextAreaStreamList.setRows(5);
        jScrollPane1.setViewportView(jTextAreaStreamList);

        jComboBoxFileList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("TTL");

        jTextFieldTTL.setText("3");

        jLabel2.setText("timeout");

        jTextFieldTimeout.setText("5000");

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

        buttonGroupStreamProtocol.add(jRadioButtonUDP);
        jRadioButtonUDP.setText("ts-UDP");
        jRadioButtonUDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUDPActionPerformed(evt);
            }
        });

        buttonGroupStreamProtocol.add(jRadioButtonRTP);
        jRadioButtonRTP.setSelected(true);
        jRadioButtonRTP.setText("ts-RTP");
        jRadioButtonRTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRTPActionPerformed(evt);
            }
        });

        buttonGroupStreamProtocol.add(jRadioButton1);
        jRadioButton1.setText("raw-UDP");

        jLabel5.setText("(raw-UDP only for on-demand)");

        jLabel6.setText("stream protocol");

        jLabel7.setText("ramp protocol");

        buttonGroupRampProtocol.add(jRadioButtonUdp);
        jRadioButtonUdp.setSelected(true);
        jRadioButtonUdp.setText("udp");

        buttonGroupRampProtocol.add(jRadioButtonTcp);
        jRadioButtonTcp.setText("tcp");

        jLabel8.setText("(tcp allows continuity manager, if supported by intermediaries)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPaneRemoteServices, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButtonFindRemoteServices, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldTTL, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jLabel2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldTimeout, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jLabel3)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldServiceAmount, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButtonChangeVlcDirectory)
        					.addGap(18)
        					.addComponent(jLabel4)
        					.addGap(18)
        					.addComponent(jTextFieldVlcDirectory, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addGap(8)
        					.addComponent(jRadioButtonUDP)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jRadioButtonRTP)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jRadioButton1)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel5)
        					.addGap(10))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel7)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jRadioButtonUdp)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jRadioButtonTcp)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel8))
        				.addComponent(jComboBoxRemoteServices, 0, 580, Short.MAX_VALUE)
        				.addComponent(jButtonRequireStreamList, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        				.addComponent(jComboBoxFileList, 0, 580, Short.MAX_VALUE)
        				.addComponent(jButtonRequireSelectedStream, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonFindRemoteServices)
        				.addComponent(jTextFieldTTL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2)
        				.addComponent(jTextFieldTimeout, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3)
        				.addComponent(jTextFieldServiceAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPaneRemoteServices, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jComboBoxRemoteServices, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonRequireStreamList)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jComboBoxFileList, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonRequireSelectedStream)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jRadioButtonUDP)
        				.addComponent(jRadioButtonRTP, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jRadioButton1)
        				.addComponent(jLabel5))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(jRadioButtonUdp)
        				.addComponent(jRadioButtonTcp)
        				.addComponent(jLabel8))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonChangeVlcDirectory)
        				.addComponent(jLabel4)
        				.addComponent(jTextFieldVlcDirectory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFindRemoteServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindRemoteServicesActionPerformed
        jTextAreaStreamList.setText("");
        jTextAreaRemoteServices.setText("");

        String [] emptyList = {};
        DefaultComboBoxModel emptyDcbm = new DefaultComboBoxModel(emptyList);
        jComboBoxFileList.setModel(emptyDcbm);
        jComboBoxRemoteServices.setModel(emptyDcbm);
        
        try{
            int ttl=Integer.parseInt(jTextFieldTTL.getText());
            int timeout=Integer.parseInt(jTextFieldTimeout.getText());
            int serviceAmount=Integer.parseInt(jTextFieldServiceAmount.getText());
            availableServices = sc.findStreamService(ttl, timeout, serviceAmount);
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

    private void jButtonRequireStreamListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRequireStreamListActionPerformed
        try{
            int index = jComboBoxRemoteServices.getSelectedIndex();
            if(index!=-1){
                ServiceResponse service = availableServices.elementAt(index);
                String[] streams = sc.streamList(service);
                String text="";
                String[] items=new String[streams.length];
                for (int i=0; i<streams.length; i++){
                    System.out.println("StreamClientJFrame.jButtonRequireStreamListActionPerformed streams["+i+"] "+streams[i]);
                    text+=streams[i]+"\n";
                    items[i]=streams[i];
                }
                jTextAreaStreamList.setText(text);
                DefaultComboBoxModel dcm = new DefaultComboBoxModel(items);
                jComboBoxFileList.setModel(dcm);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRequireStreamListActionPerformed

    private void jComboBoxRemoteServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRemoteServicesActionPerformed
        //jButtonRequireFileListActionPerformed(null);
        this.jTextAreaStreamList.setText("");
        String[] empty={};
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(empty);
        jComboBoxFileList.setModel(dcm);
    }//GEN-LAST:event_jComboBoxRemoteServicesActionPerformed

    private void jButtonRequireSelectedStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRequireSelectedStreamActionPerformed
        try{
            int index = jComboBoxRemoteServices.getSelectedIndex();
            if(index!=-1){

                final ServiceResponse service = availableServices.elementAt(index);

                final String stream = jComboBoxFileList.getSelectedItem().toString();
                System.out.println("StreamClientJFrame.jButtonRequireSelectedFileActionPerformed stream "+stream);
                
                JRadioButton jrbStreamProtocol = null;
                for (Enumeration<?> e = buttonGroupStreamProtocol.getElements(); e.hasMoreElements(); ) {
                    JRadioButton b = (JRadioButton)e.nextElement();
                    if (b.getModel() == buttonGroupStreamProtocol.getSelection()) {
                        jrbStreamProtocol = b;
                    }
                }
                final String streamProtocol = jrbStreamProtocol.getText();

                JRadioButton jrbRampProtocol = null;
                for (Enumeration<?> e = buttonGroupRampProtocol.getElements(); e.hasMoreElements(); ) {
                    JRadioButton b = (JRadioButton)e.nextElement();
                    if (b.getModel() == buttonGroupRampProtocol.getSelection()) {
                        jrbRampProtocol = b;
                    }
                }
                final String rampProtocol = jrbRampProtocol.getText();
                
                //sc.getStream(service, stream, streamProtocol, rampProtocol);
                Thread t = new Thread(
                        new Runnable(){
                            @Override
                            public void run() {
                                try {
                                    sc.getStream(service, stream, streamProtocol, rampProtocol);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            }
                        }
                );
                t.start();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRequireSelectedStreamActionPerformed

    private void jTextFieldServiceAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServiceAmountActionPerformed
        // do nothing...
    }//GEN-LAST:event_jTextFieldServiceAmountActionPerformed

    private void jTextFieldVlcDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVlcDirectoryActionPerformed
        // do nothing...
    }//GEN-LAST:event_jTextFieldVlcDirectoryActionPerformed

    private void jButtonChangeVlcDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeVlcDirectoryActionPerformed
        sc.setVlcDirectory(jTextFieldVlcDirectory.getText());
    }//GEN-LAST:event_jButtonChangeVlcDirectoryActionPerformed

    private void jRadioButtonRTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRTPActionPerformed
        // do nothing
    }//GEN-LAST:event_jRadioButtonRTPActionPerformed

    private void jRadioButtonUDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUDPActionPerformed
        // do nothing
    }//GEN-LAST:event_jRadioButtonUDPActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sc.stopClient();
    }//GEN-LAST:event_formWindowClosing

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRampProtocol;
    private javax.swing.ButtonGroup buttonGroupStreamProtocol;
    private javax.swing.JButton jButtonChangeVlcDirectory;
    private javax.swing.JButton jButtonFindRemoteServices;
    private javax.swing.JButton jButtonRequireSelectedStream;
    private javax.swing.JButton jButtonRequireStreamList;
    private javax.swing.JComboBox jComboBoxFileList;
    private javax.swing.JComboBox jComboBoxRemoteServices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButtonRTP;
    private javax.swing.JRadioButton jRadioButtonTcp;
    private javax.swing.JRadioButton jRadioButtonUDP;
    private javax.swing.JRadioButton jRadioButtonUdp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneRemoteServices;
    private javax.swing.JTextArea jTextAreaRemoteServices;
    private javax.swing.JTextArea jTextAreaStreamList;
    private javax.swing.JTextField jTextFieldServiceAmount;
    private javax.swing.JTextField jTextFieldTTL;
    private javax.swing.JTextField jTextFieldTimeout;
    private javax.swing.JTextField jTextFieldVlcDirectory;
    // End of variables declaration//GEN-END:variables

}
