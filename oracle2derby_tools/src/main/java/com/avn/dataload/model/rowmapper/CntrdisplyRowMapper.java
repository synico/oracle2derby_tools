package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cntrdisply;

public class CntrdisplyRowMapper<T> implements RowMapper<Cntrdisply> {

	@Override
	public Cntrdisply mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cntrdisply obj = new Cntrdisply();
		
		obj.setContractId(rs.getBigDecimal("CONTRACT_ID"));
		obj.setPartroleId(rs.getBigDecimal("PARTROLE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCntrdisplyId(rs.getBigDecimal("CNTRDISPLY_ID"));
		obj.setDevicefmtId(rs.getBigDecimal("DEVICEFMT_ID"));
		obj.setDisplaypagename(rs.getString("DISPLAYPAGENAME"));
		
		return obj;
	}

}
