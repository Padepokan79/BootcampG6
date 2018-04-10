package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;

import app.models.MdJenisDidik;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomJenisDidikController extends CRUDController<MdJenisDidik> {
	
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setFilter("jnsdidik > ?", 6);
		params.setOrderBy("nmjenisdidik");
		
		return super.customOnLoad(params);
	}
	
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		params.setFilter("jnsdidik < ?", 6);
		params.setOrderBy("nmjenisdidik");
		
		return super.customOnReadAll(params);
	}
	
	public MdJenisDidik customInsertValidation(MdJenisDidik item) throws Exception {
		Integer jnsdidik = item.getInteger("jnsdidik");
		String nmjenisdidik = item.getString("nmjenisdidik");
		
		if(Strings.isNullOrEmpty(nmjenisdidik)) {
			throw new Exception("Nilai Nama Jenis Didik tidak boleh kosong!");
		}
		
		if(jnsdidik < 0) {
			throw new Exception("Nilai Jenis Didik Tidak Boleh Minus!");
		}
		
		return super.customInsertValidation(item);
	}

	public MdJenisDidik customOnInsert(MdJenisDidik item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnInsert(item, mapRequest);
	}

	public MdJenisDidik customOnUpdate(MdJenisDidik item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnUpdate(item, mapRequest);
	}
	
	public MdJenisDidik customOnDelete(MdJenisDidik item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnDelete(item, mapRequest);
	}
	
	public Map<String, Object> customAfterInsert(MdJenisDidik item, Map<String, Object> mapRequest) throws Exception {

		return super.customAfterInsert(item, mapRequest);
	}
	
	public Map<String, Object> customAfterUpdate(MdJenisDidik item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customAfterUpdate(item, mapRequest);
	}
}