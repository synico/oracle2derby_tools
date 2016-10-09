package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Subkeys;

public class SubkeysRowMapper<T> implements RowMapper<Subkeys> {

	@Override
	public Subkeys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Subkeys obj = new Subkeys();
		
		obj.setPrefetchsize(rs.getBigDecimal("PREFETCHSIZE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCounter(rs.getBigDecimal("COUNTER"));
		obj.setTablename(rs.getString("TABLENAME"));
		obj.setColumnname(rs.getString("COLUMNNAME"));
		obj.setLowerbound(rs.getBigDecimal("LOWERBOUND"));
		obj.setUpperbound(rs.getBigDecimal("UPPERBOUND"));
		obj.setSubkeysId(rs.getBigDecimal("SUBKEYS_ID"));
		
		return obj;
	}

}
