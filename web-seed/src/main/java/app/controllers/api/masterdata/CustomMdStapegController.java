package app.controllers.api.masterdata;

import java.util.List;
import java.util.Map;

import app.models.MdStapeg;
import core.io.model.CorePage;
import core.io.model.PagingParams;
import core.javalite.controllers.CRUDController;

public class CustomMdStapegController extends CRUDController<MdStapeg> {
	
	public List<Map<String, Object>> customOnLoad(PagingParams params) throws Exception {
		params.setFilter("nmstapeg = ? and kd_jns_peg = ?","pegawai tugas belajar", 2);
		params.setOrderBy("kdstapeg");
		
		return super.customOnLoad(params);
	}
	
	public CorePage customOnReadAll(PagingParams params)throws Exception{
		params.setFilter("nmstapeg = ? and kd_jns_peg = ?","pegawai tugas belajar", 2);
		params.setOrderBy("kdstapeg");
		
		return super.customOnReadAll(params);
	}
	
	public MdStapeg customInsertValidation(MdStapeg item) throws Exception{
		Integer statusPeg = item.getInteger("kd_jns_peg");
		
		if (statusPeg != 1 || statusPeg != 2 || statusPeg != 3 || statusPeg != 4) {
			throw new Exception ("Nilai status_peg dari 1-4");
		}
		
		return super.customInsertValidation(item);
	}
	
	public MdStapeg customOnInsert(MdStapeg item, Map<String, Object> mapRequest) throws Exception  {
		
		return super.customOnInsert(item, mapRequest);
	}
	
	public MdStapeg customOnUpdate(MdStapeg item, Map<String, Object> mapRequest) throws Exception{
		
		return super.customOnUpdate(item, mapRequest);
	}
	
	public MdStapeg customOnDelete(MdStapeg item, Map<String, Object> mapRequest) throws Exception{
		
		return super.customOnDelete(item, mapRequest);
	}
	
	public Map<String, Object> customAfterInsert (MdStapeg item, Map<String, Object> mapRequest) throws Exception{
		
		return super.customAfterInsert(item, mapRequest);
	}
	
	public Map<String, Object> customAfterUpdate (MdStapeg item, Map<String, Object> mapRequest) throws Exception{
		
		return super.customAfterUpdate(item, mapRequest);
	}
}
