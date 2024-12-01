package view.jenismember;

import dao.JenisMemberDao; 
import java.util.List;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import model. JenisMember;

public class JenisMemberFrame extends JFrame {

private List<Jenis Member> jenisMemberList; 
private JTextField textFieldNama;
private JenisMemberTableModel tableModel;
private Jenis MemberDao jenisMemberDao;
public JenisMember Frame (Jenis MemberDao jenis MemberDao) {
     this.jenisMemberDao = jenisMemberDao; 
     this.jenisMemberList = jenis MemberDao.findAll(); 
     this.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
JLabel labelInput = new JLabel("Nama:"); 
labelInput.setBounds (15, 40, 350, 10);
textFieldNama = new JTextField(); 
textFieldNama.setBounds (15, 60, 350, 30);
JButton button = new JButton("Simpan"); 
button.setBounds(15, 100, 100, 40);
javax.swing.JTable table = new JTable();
JScrollPane scrollableTable = new JScrollPane (table); 
scrollableTable.setBounds(15, 150, 350, 200);

tableModel = new Jenis MemberTableModel (jenis MemberList); 
table.setModel(tableModel);

JenisMemberButtonSimpanActionListener actionListener =
new JenisMemberButtonSimpanActionListener(this, jenisMemberDao);
button.addActionListener(actionListener);
this.add(button); this.add(textFieldNama); this.add(labelInput);
this.add(scrollableTable);
this.setSize(400, 500);
this.setLayout(null);
}
public String getNama() {
return textFieldNama.getText();
}
public void addJenis Member (Jenis Member jenisMember) {
}
tableModel.add(jenisMember);
textFieldNama.setText("");

}
}