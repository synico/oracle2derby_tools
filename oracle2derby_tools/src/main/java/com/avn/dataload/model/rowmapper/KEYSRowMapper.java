package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.KEYS;

public class KEYSRowMapper<T> implements RowMapper<KEYS> {

    private static final Logger log = Logger.getLogger(KEYSRowMapper.class);

	@Override
	public KEYS mapRow(ResultSet rs, int rowNum) throws SQLException {
		KEYS obj = new KEYS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPREFETCHSIZE(rs.getBigDecimal("PREFETCHSIZE"));
		obj.setKEYS_ID(rs.getBigDecimal("KEYS_ID"));
		obj.setTABLENAME(rs.getString("TABLENAME"));
		obj.setCOLUMNNAME(rs.getString("COLUMNNAME"));
		obj.setLOWERBOUND(rs.getBigDecimal("LOWERBOUND"));
		obj.setUPPERBOUND(rs.getBigDecimal("UPPERBOUND"));
		obj.setCOUNTER(rs.getBigDecimal("COUNTER"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
