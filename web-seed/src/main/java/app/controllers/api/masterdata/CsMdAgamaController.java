package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;

import app.models.MdAgama;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CsMdAgamaController extends CRUDController<MdAgama> {
		
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
//		params.setFilter("username = ? and is_active = ?", "Ichione", 1);
		params.setOrderBy("id");

		return super.customOnLoad(params);
	}
	
	@Override
	public CorePage customOnReadAll(PagingParams params) throws Exception {
//		params.setFilter("username = ? and is_active = ?", "Ichione", 1);
		params.setOrderBy("id");
		
		return super.customOnReadAll(params);
	}

	@Override
	public MdAgama customInsertValidation(MdAgama item) throws Exception {
		String username = item.getString("nmagama");
//		Integer isActive = item.getInteger("id");
		
		if (Strings.isNullOrEmpty(username)) {
			throw new Exception("nilai username tidak boleh kosong!");
		}
		
//		if (isActive != 0 || isActive != 1) {
//			throw new Exception("nilai is_active hanya bernilai 0/1!");
//		}
		
		return super.customInsertValidation(item);
	}
	
	@Override
	public MdAgama customOnInsert(MdAgama item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnInsert(item, mapRequest);
	}	
	
	@Override
	public MdAgama customOnUpdate(MdAgama item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnUpdate(item, mapRequest);
	}
	
	@Override
	public MdAgama customOnDelete(MdAgama item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnDelete(item, mapRequest);
	}
	
	@Override
	public Map<String, Object> customAfterInsert(MdAgama item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customAfterInsert(item, mapRequest);
	}
	
	@Override
	public Map<String, Object> customAfterUpdate(MdAgama item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customAfterUpdate(item, mapRequest);
	}
}
