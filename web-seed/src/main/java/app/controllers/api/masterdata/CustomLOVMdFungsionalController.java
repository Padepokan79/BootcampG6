package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdFungsional;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomLOVMdFungsionalController extends LOVController<MdFungsional>{
	@Override
	public void initListOfValueModel(LOVModel model) {
		model.setLovKey("kdfungsi");
		model.setLovValues("nm_fungsi","rp_fungsi");
		
	}
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setFilter("kdfungsi = ? and rp_fungsi > ?", "C031", 1000000);
		params.setOrderBy("kdfungsi");
		return super.customOnLoad(params);
	}
}
