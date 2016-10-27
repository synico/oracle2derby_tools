package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.REFKEYS;

public class REFKEYSRowMapper<T> implements RowMapper<REFKEYS> {

    private static final Logger log = Logger.getLogger(REFKEYSRowMapper.class);

	@Override
	public REFKEYS mapRow(ResultSet rs, int rowNum) throws SQLException {
		REFKEYS obj = new REFKEYS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFKTABLE_NAME(rs.getString("FKTABLE_NAME"));
		obj.setFKCOLUMN_NAME(rs.getString("FKCOLUMN_NAME"));
		obj.setTABLENAME(rs.getString("TABLENAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
