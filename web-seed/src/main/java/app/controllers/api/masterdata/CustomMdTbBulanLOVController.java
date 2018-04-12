package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdTbBulan;
import core.io.model.LOVModel;
import core.io.model.PagingParams;
import core.javalite.controllers.LOVController;

public class CustomMdTbBulanLOVController extends LOVController<MdTbBulan> {

	@Override
	public void initListOfValueModel(LOVModel model) {
		// TODO Auto-generated method stub
		model.setLovKey("kdbulan");
		model.setLovValues("nmbulan");
	}
	
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setOrderBy("kdbulan");
		return super.customOnLoad(params);
	}

}
