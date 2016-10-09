package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CmftskmbrelKey;

public class CmftskmbrelKeyRowMapper<T> implements RowMapper<CmftskmbrelKey> {

	@Override
	public CmftskmbrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmftskmbrelKey obj = new CmftskmbrelKey();
		
		obj.setCmftaskId(rs.getBigDecimal("CMFTASK_ID"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		
		return obj;
	}

}
