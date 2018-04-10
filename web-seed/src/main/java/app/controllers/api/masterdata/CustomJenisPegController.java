package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import com.google.common.base.Strings;

import app.models.MdJenisPeg;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomJenisPegController extends CRUDController<MdJenisPeg> {

	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setFilter("kd_jns > ?", 1);
		params.setOrderBy("nm_jns");
		
		return super.customOnLoad(params);
	}
	
	public CorePage customOnReadAll(PagingParams params) throws Exception {
		params.setFilter("kd_jns > ?", 1);
		params.setOrderBy("nm_jns");
		
		return super.customOnReadAll(params);
	}
	
	public MdJenisPeg customInsertValidation(MdJenisPeg item) throws Exception {
		String nmJns = item.getString("nm_jns");
		Integer kdJns = item.getInteger("kd_jns");
		
		if (Strings.isNullOrEmpty(nmJns)) {
			throw new Exception("Nilai Nama Jenis tidak boleh kosong!");
		}
		if (kdJns < 0) {
			throw new Exception("Nilai Kode Jenis tidak boleh kurang dari 0!");
		}
		
		return super.customInsertValidation(item);
	}
	
	public MdJenisPeg customOnInsert(MdJenisPeg item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnInsert(item, mapRequest);
	}
	
	public MdJenisPeg customOnUpdate(MdJenisPeg item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnUpdate(item, mapRequest);
	}
	
	public MdJenisPeg customOnDelete(MdJenisPeg item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customOnDelete(item, mapRequest);
	}
	
	public Map<String, Object> customAfterInsert(MdJenisPeg item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customAfterInsert(item, mapRequest);
	}
	
	public Map<String, Object> customAfterUpdate(MdJenisPeg item, Map<String, Object> mapRequest) throws Exception {
		
		return super.customAfterUpdate(item, mapRequest);
	}
}