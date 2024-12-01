
package view.jenismember;
import dao. Jenis MemberDao;
import java.awt.event.ActionEvent;
import
java.awt.event.ActionListener;
import java.util.UUID;
import model. JenisMember;

public class Jenis MemberButtonSimpanActionListener implements ActionListener {
private JenisMemberFrame jenisMemberFrame;
private JenisMemberDao jenisMemberDao;
public JenisMemberButtonSimpanActionListener(JenisMemberFrame jenisMemberFrame, JenisMemberDao jenisMemberDao) {
}
this.jenisMember Frame = jenis Member Frame; this.jenisMemberDao = jenis MemberDao;
@Override
public void actionPerformed (ActionEvent e) {
String nama = this.jenis MemberFrame.getNama(); 
JenisMember jenisMember = new Jenis Member(); 
jenisMember.setId(UUID.randomUUID().toString()); 
jenisMember.setNama (nama);

this.jenisMemberFrame.addJenis Member(jenis Member);
this.jenisMemberDao.insert(jenisMember);

}}