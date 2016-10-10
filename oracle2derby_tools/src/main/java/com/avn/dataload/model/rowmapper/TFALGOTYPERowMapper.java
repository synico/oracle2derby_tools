package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TFALGOTYPE;

public class TFALGOTYPERowMapper<T> implements RowMapper<TFALGOTYPE> {

	@Override
	public TFALGOTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		TFALGOTYPE obj = new TFALGOTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTFALGOTYPE_ID(rs.getBigDecimal("TFALGOTYPE_ID"));
		
		return obj;
	}

}
