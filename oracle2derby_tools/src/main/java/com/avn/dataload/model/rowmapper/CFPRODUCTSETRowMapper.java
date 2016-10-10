package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFPRODUCTSET;

public class CFPRODUCTSETRowMapper<T> implements RowMapper<CFPRODUCTSET> {

	@Override
	public CFPRODUCTSET mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFPRODUCTSET obj = new CFPRODUCTSET();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		obj.setCFPRODUCTSET_ID(rs.getBigDecimal("CFPRODUCTSET_ID"));
		obj.setPRODUCTSET_ID(rs.getBigDecimal("PRODUCTSET_ID"));
		
		return obj;
	}

}
