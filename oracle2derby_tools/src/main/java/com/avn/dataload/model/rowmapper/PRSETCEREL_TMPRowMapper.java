package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRSETCEREL_TMP;

public class PRSETCEREL_TMPRowMapper<T> implements RowMapper<PRSETCEREL_TMP> {

	@Override
	public PRSETCEREL_TMP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRSETCEREL_TMP obj = new PRSETCEREL_TMP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setPRODUCTSET_ID(rs.getBigDecimal("PRODUCTSET_ID"));
		
		return obj;
	}

}
