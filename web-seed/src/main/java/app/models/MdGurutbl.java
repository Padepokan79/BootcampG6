package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.Table;

@Table ("guru_tbl")
@CompositePK ({"tmtberlaku", "kdguru"})

public class MdGurutbl extends Model {

}
