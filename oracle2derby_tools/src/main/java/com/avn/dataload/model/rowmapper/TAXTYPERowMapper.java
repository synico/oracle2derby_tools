package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TAXTYPE;

public class TAXTYPERowMapper<T> implements RowMapper<TAXTYPE> {

	@Override
	public TAXTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		TAXTYPE obj = new TAXTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setTXCDSCHEME_ID(rs.getBigDecimal("TXCDSCHEME_ID"));
		obj.setTAXTYPE_ID(rs.getBigDecimal("TAXTYPE_ID"));
		
		return obj;
	}

}
