package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ProcbuyprfKey;

public class ProcbuyprfKeyRowMapper<T> implements RowMapper<ProcbuyprfKey> {

	@Override
	public ProcbuyprfKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProcbuyprfKey obj = new ProcbuyprfKey();
		
		obj.setProcprotclId(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		
		return obj;
	}

}
