package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CmdregKey;

public class CmdregKeyRowMapper<T> implements RowMapper<CmdregKey> {

	@Override
	public CmdregKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmdregKey obj = new CmdregKey();
		
		obj.setInterfacename(rs.getString("INTERFACENAME"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
