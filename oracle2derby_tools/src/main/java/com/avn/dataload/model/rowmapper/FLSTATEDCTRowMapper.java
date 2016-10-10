package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLSTATEDCT;

public class FLSTATEDCTRowMapper<T> implements RowMapper<FLSTATEDCT> {

	@Override
	public FLSTATEDCT mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLSTATEDCT obj = new FLSTATEDCT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getBigDecimal("IDENTIFIER"));
		obj.setFLOWTYPE_ID(rs.getBigDecimal("FLOWTYPE_ID"));
		obj.setFLSTATEDCT_ID(rs.getBigDecimal("FLSTATEDCT_ID"));
		obj.setFLSTATEGP_ID(rs.getBigDecimal("FLSTATEGP_ID"));
		obj.setAPPROVERMBRGRPNAME(rs.getString("APPROVERMBRGRPNAME"));
		obj.setSTATENAME(rs.getString("STATENAME"));
		obj.setSTATETYPE(rs.getBigDecimal("STATETYPE"));
		
		return obj;
	}

}
