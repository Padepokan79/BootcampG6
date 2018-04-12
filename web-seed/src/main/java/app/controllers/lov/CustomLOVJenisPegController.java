package app.controllers.lov;

import java.util.List;
import java.util.Map;

import app.models.MdJenisPeg;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomLOVJenisPegController extends LOVController<MdJenisPeg> {
	
	public void initListOfValueModel(LOVModel model) {
		model.setLovKey("kd_jns");
		model.setLovValues("nm_jns");
	}
	
	public List<Map<String, Object>> customOnLoad(PagingParams paramas) throws Exception {
		paramas.setFilter("kd_jns > ?", 1);
		paramas.setOrderBy("nm_jns");
		
		return super.customOnLoad(paramas);
	}
}
