package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdKedudukantbl;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomLOVMdKedudukantblController extends LOVController<MdKedudukantbl>{
	@Override
	public void initListOfValueModel(LOVModel model) {
		// TODO Auto-generated method stub
		model.setLovKey("kddudukan");
		model.setLovValues("nmdudukan");
	}
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnLoad(params);
	}
}
