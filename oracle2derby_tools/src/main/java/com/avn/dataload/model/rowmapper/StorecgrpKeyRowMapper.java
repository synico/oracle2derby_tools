package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorecgrpKey;

public class StorecgrpKeyRowMapper<T> implements RowMapper<StorecgrpKey> {

	@Override
	public StorecgrpKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorecgrpKey obj = new StorecgrpKey();
		
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
