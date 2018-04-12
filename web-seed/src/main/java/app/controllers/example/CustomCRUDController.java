package app.controllers.example;

import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;

import app.models.core.master.MasterUser;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomCRUDController extends CRUDController<MasterUser> {
		
	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setFilter("is_active = ?", 0);
		params.setOrderBy("user_id");

		return super.customOnLoad(params);
	}
	
	@Override
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		params.setFilter("is_active = ?", 0);
		params.setOrderBy("user_id");
		
		return super.customOnReadAll(params);
	}

	@Override
	public MasterUser customInsertValidation(MasterUser item) throws Exception {
		String username = item.getString("username");
		Integer isActive = item.getInteger("is_active");
		
		if (Strings.isNullOrEmpty(username)) {
			throw new Exception("nilai username tidak boleh kosong!");
		}
		
		if (isActive != 0 || isActive != 1) {
			throw new Exception("nilai is_active hanya bernilai 0/1!");
		}
		
		return super.customInsertValidation(item);
	}
	
	@Override
	public MasterUser customOnInsert(MasterUser item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnInsert(item, mapRequest);
	}	
	
	@Override
	public MasterUser customOnUpdate(MasterUser item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnUpdate(item, mapRequest);
	}
	
	@Override
	public MasterUser customOnDelete(MasterUser item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnDelete(item, mapRequest);
	}
	
	@Override
	public Map<String, Object> customAfterInsert(MasterUser item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customAfterInsert(item, mapRequest);
	}
	
	@Override
	public Map<String, Object> customAfterUpdate(MasterUser item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customAfterUpdate(item, mapRequest);
	}
}
