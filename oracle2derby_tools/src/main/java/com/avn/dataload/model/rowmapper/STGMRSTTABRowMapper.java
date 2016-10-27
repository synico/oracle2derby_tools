package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STGMRSTTAB;

public class STGMRSTTABRowMapper<T> implements RowMapper<STGMRSTTAB> {

    private static final Logger log = Logger.getLogger(STGMRSTTABRowMapper.class);

	@Override
	public STGMRSTTAB mapRow(ResultSet rs, int rowNum) throws SQLException {
		STGMRSTTAB obj = new STGMRSTTAB();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTABNBR(rs.getBigDecimal("TABNBR"));
		obj.setTABNAME(rs.getString("TABNAME"));
		obj.setCOLNAME(rs.getString("COLNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
