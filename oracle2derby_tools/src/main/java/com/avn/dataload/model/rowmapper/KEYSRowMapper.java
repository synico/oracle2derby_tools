package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.KEYS;

public class KEYSRowMapper<T> implements RowMapper<KEYS> {

	@Override
	public KEYS mapRow(ResultSet rs, int rowNum) throws SQLException {
		KEYS obj = new KEYS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLOWERBOUND(rs.getBigDecimal("LOWERBOUND"));
		obj.setUPPERBOUND(rs.getBigDecimal("UPPERBOUND"));
		obj.setCOUNTER(rs.getBigDecimal("COUNTER"));
		obj.setKEYS_ID(rs.getBigDecimal("KEYS_ID"));
		obj.setTABLENAME(rs.getString("TABLENAME"));
		obj.setCOLUMNNAME(rs.getString("COLUMNNAME"));
		obj.setPREFETCHSIZE(rs.getBigDecimal("PREFETCHSIZE"));
		
		return obj;
	}

}
