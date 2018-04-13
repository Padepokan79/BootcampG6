package app.models.core.master;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

import com.Ostermiller.util.MD5;

@Table("users")
@IdName("id")
public class Users extends Model {
	public void beforeSave(){
		set("password", encryptPassword());
	}   
	
	public void beforeCreate(){
		set("password", encryptPassword());
	}  
	
	private String encryptPassword(){		
		return MD5.getHashString(get("password").toString());
	}

}
