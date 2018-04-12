package app.controllers.lov;

import java.util.List;
import java.util.Map;

import app.models.MdAkuntbl;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomLOVMdAkuntblController extends LOVController<MdAkuntbl>{
	@Override
	public void initListOfValueModel(LOVModel model) {
		// TODO Auto-generated method stub
		model.setLovKey("kdtrans");
		model.setLovValues("nmakun");
	}
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		// TODO Auto-generated method stub
		return super.customOnLoad(params);
	}
}
