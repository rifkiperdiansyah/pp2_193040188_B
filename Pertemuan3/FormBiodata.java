package Pertemuan3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import javax.swing.*;
import java.awt.*;

public class FormBiodata {
    public static void main(String[] args) {


        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add the title label
        JLabel titleLabel = new JLabel("Form Biodata");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        // Add the name label and text field
        JLabel nameLabel = new JLabel("Nama:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(nameField, gbc);

        // Add the phone number label and text field
        JLabel phoneLabel = new JLabel("Nomor HP:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(phoneLabel, gbc);

        JTextField phoneField = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(phoneField, gbc);

        // Add the gender label and radio buttons
        JLabel genderLabel = new JLabel("Jenis Kelamin:");
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(genderLabel, gbc);

        JRadioButton maleRadio = new JRadioButton("Laki-Laki");
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(maleRadio, gbc);

        JRadioButton femaleRadio = new JRadioButton("Perempuan");
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(femaleRadio, gbc);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Add the foreign citizen checkbox
        JCheckBox foreignCitizenCheck = new JCheckBox("Warga Negara Asing");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(foreignCitizenCheck, gbc);

        // Add the save button
        JButton saveButton = new JButton("Simpan");
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(saveButton, gbc);

                // Create the frame
        JFrame frame = new JFrame("Form Biodata");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        
        // Add the panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Set the frame to be visible
        frame.setVisible(true);
    } }