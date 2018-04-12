package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdFungsional;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdFungsionalController extends CRUDController<MdFungsional>{
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setFilter("tmt_fungsi = ? and rp_fungsi > ?", "2008-01-01", 1000000);
		params.setOrderBy("kdfungsi");
		
		return super.customOnLoad(params);
	}
	
	@Override
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		params.setFilter("tmt_fungsi = ? and rp_fungsi > ?", "2008-01-01", 1000000);
		params.setOrderBy("kdfungsi");
		
		return super.customOnReadAll(params);
	}
}
