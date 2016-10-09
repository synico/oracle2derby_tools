package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.OrdchgrsndsKey;

public class OrdchgrsndsKeyRowMapper<T> implements RowMapper<OrdchgrsndsKey> {

	@Override
	public OrdchgrsndsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrdchgrsndsKey obj = new OrdchgrsndsKey();
		
		obj.setOrdchgrsnId(rs.getBigDecimal("ORDCHGRSN_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
