package shang.better.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shang.better.dao.BOmsOrderMapper;
import shang.better.dao.TOmsOrderDtlMapper;
import shang.better.dao.TOmsOrderMapper;
import shang.better.model.BOmsOrder;
import shang.better.model.TOmsOrder;
import shang.better.model.TOmsOrderDtl;
import shang.better.service.BOmsOrderService;

@Service("bOmsOrderService")
public class BOmsOrderImpl implements BOmsOrderService {
	
	@Autowired
	BOmsOrderMapper bOmsOrderMapper;
	
	@Autowired
	TOmsOrderMapper tOmsOrderMapper;
	
	@Autowired
	TOmsOrderDtlMapper tOmsOrderDtlMapper;

	@Override
	public BOmsOrder selectBOmsOrderById(int id) {
		return bOmsOrderMapper.selectBOmsOrderById(id);
	}

	@Transactional
	@Override
	public int insert(BOmsOrder bOrder) {
		TOmsOrder order = bOrder.getOrder();
		int result = tOmsOrderMapper.insert(order);
		List<TOmsOrderDtl> dtls = bOrder.getOrderDtls();
		for(TOmsOrderDtl dtl : dtls){
			tOmsOrderDtlMapper.insert(dtl);
		}
		return result;
	}

}
