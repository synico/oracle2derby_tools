package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESPRIM;

public class ACRESPRIMRowMapper<T> implements RowMapper<ACRESPRIM> {

    private static final Logger log = Logger.getLogger(ACRESPRIMRowMapper.class);

	@Override
	public ACRESPRIM mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESPRIM obj = new ACRESPRIM();
		
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setRESPRIMARYCOL(rs.getString("RESPRIMARYCOL"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
