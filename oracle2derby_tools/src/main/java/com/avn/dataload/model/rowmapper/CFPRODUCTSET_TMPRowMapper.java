package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFPRODUCTSET_TMP;

public class CFPRODUCTSET_TMPRowMapper<T> implements RowMapper<CFPRODUCTSET_TMP> {

	@Override
	public CFPRODUCTSET_TMP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFPRODUCTSET_TMP obj = new CFPRODUCTSET_TMP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		obj.setCFPRODUCTSET_ID(rs.getBigDecimal("CFPRODUCTSET_ID"));
		obj.setPRODUCTSET_ID(rs.getBigDecimal("PRODUCTSET_ID"));
		
		return obj;
	}

}
