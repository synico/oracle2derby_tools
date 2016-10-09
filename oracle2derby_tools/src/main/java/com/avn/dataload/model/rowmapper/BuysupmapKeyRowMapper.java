package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.BuysupmapKey;

public class BuysupmapKeyRowMapper<T> implements RowMapper<BuysupmapKey> {

	@Override
	public BuysupmapKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		BuysupmapKey obj = new BuysupmapKey();
		
		obj.setBuyorgunitId(rs.getBigDecimal("BUYORGUNIT_ID"));
		obj.setProcprotclId(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setSuporgId(rs.getBigDecimal("SUPORG_ID"));
		
		return obj;
	}

}
