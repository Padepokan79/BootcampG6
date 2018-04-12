package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.Table;

@Table ("fungsional_tbl")
@CompositePK ({"tmt_fungsi","kdfungsi"})

public class MdFungsional extends Model {

}
