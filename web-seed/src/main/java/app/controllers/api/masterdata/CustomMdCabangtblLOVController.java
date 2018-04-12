package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdCabangtbl;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomMdCabangtblLOVController extends LOVController<MdCabangtbl> {
	
	@Override
	public void initListOfValueModel(LOVModel model) {
		// TODO Auto-generated method stub
		model.setLovKey("kdcabang");
		model.setLovValues("nmcabang");
	}
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnLoad(params);
	}

}
