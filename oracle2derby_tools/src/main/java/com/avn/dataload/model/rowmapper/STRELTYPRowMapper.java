package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STRELTYP;

public class STRELTYPRowMapper<T> implements RowMapper<STRELTYP> {

    private static final Logger log = Logger.getLogger(STRELTYPRowMapper.class);

	@Override
	public STRELTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STRELTYP obj = new STRELTYP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTRELTYP_ID(rs.getBigDecimal("STRELTYP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
