package akhouse.spring.basic.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeDao homeDao;
	
	@Override
	public List<boardSpec> getBoard() {
		return homeDao.selectBoardList();
	}

}
