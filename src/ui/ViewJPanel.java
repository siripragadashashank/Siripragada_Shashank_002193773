/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.ImageIcon;
import model.Person;

/**
 *
 * @author sirip
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    Person person;
    
    public ViewJPanel(Person person) {
        initComponents();
        
        this.person = person;
        displayPerson();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMRN = new javax.swing.JLabel();
        txtLinkedin = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblLinkedin = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtIPAddr = new javax.swing.JTextField();
        lblIPAddr = new javax.swing.JLabel();
        lblhealthPlanNumber = new javax.swing.JLabel();
        txthealthPlanNumber = new javax.swing.JTextField();
        lblprimaryBankAccount = new javax.swing.JLabel();
        txtprimaryBankAccount = new javax.swing.JTextField();
        lblsecondaryBankAccount = new javax.swing.JLabel();
        txtsecondaryBankAccount = new javax.swing.JTextField();
        lblLicense = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        lblRelatedImage = new javax.swing.JLabel();
        lblPhonePrimary = new javax.swing.JLabel();
        txtPhonePrimary = new javax.swing.JTextField();
        txtPhoneSecondary = new javax.swing.JTextField();
        lblPhoneSecondary = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        lblEmailPrimary = new javax.swing.JLabel();
        txtEmailPrimary = new javax.swing.JTextField();
        txtEmailSecondary = new javax.swing.JTextField();
        lblLicensePlate = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        lblBiometricImage = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblDevice = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtDevice = new javax.swing.JTextField();
        lblEmailSecondary = new javax.swing.JLabel();
        txtMRN = new javax.swing.JTextField();
        lblUnique = new javax.swing.JLabel();
        txtUnique = new javax.swing.JTextField();
        lblImageHeader = new javax.swing.JLabel();
        lblRelatedImageHeader = new javax.swing.JLabel();
        lblBiometricImageHeader = new javax.swing.JLabel();

        lblMRN.setText("Medical Record Number:");

        lblLinkedin.setText("LinkedIn:");

        lblAddress.setText("Address:");

        lblIPAddr.setText("IP Address:");

        lblhealthPlanNumber.setText("Health Plan Number:");

        lblprimaryBankAccount.setText("Primary Bank A/C:");

        lblsecondaryBankAccount.setText("Secondary Bank A/C:");

        lblLicense.setText("Driving License Number:");

        lblName.setText("Name:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Person Profile");

        lblDob.setText("Date of Birth:");

        lblRelatedImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPhonePrimary.setText("Primary Phone:");

        lblPhoneSecondary.setText("Secondary Phone:");

        lblEmailPrimary.setText("Primary Email:");

        txtEmailSecondary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailSecondaryActionPerformed(evt);
            }
        });

        lblLicensePlate.setText("License Plate Number:");

        lblBiometricImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFax.setText("Fax:");

        lblDevice.setText("Device Serial Number:");

        lblSSN.setText("SSN:");

        lblEmailSecondary.setText("Secondary Email:");

        lblUnique.setText("Unique Identifier:");

        lblImageHeader.setText("Profile Picture");

        lblRelatedImageHeader.setText("Related Photo");

        lblBiometricImageHeader.setText("Biometric Image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblDevice)
                                                .addComponent(lblLicensePlate)
                                                .addComponent(lblLicense))
                                            .addComponent(lblIPAddr, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblLinkedin, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUnique, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIPAddr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLinkedin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUnique, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDevice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblprimaryBankAccount)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtprimaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblhealthPlanNumber)
                                        .addGap(24, 24, 24)
                                        .addComponent(txthealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMRN)
                                    .addComponent(lblsecondaryBankAccount))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsecondaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFax)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSSN)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(24, 24, 24)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblEmailPrimary)
                                            .addGap(24, 24, 24)
                                            .addComponent(txtEmailPrimary, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblAddress)
                                                .addComponent(lblPhonePrimary))
                                            .addGap(24, 24, 24)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPhonePrimary, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblDob)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(lblPhoneSecondary)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPhoneSecondary, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblEmailSecondary)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmailSecondary, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImageHeader)
                    .addComponent(lblRelatedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBiometricImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRelatedImageHeader)
                    .addComponent(lblBiometricImageHeader))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblImageHeader, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRelatedImageHeader)
                        .addGap(12, 12, 12)
                        .addComponent(lblRelatedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBiometricImageHeader)
                        .addGap(18, 18, 18)
                        .addComponent(lblBiometricImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPhonePrimary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhonePrimary)
                                    .addComponent(txtPhoneSecondary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneSecondary))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDob)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                            .addComponent(txtUnique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnique))))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailSecondaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSecondaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailSecondaryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBiometricImage;
    private javax.swing.JLabel lblBiometricImageHeader;
    private javax.swing.JLabel lblDevice;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmailPrimary;
    private javax.swing.JLabel lblEmailSecondary;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblIPAddr;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImageHeader;
    private javax.swing.JLabel lblLicense;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMRN;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhonePrimary;
    private javax.swing.JLabel lblPhoneSecondary;
    private javax.swing.JLabel lblRelatedImage;
    private javax.swing.JLabel lblRelatedImageHeader;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUnique;
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
    private javax.swing.JTextField txtUnique;
    private javax.swing.JTextField txthealthPlanNumber;
    private javax.swing.JTextField txtprimaryBankAccount;
    private javax.swing.JTextField txtsecondaryBankAccount;
    // End of variables declaration//GEN-END:variables

    private void displayPerson() {
        txtName.setText(person.getName());
        txtAddress.setText(person.getAddress());
        txtDob.setText(person.getDob());
        txtPhonePrimary.setText(person.getPhonePrimary());
        txtPhoneSecondary.setText(person.getPhoneSecondary());
        txtFax.setText(person.getFax());
        txtEmailPrimary.setText(person.getEmailPrimary());
        txtEmailSecondary.setText(person.getEmailSecondary());        
        txtSSN.setText(person.getSsn());
        txthealthPlanNumber.setText(person.getHealthPlanNumber());
        txtMRN.setText(person.getMrn());
        txtprimaryBankAccount.setText(person.getBankPrimary());
        txtsecondaryBankAccount.setText(person.getBankSecondary());
        txtLicenseNumber.setText(person.getLicenseNumber());
        txtLicensePlate.setText(person.getLicensePlate());
        txtDevice.setText(person.getDevice());
        txtLinkedin.setText(person.getLinkedin());
        txtIPAddr.setText(person.getIpaddr());
        txtUnique.setText(person.getUnique());        
        lblImage.setIcon(person.getPersonImage());
        lblRelatedImage.setIcon(person.getRelatedImage());
        lblBiometricImage.setIcon(person.getBiometric());
    }
}

