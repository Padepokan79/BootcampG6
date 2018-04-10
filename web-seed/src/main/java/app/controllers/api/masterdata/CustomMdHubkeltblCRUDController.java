package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdHubkeltbl;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdHubkeltblCRUDController extends CRUDController<MdHubkeltbl> {
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		params.setFilter("NMHUBKEL = ?", "ANAK");
		
		return super.customOnLoad(params);
	}
	
	@Override
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
//		params.setFilter("NMHUBKEL = ?", "ANAK");
		
		return super.customOnReadAll(params);
	}
	
	@Override
	public MdHubkeltbl customOnInsert(MdHubkeltbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnInsert(item, mapRequest);
	}
	
	@Override
	public MdHubkeltbl customOnDelete(MdHubkeltbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnDelete(item, mapRequest);
	}
	
	@Override
	public MdHubkeltbl customOnUpdate(MdHubkeltbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnUpdate(item, mapRequest);
	}
	
	@Override
	public Map<String, Object> customAfterInsert(MdHubkeltbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customAfterInsert(item, mapRequest);
	}
	
	@Override
	public Map<String, Object> customAfterUpdate(MdHubkeltbl item, Map<String, Object> mapRequest) throws Exception {
		// TODO Auto-generated method stub
		return super.customAfterUpdate(item, mapRequest);
	}

}
