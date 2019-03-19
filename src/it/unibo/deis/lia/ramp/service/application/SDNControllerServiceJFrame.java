package it.unibo.deis.lia.ramp.service.application;

import it.unibo.deis.lia.ramp.core.internode.sdn.trafficEngineeringPolicy.TrafficEngineeringPolicy;
import org.graphstream.ui.swingViewer.DefaultView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

/**
 * @author Dmitrij David Padalino Montenero
 */
public class SDNControllerServiceJFrame extends JFrame {
    private SDNControllerService SDNControllerService;

    private JPanel trafficEngineeringPolicyPanel;
    private JTextField currentPolicyTextField;
    private JComboBox availableFlowPoliciesComboBox;
    private JButton updateFlowPolicyButton;

    private JPanel activeClientsPanel;
    private JTextArea activeClientsTextArea;
    private JButton getActiveClientsButton;

    private JPanel displayGraphPanel;
    private JButton displayGraphButton;
    private JFrame displayGraphJFrame;

    public SDNControllerServiceJFrame(SDNControllerService SDNControllerService) {
        this.SDNControllerService = SDNControllerService;
        initComponents();
    }

    private void initComponents() {
        /* Flow Policy Panel */
        trafficEngineeringPolicyPanel = new JPanel();
        trafficEngineeringPolicyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Traffic Engineering Policy"));

        currentPolicyTextField = new JTextField(SDNControllerService.getFlowPolicy().toString());
        currentPolicyTextField.setEditable(false);

        availableFlowPoliciesComboBox = new JComboBox();
        int count = TrafficEngineeringPolicy.values().length;
        String[] flowPolicyItems = new String[count];
        count = 0;
        for (TrafficEngineeringPolicy f : TrafficEngineeringPolicy.values()) {
            flowPolicyItems[count] = f.toString();
            count++;
        }
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(flowPolicyItems);
        availableFlowPoliciesComboBox.setModel(dcm);

        updateFlowPolicyButton = new JButton("Update Policy");
        updateFlowPolicyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonUpdateFlowPolicyActionPerformed(evt);
            }
        });

        GroupLayout flowPoliciesLayout = new GroupLayout(trafficEngineeringPolicyPanel);
        trafficEngineeringPolicyPanel.setLayout(flowPoliciesLayout);
        flowPoliciesLayout.setHorizontalGroup(flowPoliciesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(currentPolicyTextField, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addComponent(availableFlowPoliciesComboBox, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addComponent(updateFlowPolicyButton, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        flowPoliciesLayout.setVerticalGroup(flowPoliciesLayout.createSequentialGroup()
                .addComponent(currentPolicyTextField)
                .addGap(5)
                .addComponent(availableFlowPoliciesComboBox)
                .addGap(5)
                .addComponent(updateFlowPolicyButton)
        );

        /*
         * Active Clients Panel
         */
        activeClientsPanel = new JPanel();
        activeClientsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Active Clients"));

        getActiveClientsButton = new JButton("Get Active Clients");
        getActiveClientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonRefreshActiveClientsActionPerfomed(evt);
            }
        });

        activeClientsTextArea = new JTextArea();
        activeClientsTextArea.setColumns(20);
        activeClientsTextArea.setEditable(false);
        activeClientsTextArea.setRows(5);

        GroupLayout activeClientsLayout = new GroupLayout(activeClientsPanel);
        activeClientsPanel.setLayout(activeClientsLayout);
        activeClientsLayout.setHorizontalGroup(activeClientsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(getActiveClientsButton, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addComponent(activeClientsTextArea, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        activeClientsLayout.setVerticalGroup(activeClientsLayout.createSequentialGroup()
                .addComponent(getActiveClientsButton)
                .addGap(5)
                .addComponent(activeClientsTextArea)
        );

        /*
         * Display Graph Panel
         */
        displayGraphPanel = new JPanel();
        displayGraphPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Topology Graph"));

        displayGraphButton = new JButton("Show Topology Graph");
        displayGraphButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jButtonDisplayActionPerfomed(evt);
            }
        });

        GroupLayout displayGraphLayout = new GroupLayout(displayGraphPanel);
        displayGraphPanel.setLayout(displayGraphLayout);
        displayGraphLayout.setHorizontalGroup(displayGraphLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(displayGraphButton, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        displayGraphLayout.setVerticalGroup(displayGraphLayout.createSequentialGroup()
                .addComponent(displayGraphButton)
        );

        /*
         * Main Panel Layout
         */
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }

            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SDNControllerService");
        setLocationByPlatform(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup()
                        .addComponent(trafficEngineeringPolicyPanel, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                        .addComponent(activeClientsPanel, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                        .addComponent(displayGraphPanel, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                )
                .addContainerGap()
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trafficEngineeringPolicyPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(15)
                .addComponent(activeClientsPanel, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                .addGap(15)
                .addComponent(displayGraphPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap()
        );

        getContentPane().setLayout(layout);
        pack();
    }

    private void jButtonRefreshActiveClientsActionPerfomed(ActionEvent evt) {
        try {
            String text = "";
            int i = 0;
            Iterator<Integer> activeClients = this.SDNControllerService.getActiveClients();
            while (activeClients.hasNext()) {
                text = text + i + " " + activeClients.next() + "\n";
                i++;
            }
            activeClientsTextArea.setText(text);
        } catch (Exception e) {
            activeClientsTextArea.setText(e.toString());
        }
    }

    private void jButtonUpdateFlowPolicyActionPerformed(ActionEvent evt) {
        try {
            String selectedFlowPolicy = availableFlowPoliciesComboBox.getSelectedItem().toString();
            TrafficEngineeringPolicy trafficEngineeringPolicy = TrafficEngineeringPolicy.valueOf(selectedFlowPolicy);
            SDNControllerService.updateFlowPolicy(trafficEngineeringPolicy);
            currentPolicyTextField.setText(SDNControllerService.getFlowPolicy().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jButtonDisplayActionPerfomed(ActionEvent evt) {
        DefaultView view = SDNControllerService.getGraph();

        displayGraphJFrame = new JFrame();
        displayGraphJFrame.setTitle("TopologyGraph");
        displayGraphJFrame.setLocationByPlatform(true);
        displayGraphJFrame.add(view);
        displayGraphJFrame.setSize(new Dimension(500,500));

        displayGraphJFrame.setVisible(true);

    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {

    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.out.println("SDNControllerServiceJFrame: formWindowClosing");
        SDNControllerService.stopService();
    }
}