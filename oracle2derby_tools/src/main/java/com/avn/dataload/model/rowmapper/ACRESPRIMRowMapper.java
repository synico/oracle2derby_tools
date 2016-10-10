package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESPRIM;

public class ACRESPRIMRowMapper<T> implements RowMapper<ACRESPRIM> {

	@Override
	public ACRESPRIM mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESPRIM obj = new ACRESPRIM();
		
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setRESPRIMARYCOL(rs.getString("RESPRIMARYCOL"));
		
		return obj;
	}

}
