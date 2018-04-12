package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.BelongsToParents;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("md_pegawai")
@IdName("nip")
@BelongsToParents({
	@BelongsTo(foreignKeyName="kdstapeg", parent=Stapegtbl.class),
	@BelongsTo(foreignKeyName="kdagama", parent=Agamatbl.class)
})
public class MdPegawai extends Model {

}
