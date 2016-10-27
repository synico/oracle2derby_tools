package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STGUINDTAB;

public class STGUINDTABRowMapper<T> implements RowMapper<STGUINDTAB> {

    private static final Logger log = Logger.getLogger(STGUINDTABRowMapper.class);

	@Override
	public STGUINDTAB mapRow(ResultSet rs, int rowNum) throws SQLException {
		STGUINDTAB obj = new STGUINDTAB();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTABNAME(rs.getString("TABNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
