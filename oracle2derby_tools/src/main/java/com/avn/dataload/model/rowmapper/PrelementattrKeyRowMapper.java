package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PrelementattrKey;

public class PrelementattrKeyRowMapper<T> implements RowMapper<PrelementattrKey> {

	@Override
	public PrelementattrKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PrelementattrKey obj = new PrelementattrKey();
		
		obj.setName(rs.getString("NAME"));
		obj.setValue(rs.getString("VALUE"));
		obj.setPrelementId(rs.getBigDecimal("PRELEMENT_ID"));
		
		return obj;
	}

}
