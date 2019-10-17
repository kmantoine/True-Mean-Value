package TrueMeanValue;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.text.DecimalFormat;
import javax.swing.*;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.TDistribution;

/**
 *
 * @author Kerwan Miguel Antoine
 */
public class TrueMeanValueUI extends javax.swing.JFrame {
    public double sampleMean;
    public int sampleSize;
    public double confidenceLevel;
    public double standardDeviation;
    public double alphaOverTwo;
    
    private static final DecimalFormat df2 = new DecimalFormat("#.##"); //Displays double result to two decimal places.
    private static final DecimalFormat df3 = new DecimalFormat("#.###"); //Displays double result to three decimal places.

    public TrueMeanValueUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        population_sample_sd = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        meanBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        standardDeviationBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sizeBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        confidenceLevelBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sdPopulation = new javax.swing.JRadioButton();
        sdSample = new javax.swing.JRadioButton();
        outputBox = new javax.swing.JTextField();
        calcButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inferential Statistics");
        setBounds(new java.awt.Rectangle(700, 250, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("This program calculates the Confidence Interval for the population & sample Mean.");

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Created by: Kerwan Miguel Antoine");

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter All Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sample Mean:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Standard Deviation:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sample Size:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confidence Level:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("%");

        sdPopulation.setBackground(new java.awt.Color(0, 51, 102));
        population_sample_sd.add(sdPopulation);
        sdPopulation.setForeground(new java.awt.Color(255, 255, 255));
        sdPopulation.setText("σ");

        sdSample.setBackground(new java.awt.Color(0, 51, 102));
        population_sample_sd.add(sdSample);
        sdSample.setForeground(new java.awt.Color(255, 255, 255));
        sdSample.setText("s");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(confidenceLevelBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel6))
                                .addComponent(sizeBox, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(meanBox))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(sdPopulation)
                                .addGap(18, 18, 18)
                                .addComponent(sdSample))
                            .addComponent(standardDeviationBox, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(meanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sizeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(confidenceLevelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(standardDeviationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdPopulation)
                    .addComponent(sdSample))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        outputBox.setEditable(false);

        calcButton.setText("Calculate");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Enter population/sample values manually.");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("z(α/2)");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("t(α/2)");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Manually entered values");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Manual Values"));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(14, 14, 14)
                                .addComponent(jTextField1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(outputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(calcButton)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calcButton)
                        .addComponent(outputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(60, 60, 60)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel7)
                .addGap(101, 101, 101))
        );

        jMenu1.setText("File");

        jMenuItem3.setText("Reset");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        this.getRootPane().setDefaultButton(calcButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        if (meanBox.getText().isEmpty()){
            JOptionPane.showMessageDialog (rootPane, "Please enter all required values.", "Missing Values", JOptionPane.WARNING_MESSAGE);    
        } else if (sizeBox.getText().isEmpty() || confidenceLevelBox.getText().isEmpty()){
            JOptionPane.showMessageDialog (rootPane, "Please enter all required values.", "Missing Values", JOptionPane.WARNING_MESSAGE);   
        } else if (confidenceLevelBox.getText().isEmpty()){
            JOptionPane.showMessageDialog (rootPane, "Please enter all required values.", "Missing Values", JOptionPane.WARNING_MESSAGE);   
        } else if (!standardDeviationBox.getText().isEmpty()) {  
            sampleMean = Double.valueOf(meanBox.getText());
            sampleSize = Integer.valueOf(sizeBox.getText());
            confidenceLevel = Double.valueOf(confidenceLevelBox.getText())/100;
            alphaOverTwo = (1-confidenceLevel)/2;
            standardDeviation = Double.valueOf(standardDeviationBox.getText());
            calcButton.setEnabled(false);    
            if (sdPopulation.isSelected()){
                calculate(zDistribution(alphaOverTwo));
            } else if (sdSample.isSelected()){
                calculate(tDistribution(sampleSize-1, alphaOverTwo));
            } else JOptionPane.showMessageDialog (rootPane, "Please select a standard deviation type.", "No Selection", JOptionPane.WARNING_MESSAGE);  
        } else JOptionPane.showMessageDialog (rootPane, "Please enter all required values.", "Missing Values", JOptionPane.WARNING_MESSAGE);  
    }//GEN-LAST:event_calcButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                meanBox.setText("");
                sizeBox.setText("");
                confidenceLevelBox.setText("");
                standardDeviationBox.setText("");
                population_sample_sd.clearSelection();
                outputBox.setText("");
                jTextField1.setText("");
                jTextField1.setBackground(Color.white);
                jTextField2.setText("");
                jTextField2.setBackground(Color.white);
                jTextArea1.setText("");
                calcButton.setEnabled(true);
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Frame frame = new JFrame("About");
        javax.swing.JTextArea text = new javax.swing.JTextArea();
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(300, 150);
        frame.setLocation(1000, 200);
        frame.setVisible(true);
        text.setText("Powered by apache commons!\n"
                + "Created by Kerwan Miguel Antoine\n\n"
                + "MATH273: Mid-Term Project");
        text.setBackground(Color.blue);
        text.setForeground(Color.WHITE);
        frame.add(text);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        JLabel label = new JLabel("Sample Size: ");
        JTextField size = new JTextField(16);
        panel.add(label);
        panel.add(size);
        
        int sum=0, sum2=0;
        String[] options = new String[]{"Ok", "Cancel"};
        int option = JOptionPane.showOptionDialog(rootPane, panel, "How many samples are there?", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        int newSize=Integer.valueOf(size.getText());
        double[] values = new double[newSize];
        if (option == 0){
            for (int i=0; i<newSize; i++) {
                values[i] = Double.valueOf(JOptionPane.showInputDialog(rootPane, "Value: ", "Enter values", JOptionPane.PLAIN_MESSAGE));
                sum2+=values[i]*values[i];
                sum+=values[i];
            }
            confidenceLevel = Double.valueOf(JOptionPane.showInputDialog(rootPane, "Degree of Confidence: ", "Enter Confidence Level", JOptionPane.PLAIN_MESSAGE))/100;
            alphaOverTwo = (1-confidenceLevel)/2;
            
            if (JOptionPane.showConfirmDialog(rootPane, "We'll make calculations now.", "Calculate", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION) {
                for (int i=0; i <newSize; i++){
                    jTextArea1.setText(jTextArea1.getText() + values[i] + "\n");
                }                
                
                confidenceLevelBox.setText(Double.toString(confidenceLevel*100));
                standardDeviation = Math.sqrt(((newSize*sum2)-(sum*sum))/(newSize*newSize-1));
                standardDeviationBox.setText(df2.format(standardDeviation));
                
                sampleMean = Double.valueOf(sum/newSize);
                meanBox.setText(df2.format(sampleMean));
                
                sampleSize = values.length;
                sizeBox.setText(Integer.toString(sampleSize));
                
                calculate(tDistribution(sampleSize-1, alphaOverTwo));
                calcButton.setEnabled(false);
            }
        } else if (option == 1){
            panel.setVisible(false);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                meanBox.setText("");
                sizeBox.setText("");
                confidenceLevelBox.setText("");
                standardDeviationBox.setText("");
                population_sample_sd.clearSelection();
                outputBox.setText("");
                jTextField1.setText("");
                jTextField1.setBackground(Color.white);
                jTextField2.setText("");
                jTextField2.setBackground(Color.white);
                jTextArea1.setText("");
                calcButton.setEnabled(true);
            }
        });
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public double zDistribution (double alphaO2){
        NormalDistribution nDist = new NormalDistribution();
        double z = nDist.inverseCumulativeProbability(1-alphaO2);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jTextField2.setText(df3.format(z));
                jTextField2.setBackground(Color.gray);
                jTextField2.setForeground(Color.white);
            }
        });
        return z;
    }
    
    public double tDistribution (int df, double alphaO2){
        TDistribution tDist = new TDistribution(df);
        double t = tDist.inverseCumulativeProbability(1-alphaO2);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jTextField1.setText(df3.format(t));
                jTextField1.setBackground(Color.gray);
                jTextField1.setForeground(Color.white);
            }
        });
        
        return t;
    }
    
    public void calculate(double zt) {
        double left = sampleMean - zt * standardDeviation/Math.sqrt(sampleSize);
        double right = sampleMean + zt * standardDeviation/Math.sqrt(sampleSize);
                
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                outputBox.setText(df2.format(left) + " < μ < " + df2.format(right));
            }
        });
    }
   
    //MAIN METHOD
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrueMeanValueUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrueMeanValueUI().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcButton;
    private javax.swing.JTextField confidenceLevelBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField meanBox;
    private javax.swing.JTextField outputBox;
    private javax.swing.ButtonGroup population_sample_sd;
    private javax.swing.JRadioButton sdPopulation;
    private javax.swing.JRadioButton sdSample;
    private javax.swing.JTextField sizeBox;
    private javax.swing.JTextField standardDeviationBox;
    // End of variables declaration//GEN-END:variables
}
