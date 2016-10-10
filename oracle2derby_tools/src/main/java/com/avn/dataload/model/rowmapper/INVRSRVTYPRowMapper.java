package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.INVRSRVTYP;

public class INVRSRVTYPRowMapper<T> implements RowMapper<INVRSRVTYP> {

	@Override
	public INVRSRVTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		INVRSRVTYP obj = new INVRSRVTYP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setINVRSRVTYP_ID(rs.getBigDecimal("INVRSRVTYP_ID"));
		
		return obj;
	}

}
