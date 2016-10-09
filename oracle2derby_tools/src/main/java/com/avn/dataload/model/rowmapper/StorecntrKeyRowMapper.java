package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.StorecntrKey;

public class StorecntrKeyRowMapper<T> implements RowMapper<StorecntrKey> {

	@Override
	public StorecntrKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		StorecntrKey obj = new StorecntrKey();
		
		obj.setContractId(rs.getBigDecimal("CONTRACT_ID"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		
		return obj;
	}

}
