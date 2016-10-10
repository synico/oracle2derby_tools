package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRREL;

public class MBRRELRowMapper<T> implements RowMapper<MBRREL> {

	@Override
	public MBRREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRREL obj = new MBRREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setDESCENDANT_ID(rs.getBigDecimal("DESCENDANT_ID"));
		obj.setANCESTOR_ID(rs.getBigDecimal("ANCESTOR_ID"));
		
		return obj;
	}

}
