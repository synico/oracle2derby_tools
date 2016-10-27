package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRROLE;

public class MBRROLERowMapper<T> implements RowMapper<MBRROLE> {

    private static final Logger log = Logger.getLogger(MBRROLERowMapper.class);

	@Override
	public MBRROLE mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRROLE obj = new MBRROLE();
		
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setROLE_ID(rs.getBigDecimal("ROLE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
