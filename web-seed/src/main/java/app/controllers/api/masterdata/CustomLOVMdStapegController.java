package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdStapeg;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomLOVMdStapegController extends LOVController<MdStapeg> {
	
	@Override
	public void initListOfValueModel(LOVModel model) {
		// TODO Auto-generated method stub
		model.setLovKey("kdstapeg");
		model.setLovValues("nmstapeg");
	}
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setFilter("kd_jns_peg = ?", 2);
		params.setOrderBy("nmstapeg");
		
		return super.customOnLoad(params);
	}
}
