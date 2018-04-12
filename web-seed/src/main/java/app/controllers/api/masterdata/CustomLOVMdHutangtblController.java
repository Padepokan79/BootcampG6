package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdHutangtbl;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomLOVMdHutangtblController extends LOVController<MdHutangtbl> {
	
	public void initListOfValueModel(LOVModel model) {
		model.setLovKey("kdhutang");
		model.setLovValues("nmhutang");
	}
	
	public List<Map<String, Object>> CustomOnload(PagingParams params) throws Exception {
		params.setFilter("kdhutang = ?", 2);
		
		return super.customOnLoad(params);
	}

}
