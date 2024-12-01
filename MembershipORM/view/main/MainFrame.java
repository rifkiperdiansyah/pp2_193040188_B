package view.main;
import dao. JenisMemberDao; 
import dao.MemberDao; 
import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame;
import view.jenismember. JenisMemberFrame; 
import view.member. MemberFrame;

public class MainFrame extends JFrame {

private JenisMember FramejenisMemberFrame; 
private MemberFrame memberFrame;
private JButton buttonJenisMember;
private JButton buttonMember;
private JenisMemberDao jenisMemberDao;
private MemberDao memberDao;

public MainFrame (JenisMemberDao jenisMemberDao, MemberDaomemberDao){ 
    this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

this.setSize(400, 500);

this.jenisMemberDao = jenisMemberDao; 
this.memberDao = memberDao;
this.jenisMemberFrame = new JenisMemberFrame (jenis MemberDao); 
this.memberFrame = newMemberFrame (memberDao, jenisMemberDao);
this.setLayout(new FlowLayout());
MainButtonActionListener actionListener = new MainButtonActionListener(this);

this.buttonJenisMember = new JButton("Jenis Member"); 
this.buttonMember = new JButton("Member");

this.buttonJenis Member.addActionListener(actionListener);
this.buttonMember.addActionListener(actionListener);
}
this.add(buttonJenisMember); this.add(buttonMember);
public JButton getButtonJenisMember()
{
return buttonJenisMember;
}
public JButton getButtonMember()
{
return buttonMember;
}
public voidshowJenis MemberFrame()
{
if (jenisMemberFrame == null)
{
jenisMemberFrame = new JenisMemberFrame (jenisMemberDao);
}
jenisMemberFrame.setVisible(true);
public void showMemberFrame()
{
if (memberFrame == null)
{
memberFrame = new MemberFrame (memberDao, jenisMemberDao);
}
memberFrame.populateComboJenis();
memberFrame.setVisible(true);
}
}




package main;
import dao. JenisMemberDao; import dao.MemberDao; import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder; import view.main.MainFrame;
Epublic class Main {
public static void main(String[] args) throws IOException {
String resource = "mybatis-config.xml";
InputStream inputStream = Resources.getResourceAsStream(resource);
SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
Jenis MemberDao jenis MemberDao = new Jenis MemberDao(sqlSessionFactory); MemberDao memberDao = new MemberDao(sqlSessionFactory);
MainFrame f = new MainFrame (jenis MemberDao, memberDao);
javax.swing.SwingUtilities.invokeLater(() -> {
});
f.setVisible(true);
}
}