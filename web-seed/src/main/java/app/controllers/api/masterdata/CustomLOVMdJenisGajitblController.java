package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdJenisGajitbl;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomLOVMdJenisGajitblController extends LOVController<MdJenisGajitbl> {
	
	public void initListOfValueModel(LOVModel model) {
		model.setLovKey("kdgaji");
		model.setLovValues("nmgaji");
	}
	
	public List<Map<String, Object>> CustomOnload(PagingParams params) throws Exception {
		params.setFilter("kdgaji < ", 5);
		
		return super.customOnLoad(params);
	}

}
