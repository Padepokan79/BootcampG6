package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;

import app.models.MdGurutbl;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdGurutblCRUDController extends CRUDController<MdGurutbl>{

	@Override
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		
		params.setOrderBy("KDGURU");
		
		return super.customOnLoad(params);
		
	}
	
	@Override
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		
		params.setOrderBy("KDGURU");
		
		return super.customOnReadAll(params);
		
	}
	
	@Override
	public MdGurutbl customInsertValidation(MdGurutbl item) throws Exception {
		String tmtBerlaku = item.getString("tmtBerlaku");
		String kdGuru = item.getString("kdGuru");
		
		if (Strings.isNullOrEmpty(tmtBerlaku)) {
			throw new Exception("TMT-Berlaku tidak boleh kosong!");
		}
		
		if (Strings.isNullOrEmpty(kdGuru)) {
			throw new Exception("Kode guru tidak boleh kosong!");
		}
		
		
		return super.customInsertValidation(item);
	}
	
	@Override
	public MdGurutbl customOnInsert(MdGurutbl item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnInsert(item, mapRequest);
		
	}
	
	@Override
	public MdGurutbl customOnUpdate(MdGurutbl item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnUpdate(item, mapRequest);
		
	}
	
	@Override
	public MdGurutbl customOnDelete(MdGurutbl item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnDelete(item, mapRequest);
		
	}
	
}
