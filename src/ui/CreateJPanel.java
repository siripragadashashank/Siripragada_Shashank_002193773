/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Person;

/**
 *
 * @author sirip
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Person person;
    public CreateJPanel(Person person) {
        initComponents();
        this.person = person;
        
    }
    String regexName = "^[a-zA-Z\\\\s]+";
    String regexAddress = "^[a-zA-Z\\\\s]+";
    String regexPhoneNumber = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
    String regexFax = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
    String regexEmail = "^(.+)@(\\S+)$";
    String regexSSN = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
    String regexNumberField = "^[0-9]+$";
    

    
    public boolean regexEvaluator(String input, String regexPattern, String whichPattern){
        if (input.matches(regexPattern) == true) {
            return true;
        }
        else {
            String errorMSG = String.format("Please enter a valid %s", whichPattern);
            JOptionPane.showMessageDialog(this, errorMSG);
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblEmailPrimary = new javax.swing.JLabel();
        txtEmailPrimary = new javax.swing.JTextField();
        txtEmailSecondary = new javax.swing.JTextField();
        lblEmailSecondary = new javax.swing.JLabel();
        btnBrowseImage = new javax.swing.JButton();
        lblUploadImage = new javax.swing.JLabel();
        lblRelatedImage = new javax.swing.JLabel();
        lblPhonePrimary = new javax.swing.JLabel();
        txtPhonePrimary = new javax.swing.JTextField();
        txtPhoneSecondary = new javax.swing.JTextField();
        lblPhoneSecondary = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtMRN = new javax.swing.JTextField();
        lblMRN = new javax.swing.JLabel();
        lblhealthPlanNumber = new javax.swing.JLabel();
        txthealthPlanNumber = new javax.swing.JTextField();
        lblprimaryBankAccount = new javax.swing.JLabel();
        txtprimaryBankAccount = new javax.swing.JTextField();
        lblsecondaryBankAccount = new javax.swing.JLabel();
        txtsecondaryBankAccount = new javax.swing.JTextField();
        lblLicense = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        lblLicensePlate = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        lblDevice = new javax.swing.JLabel();
        txtDevice = new javax.swing.JTextField();
        txtLinkedin = new javax.swing.JTextField();
        lblLinkedin = new javax.swing.JLabel();
        txtIPAddr = new javax.swing.JTextField();
        lblIPAddr = new javax.swing.JLabel();
        lblUploadRelatedImage = new javax.swing.JLabel();
        btnBrowseRelatedImage = new javax.swing.JButton();
        lblUploadBiometricImage = new javax.swing.JLabel();
        btnBrowseBiometricImage = new javax.swing.JButton();
        lblBiometricImage = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 603));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Person Profile");

        lblName.setText("Name:");

        lblDob.setText("Date of Birth:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblEmailPrimary.setText("Primary Email:");

        lblEmailSecondary.setText("Secondary Email:");

        btnBrowseImage.setText("Browse");
        btnBrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseImageActionPerformed(evt);
            }
        });

        lblUploadImage.setText("Upload a Photo:");

        lblPhonePrimary.setText("Primary Phone:");

        lblPhoneSecondary.setText("Secondary Phone:");

        lblFax.setText("Fax:");

        lblSSN.setText("SSN:");

        lblMRN.setText("Medical Record Number:");

        lblhealthPlanNumber.setText("Health Plan Number:");

        lblprimaryBankAccount.setText("Primary Bank A/C:");

        lblsecondaryBankAccount.setText("Secondary Bank A/C:");

        lblLicense.setText("Driving License Number:");

        lblLicensePlate.setText("License Plate Number:");

        lblDevice.setText("Device Details:");

        lblLinkedin.setText("LinkedIn:");

        lblIPAddr.setText("IP Address:");

        lblUploadRelatedImage.setText("Upload a Related Photo:");

        btnBrowseRelatedImage.setText("Browse");
        btnBrowseRelatedImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseRelatedImageActionPerformed(evt);
            }
        });

        lblUploadBiometricImage.setText("Upload Biometric Data:");

        btnBrowseBiometricImage.setText("Browse");
        btnBrowseBiometricImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseBiometricImageActionPerformed(evt);
            }
        });

        lblAddress.setText("Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblprimaryBankAccount)
                        .addGap(42, 42, 42)
                        .addComponent(txtprimaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUploadImage)
                        .addGap(42, 42, 42)
                        .addComponent(btnBrowseImage)
                        .addGap(48, 48, 48)
                        .addComponent(lblUploadRelatedImage))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFax)
                        .addGap(46, 46, 46)
                        .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSSN)
                            .addComponent(lblhealthPlanNumber))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(46, 46, 46)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addGap(46, 46, 46)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPhonePrimary)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhonePrimary, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblEmailPrimary)
                            .addGap(46, 46, 46)
                            .addComponent(txtEmailPrimary, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDevice)
                                    .addComponent(lblLicensePlate)
                                    .addComponent(lblLicense))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIPAddr)
                                    .addComponent(lblLinkedin))
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicensePlate)
                            .addComponent(txtIPAddr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLinkedin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDevice))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMRN)
                                .addGap(18, 18, 18)
                                .addComponent(txtMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblsecondaryBankAccount)
                                .addGap(18, 18, 18)
                                .addComponent(txtsecondaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(lblDob))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblEmailSecondary)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmailSecondary, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblPhoneSecondary)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhoneSecondary, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBrowseRelatedImage))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRelatedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBiometricImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(194, 194, 194))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(208, 208, 208)))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lblUploadBiometricImage)
                .addGap(18, 18, 18)
                .addComponent(btnBrowseBiometricImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblRelatedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblBiometricImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDob))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPhoneSecondary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPhoneSecondary))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPhonePrimary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPhonePrimary)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFax, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmailPrimary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmailPrimary)
                                    .addComponent(lblEmailSecondary)
                                    .addComponent(txtEmailSecondary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txthealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblhealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtprimaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblprimaryBankAccount)
                                    .addComponent(lblsecondaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsecondaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDevice))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLinkedin))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIPAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIPAddr))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUploadImage)
                                    .addComponent(btnBrowseImage)
                                    .addComponent(lblUploadRelatedImage)
                                    .addComponent(btnBrowseRelatedImage))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBrowseBiometricImage)
                                    .addComponent(lblUploadBiometricImage, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13)
                        .addComponent(btnSave)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String inputName = txtName.getText();
        String inputAddress = txtAddress.getText();
        String inputPhonePrimary = txtPhonePrimary.getText();
        String inputPhoneSecondary = txtPhoneSecondary.getText();
        String inputFax = txtFax.getText();
        String inputEmailPrimary = txtEmailPrimary.getText();
        String inputEmailSecondary = txtEmailSecondary.getText();
        String inputSSN = txtSSN.getText();
        String inputHealthPlanNumber = txthealthPlanNumber.getText();
        String inputMRN = txtMRN.getText();
        String inputPrimaryBank = txtprimaryBankAccount.getText();
        String inputSecondaryBank = txtsecondaryBankAccount.getText();
        String inputLicense = txtLicenseNumber.getText();
        String inputLicensePlate = txtLicensePlate.getText();
        String inputDevice = txtDevice.getText();
        String inputLinkedin = txtLinkedin.getText();
        String inputIPAddr = txtIPAddr.getText();

        person.setDob(txtDob.getText());

        
        boolean checkName = regexEvaluator(inputName, regexName, "Name");
        boolean checkAddress = regexEvaluator(inputAddress, regexAddress, "Address");
        
        boolean checkPhonePrimary = regexEvaluator(inputPhonePrimary, regexPhoneNumber, "Primary Phone Number");
        boolean checkPhoneSecondary = regexEvaluator(inputPhoneSecondary, regexPhoneNumber, "Secondary Phone Number");
        boolean checkFax = regexEvaluator(inputFax, regexFax, "Fax Number");
        boolean checkEmailPrimary = regexEvaluator(inputEmailPrimary, regexEmail, "Primary Email");
        boolean checkEmailSecondary = regexEvaluator(inputEmailSecondary, regexEmail, "Secondary Email");
        boolean checkSSN = regexEvaluator(inputSSN, regexSSN, "SSN");
        boolean checkHealthPlanNumber = regexEvaluator(inputHealthPlanNumber, regexNumberField, "Health Plan Number");
        boolean checkMRN = regexEvaluator(inputMRN, regexNumberField, "Medical Record Number");
        boolean checkPrimaryBank = regexEvaluator(inputPrimaryBank, regexNumberField, "Primary Bank Account Number");
        boolean checkSecondaryBank = regexEvaluator(inputSecondaryBank, regexNumberField, "Secondary Bank Account Number");
        
        if (    checkName && checkAddress && checkPhonePrimary && 
                checkPhoneSecondary && checkEmailPrimary && checkEmailSecondary &&
                checkFax && checkSSN && checkHealthPlanNumber && checkMRN  &&  
                checkPrimaryBank && checkSecondaryBank) {
            person.setName(inputName);
            person.setAddress(inputAddress);
            person.setEmailPrimary(inputEmailPrimary);
            person.setEmailSecondary(inputEmailSecondary);
            person.setSsn(inputSSN);
            person.setHealthPlanNumber(inputHealthPlanNumber);
            person.setMrn(inputMRN);
            person.setBankPrimary(inputPrimaryBank);
            person.setBankSecondary(inputSecondaryBank);
            
        
            JOptionPane.showMessageDialog(this, "Information Saved Successfully.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseImageActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(this, "Image Uploaded Successfully.");
            
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image image = ii.getImage().getScaledInstance(lblRelatedImage.getWidth(), lblRelatedImage.getHeight(), Image.SCALE_SMOOTH);
            person.setPersonImage(new ImageIcon(image));
        }
        
    }//GEN-LAST:event_btnBrowseImageActionPerformed

    private void btnBrowseRelatedImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseRelatedImageActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(this, "Image Uploaded Successfully.");
            
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image image = ii.getImage().getScaledInstance(lblRelatedImage.getWidth(), lblRelatedImage.getHeight(), Image.SCALE_SMOOTH);            

            person.setRelatedImage(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnBrowseRelatedImageActionPerformed

    private void btnBrowseBiometricImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseBiometricImageActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(this, "Image Uploaded Successfully.");
            
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image image = ii.getImage().getScaledInstance(lblBiometricImage.getWidth(), lblBiometricImage.getHeight(), Image.SCALE_SMOOTH);            

            person.setBiometric(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnBrowseBiometricImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseBiometricImage;
    private javax.swing.JButton btnBrowseImage;
    private javax.swing.JButton btnBrowseRelatedImage;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBiometricImage;
    private javax.swing.JLabel lblDevice;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmailPrimary;
    private javax.swing.JLabel lblEmailSecondary;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblIPAddr;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMRN;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhonePrimary;
    private javax.swing.JLabel lblPhoneSecondary;
    private javax.swing.JLabel lblRelatedImage;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUploadBiometricImage;
    private javax.swing.JLabel lblUploadImage;
    private javax.swing.JLabel lblUploadRelatedImage;
    private javax.swing.JLabel lblhealthPlanNumber;
    private javax.swing.JLabel lblprimaryBankAccount;
    private javax.swing.JLabel lblsecondaryBankAccount;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDevice;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmailPrimary;
    private javax.swing.JTextField txtEmailSecondary;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtIPAddr;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMRN;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhonePrimary;
    private javax.swing.JTextField txtPhoneSecondary;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txthealthPlanNumber;
    private javax.swing.JTextField txtprimaryBankAccount;
    private javax.swing.JTextField txtsecondaryBankAccount;
    // End of variables declaration//GEN-END:variables
}
