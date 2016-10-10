package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRROLE;

public class MBRROLERowMapper<T> implements RowMapper<MBRROLE> {

	@Override
	public MBRROLE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRROLE obj = new MBRROLE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setROLE_ID(rs.getBigDecimal("ROLE_ID"));
		
		return obj;
	}

}
