package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.OrdadjdscKey;

public class OrdadjdscKeyRowMapper<T> implements RowMapper<OrdadjdscKey> {

	@Override
	public OrdadjdscKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrdadjdscKey obj = new OrdadjdscKey();
		
		obj.setOrdadjustId(rs.getBigDecimal("ORDADJUST_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
