package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Keys;

public class KeysRowMapper<T> implements RowMapper<Keys> {

	@Override
	public Keys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Keys obj = new Keys();
		
		obj.setPrefetchsize(rs.getBigDecimal("PREFETCHSIZE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCounter(rs.getBigDecimal("COUNTER"));
		obj.setKeysId(rs.getBigDecimal("KEYS_ID"));
		obj.setTablename(rs.getString("TABLENAME"));
		obj.setColumnname(rs.getString("COLUMNNAME"));
		obj.setLowerbound(rs.getBigDecimal("LOWERBOUND"));
		obj.setUpperbound(rs.getBigDecimal("UPPERBOUND"));
		
		return obj;
	}

}
