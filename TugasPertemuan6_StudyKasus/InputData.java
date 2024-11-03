/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan6_StudyKasus;

/**
 *
 * @author Administrator
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class InputData extends JFrame {

    private JMenuBar menuBar;
    private JMenu inputFormsMenu;
    private JMenuItem bookFormMenuItem;
    private JMenuItem comicFormMenuItem;

    public InputData() {
        setTitle("Input Buku dan Komik");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();
        inputFormsMenu = new JMenu("Form Input");

        bookFormMenuItem = new JMenuItem("Buku");
        bookFormMenuItem.addActionListener(e -> showBookForm());
        inputFormsMenu.add(bookFormMenuItem);

        comicFormMenuItem = new JMenuItem(" Form");
        comicFormMenuItem.addActionListener(e -> showComicForm());
        inputFormsMenu.add(comicFormMenuItem);

        menuBar.add(inputFormsMenu);
        setJMenuBar(menuBar);
    }

    private void showBookForm() {
        new BookInputForm().setVisible(true);
    }

    private void showComicForm() {
        new ComicInputForm().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InputData app = new InputData();
            app.setVisible(true);
        });
    }
}

class BookInputForm extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JTextArea jmlHalaman;
    private JRadioButton bukuCetak;
    private JRadioButton bukuDigital;
    private JCheckBox bukuInternational;
    private JComboBox<String> genreComboBox;
    private JSlider ratingSlider;
    private JSpinner priceSpinner;
    private JTable table;
    private DefaultTableModel tableModel;

    public BookInputForm() {
        setTitle("Book Input Form");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Input Components
        JPanel panel = new JPanel(new GridLayout(0, 2));

        titleField = new JTextField();
        authorField = new JTextField();
        jmlHalaman = new JTextArea(3, 20);
        bukuCetak = new JRadioButton("Buku Cetak");
        bukuDigital = new JRadioButton("Buku Digital");
        ButtonGroup bindingGroup = new ButtonGroup();
        bindingGroup.add(bukuCetak);
        bindingGroup.add(bukuDigital);
        bukuInternational = new JCheckBox("Buku International");
        genreComboBox = new JComboBox<>(new String[]{"Fiction", "Non-Fiction", "Sci-Fi", "Fantasy", "Mystery"});
        ratingSlider = new JSlider(0, 5, 3);
        priceSpinner = new JSpinner(new SpinnerNumberModel(10000.0, 10000.0, 200000.0, 5000.0));

        panel.add(new JLabel("Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Author:"));
        panel.add(authorField);
        panel.add(new JLabel("Jumlah Halaman:"));
        panel.add(new JScrollPane(jmlHalaman));
        panel.add(new JLabel("Jenis:"));
        panel.add(bukuCetak);
        panel.add(new JLabel(""));
        panel.add(bukuDigital);
        panel.add(new JLabel("Buku International:"));
        panel.add(bukuInternational);
        panel.add(new JLabel("Genre:"));
        panel.add(genreComboBox);
        panel.add(new JLabel("Rating (0-5):"));
        panel.add(ratingSlider);
        panel.add(new JLabel("Price:"));
        panel.add(priceSpinner);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitAction());

        add(panel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        // Table
        String[] columnNames = {"Field", "Value"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.EAST);
    }

    private class SubmitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tableModel.addRow(new Object[]{"Title", titleField.getText()});
            tableModel.addRow(new Object[]{"Author", authorField.getText()});
            tableModel.addRow(new Object[]{"Jumlah halanman", jmlHalaman.getText()});
            tableModel.addRow(new Object[]{"Jenis", bukuCetak.getText()});
            tableModel.addRow(new Object[]{"Jenis", bukuDigital.getText()});
            tableModel.addRow(new Object[]{"Buku Iternational", bukuInternational.getText()});
            tableModel.addRow(new Object[]{"Gendre", genreComboBox.getSelectedItem()});
            tableModel.addRow(new Object[]{"Rating", ratingSlider.getValue()});
            tableModel.addRow(new Object[]{"Price", priceSpinner.getValue()});
            // Add other input values to the table model
        }
    }
}

class ComicInputForm extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JTextArea jmlHalaman;
    private JRadioButton komikCetak;
    private JRadioButton komikDigital;
    private JCheckBox bukuInternational;
    private JComboBox<String> genreComboBox;
    private JSlider ratingSlider;
    private JSpinner priceSpinner;
    private JTable table;
    private DefaultTableModel tableModel;

    public ComicInputForm() {
        setTitle("Komik Input Form");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Input Components
        JPanel panel = new JPanel(new GridLayout(0, 2));

        titleField = new JTextField();
        authorField = new JTextField();
        jmlHalaman = new JTextArea(3, 20);
        komikCetak = new JRadioButton("Komik Cetak");
        komikDigital = new JRadioButton("Komik Digital");
        ButtonGroup bindingGroup = new ButtonGroup();
        bindingGroup.add(komikCetak);
        bindingGroup.add(komikDigital);
        bukuInternational = new JCheckBox("Komik International");
        genreComboBox = new JComboBox<>(new String[]{"Fiction", "Non-Fiction", "Sci-Fi", "Fantasy", "Mystery"});
        ratingSlider = new JSlider(0, 5, 3);
        priceSpinner = new JSpinner(new SpinnerNumberModel(10000.0, 10000.0, 200000.0, 5000.0));

        panel.add(new JLabel("Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Author:"));
        panel.add(authorField);
        panel.add(new JLabel("Jumlah Halaman:"));
        panel.add(new JScrollPane(jmlHalaman));
        panel.add(new JLabel("Jenis:"));
        panel.add(komikCetak);
        panel.add(new JLabel(""));
        panel.add(komikDigital);
        panel.add(new JLabel("Komik International:"));
        panel.add(bukuInternational);
        panel.add(new JLabel("Genre:"));
        panel.add(genreComboBox);
        panel.add(new JLabel("Rating (0-5):"));
        panel.add(ratingSlider);
        panel.add(new JLabel("Price:"));
        panel.add(priceSpinner);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitAction());

        add(panel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        // Table
        String[] columnNames = {"Field", "Value"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.EAST);
    }

    private class SubmitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tableModel.addRow(new Object[]{"Title", titleField.getText()});
            tableModel.addRow(new Object[]{"Author", authorField.getText()});
            tableModel.addRow(new Object[]{"Jumlah halanman", jmlHalaman.getText()});
            tableModel.addRow(new Object[]{"Jenis", komikCetak.getText()});
            tableModel.addRow(new Object[]{"Jenis", komikDigital.getText()});
            tableModel.addRow(new Object[]{"Komik Iternational", bukuInternational.getText()});
            tableModel.addRow(new Object[]{"Gendre", genreComboBox.getSelectedItem()});
            tableModel.addRow(new Object[]{"Rating", ratingSlider.getValue()});
            tableModel.addRow(new Object[]{"Price", priceSpinner.getValue()});
            // Add other input values to the table model
        }
    }
}