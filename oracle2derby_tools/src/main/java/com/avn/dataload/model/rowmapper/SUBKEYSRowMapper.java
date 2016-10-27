package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SUBKEYS;

public class SUBKEYSRowMapper<T> implements RowMapper<SUBKEYS> {

    private static final Logger log = Logger.getLogger(SUBKEYSRowMapper.class);

	@Override
	public SUBKEYS mapRow(ResultSet rs, int rowNum) throws SQLException {
		SUBKEYS obj = new SUBKEYS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPREFETCHSIZE(rs.getBigDecimal("PREFETCHSIZE"));
		obj.setTABLENAME(rs.getString("TABLENAME"));
		obj.setCOLUMNNAME(rs.getString("COLUMNNAME"));
		obj.setLOWERBOUND(rs.getBigDecimal("LOWERBOUND"));
		obj.setUPPERBOUND(rs.getBigDecimal("UPPERBOUND"));
		obj.setCOUNTER(rs.getBigDecimal("COUNTER"));
		obj.setSUBKEYS_ID(rs.getBigDecimal("SUBKEYS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
