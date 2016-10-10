package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.REFKEYS;

public class REFKEYSRowMapper<T> implements RowMapper<REFKEYS> {

	@Override
	public REFKEYS mapRow(ResultSet rs, int rowNum) throws SQLException {
		REFKEYS obj = new REFKEYS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTABLENAME(rs.getString("TABLENAME"));
		obj.setFKTABLE_NAME(rs.getString("FKTABLE_NAME"));
		obj.setFKCOLUMN_NAME(rs.getString("FKCOLUMN_NAME"));
		
		return obj;
	}

}
