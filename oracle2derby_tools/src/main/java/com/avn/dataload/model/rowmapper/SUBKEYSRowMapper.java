package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SUBKEYS;

public class SUBKEYSRowMapper<T> implements RowMapper<SUBKEYS> {

	@Override
	public SUBKEYS mapRow(ResultSet rs, int rowNum) throws SQLException {
		SUBKEYS obj = new SUBKEYS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLOWERBOUND(rs.getBigDecimal("LOWERBOUND"));
		obj.setUPPERBOUND(rs.getBigDecimal("UPPERBOUND"));
		obj.setCOUNTER(rs.getBigDecimal("COUNTER"));
		obj.setTABLENAME(rs.getString("TABLENAME"));
		obj.setCOLUMNNAME(rs.getString("COLUMNNAME"));
		obj.setPREFETCHSIZE(rs.getBigDecimal("PREFETCHSIZE"));
		obj.setSUBKEYS_ID(rs.getBigDecimal("SUBKEYS_ID"));
		
		return obj;
	}

}
