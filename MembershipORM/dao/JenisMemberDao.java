package dao;
import java.util.List;
import model.JenisMember;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class JenisMemberDao {
private final SqlSessionFactory sqlSessionFactory;
public JenisMemberDao(SqlSessionFactory sqlSessionFactory) {
}
this.sqlSessionFactory = sqlSessionFactory;
public int insert (JenisMemberjenisMember) {
}
int result;
try (SqlSession session = sqlSessionFactory.openSession()) {
}
result = session.insert("mapper.JenisMemberMapper.insert", jenisMember);
return result;
public int update (Jenis Member jenis Member) {
int result;
try (SqlSession session = sqlSessionFactory.openSession()) {
}
result = session.update("mapper. JenisMemberMapper.update", jenisMember);
return result;
}
public int delete (JenisMember jenisMember) {
}
int result;
try (SqlSession session = sqlSessionFactory.openSession()) {
}
result = session.delete("mapper. JenisMemberMapper.delete", jenisMember);
return result;
public List<Jenis Member> findAll() {
List<JenisMember> result;
try (SqlSession session = sqlSessionFactory.openSession()) {
}
result = session.selectList("mapper. JenisMemberMapper.findAll");

}
return result;
}
}

