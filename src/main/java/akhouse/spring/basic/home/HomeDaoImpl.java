package akhouse.spring.basic.home;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDaoImpl implements HomeDao {

	
	@Autowired
	private  SqlSession sqlSession;
	
	@Override
	public List<boardSpec> selectBoardList() {
		return sqlSession.selectList("sqlBasicMapper.select-board-list");
	}
	
}
