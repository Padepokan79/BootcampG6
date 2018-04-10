package app.controllers.api.masterdata;


import java.util.List;
import java.util.Map;

import app.models.MdCabangtbl;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdCabangCRUDController extends CRUDController<MdCabangtbl> {
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		params.setFilter("NICKCABANG = ?", "BDG");

		return super.customOnLoad(params);
	}
	
	@Override
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		params.setFilter("NICKCABANG = ?", "BDG");

		return super.customOnReadAll(params);
	}

	@Override
	public MdCabangtbl customOnInsert(MdCabangtbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnInsert(item, mapRequest);
	}
	
	@Override
	public MdCabangtbl customOnDelete(MdCabangtbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnDelete(item, mapRequest);
	}
	
	@Override
	public Map<String, Object> customAfterInsert(MdCabangtbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customAfterInsert(item, mapRequest);
	}
	
	@Override
	public Map<String, Object> customAfterUpdate(MdCabangtbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customAfterUpdate(item, mapRequest);
	}
	
}
