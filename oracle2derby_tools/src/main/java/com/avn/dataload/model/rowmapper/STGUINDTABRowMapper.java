package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STGUINDTAB;

public class STGUINDTABRowMapper<T> implements RowMapper<STGUINDTAB> {

	@Override
	public STGUINDTAB mapRow(ResultSet rs, int rowNum) throws SQLException {
		STGUINDTAB obj = new STGUINDTAB();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTABNAME(rs.getString("TABNAME"));
		
		return obj;
	}

}
