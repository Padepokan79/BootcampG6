package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdJenisGajitbl;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdJenisGajitblController extends CRUDController<MdJenisGajitbl> {
	
	public List<Map<String, Object>> CustomOnLoad(PagingParams params) throws Exception {
		params.setFilter("kdgaji < ?", 5);
		
		return super.customOnLoad(params);
	}
	
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		params.setFilter("kdgaji < ?", 5);
		
		return super.customOnReadAll(params);
	}

}
