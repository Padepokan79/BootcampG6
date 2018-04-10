package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdHutangtbl;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdHutangtblController extends CRUDController<MdHutangtbl> {
	
	public List<Map<String, Object>> CustomOnload(PagingParams params) throws Exception {
		params.setFilter("kdhutang = ?", 1);
		
		return super.customOnLoad(params);
	}
	
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		params.setFilter("kdhutang = ?", 1);
		
		return super.customOnReadAll(params);
	}

}
