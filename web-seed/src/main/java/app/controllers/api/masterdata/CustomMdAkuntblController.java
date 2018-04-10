package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdAkuntbl;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdAkuntblController extends CRUDController<MdAkuntbl>{
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		params.setFilter("KDAKUN = ?", "120.18.00.00.5.1.1.01.XX");
		params.setOrderBy("KDTRANS desc");
		
		return super.customOnLoad(params);
	}
	
	@Override
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		//params.setFilter("KDTRANS > ?", 200);
		params.setOrderBy("KDTRANS asc");
		
		return super.customOnReadAll(params);
	}
	
	
}
