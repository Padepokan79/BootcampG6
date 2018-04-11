package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdPangkattbl;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomMdPangkattblLOVController extends LOVController<MdPangkattbl> {
	
	@Override
	public void initListOfValueModel(LOVModel model) {
		model.setLovKey("kdpangkat");
		model.setLovValues("nmpangkat");
		// TODO Auto-generated method stub
	}
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnLoad(params);
	}

}
