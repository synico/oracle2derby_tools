package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SRCHPROPRELV;

public class SRCHPROPRELVRowMapper<T> implements RowMapper<SRCHPROPRELV> {

	@Override
	public SRCHPROPRELV mapRow(ResultSet rs, int rowNum) throws SQLException {
		SRCHPROPRELV obj = new SRCHPROPRELV();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		obj.setSRCHPROPRELV_ID(rs.getBigDecimal("SRCHPROPRELV_ID"));
		obj.setRELVALUE(rs.getBigDecimal("RELVALUE"));
		obj.setINDEXFIELD(rs.getString("INDEXFIELD"));
		
		return obj;
	}

}
