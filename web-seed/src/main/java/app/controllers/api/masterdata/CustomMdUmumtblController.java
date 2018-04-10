package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdUmumtbl;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdUmumtblController extends CRUDController<MdUmumtbl>{
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		params.setFilter("TJUMUM > ?", 180000);
		return super.customOnLoad(params);
	}
	
	@Override
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		params.setOrderBy("TJUMUM desc");
		return super.customOnReadAll(params);
	}
}
