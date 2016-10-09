package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.TrdtypedscKey;

public class TrdtypedscKeyRowMapper<T> implements RowMapper<TrdtypedscKey> {

	@Override
	public TrdtypedscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		TrdtypedscKey obj = new TrdtypedscKey();
		
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setTrdtypeId(rs.getBigDecimal("TRDTYPE_ID"));
		
		return obj;
	}

}
