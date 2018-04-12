package app.controllers.lov;

import java.util.List;
import java.util.Map;

import app.models.MdJenisDidik;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomLOVJenisDidikController extends LOVController<MdJenisDidik> {
	
	public void initListOfValueModel(LOVModel model) {
		model.setLovKey("jnsdidik");
		model.setLovValues("nmjenisdidik");
	}
	
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setFilter("jnsdidik < ?", 8);
		params.setOrderBy("nmjenisdidik");
		
		return super.customOnLoad(params);
	}
}