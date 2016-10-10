package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STRELTYP;

public class STRELTYPRowMapper<T> implements RowMapper<STRELTYP> {

	@Override
	public STRELTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STRELTYP obj = new STRELTYP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTRELTYP_ID(rs.getBigDecimal("STRELTYP_ID"));
		
		return obj;
	}

}
