package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Orgcode;

public class OrgcodeRowMapper<T> implements RowMapper<Orgcode> {

	@Override
	public Orgcode mapRow(ResultSet rs, int rowNum) throws SQLException {
		Orgcode obj = new Orgcode();
		
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOrgcodeId(rs.getBigDecimal("ORGCODE_ID"));
		obj.setCodetype(rs.getString("CODETYPE"));
		
		return obj;
	}

}
