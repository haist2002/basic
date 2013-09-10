package akhouse.spring.basic.home;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDaoImpl extends SqlSessionDaoSupport  implements HomeDao {


	
	@Override
	public List<boardSpec> selectBoardList() {
		
		
		return getSqlSession().selectList("sqlBasicMapper.select-board-list");
	}
	
}
