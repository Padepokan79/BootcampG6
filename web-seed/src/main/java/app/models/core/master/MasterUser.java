package app.models.core.master;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

import com.Ostermiller.util.MD5;

/*	Table Query

	CREATE TABLE master_user
	(
	  user_id integer NOT NULL,
	  username character varying(50),
	  password character varying(255),
	  is_active smallint,
	  CONSTRAINT user_id_pk PRIMARY KEY (user_id),
	  CONSTRAINT username_unique UNIQUE (username)
	)
	WITH (
	  OIDS=FALSE
	);
	ALTER TABLE master_user
	  OWNER TO postgres;
 */

@Table("master_user")
@IdName("user_id")
public class MasterUser extends Model {
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
