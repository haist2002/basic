package akhouse.spring.basic.home;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class HomeDaoImpl extends SqlSessionDaoSupport  implements HomeDao {


	
	@Override
	public List<boardSpec> selectBoardList() {
		
		return  getSqlSession().selectList("home.selectBoardList");
	}
	
}
