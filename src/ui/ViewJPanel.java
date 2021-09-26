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

        setPreferredSize(new java.awt.Dimension(1000, 603));

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

        lblPhonePrimary.setText("Primary Phone:");

        lblPhoneSecondary.setText("Secondary Phone:");

        lblEmailPrimary.setText("Primary Email:");

        lblLicensePlate.setText("License Plate Number:");

        lblFax.setText("Fax:");

        lblDevice.setText("Device Details:");

        lblSSN.setText("SSN:");

        lblEmailSecondary.setText("Secondary Email:");

        lblUnique.setText("Unique Identifier:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblprimaryBankAccount)
                                .addGap(42, 42, 42)
                                .addComponent(txtprimaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(lblLinkedin)
                                            .addComponent(lblUnique))
                                        .addGap(50, 50, 50)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLicensePlate)
                                    .addComponent(txtIPAddr, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLinkedin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDevice)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUnique, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblDob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMRN)
                                .addGap(18, 18, 18)
                                .addComponent(txtMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblsecondaryBankAccount)
                                .addGap(18, 18, 18)
                                .addComponent(txtsecondaryBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBiometricImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRelatedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDob))
                    .addGroup(layout.createSequentialGroup()
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRelatedImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblBiometricImage, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(lblUnique))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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

