package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.IcmregdescKey;

public class IcmregdescKeyRowMapper<T> implements RowMapper<IcmregdescKey> {

	@Override
	public IcmregdescKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		IcmregdescKey obj = new IcmregdescKey();
		
		obj.setMetaphortypeid(rs.getBigDecimal("METAPHORTYPEID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
