package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.LMEVENTMAP;

public class LMEVENTMAPRowMapper<T> implements RowMapper<LMEVENTMAP> {

	@Override
	public LMEVENTMAP mapRow(ResultSet rs, int rowNum) throws SQLException {
		LMEVENTMAP obj = new LMEVENTMAP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLMSETNAME(rs.getString("LMSETNAME"));
		obj.setLMTXTYPEID(rs.getBigDecimal("LMTXTYPEID"));
		obj.setLMEVENTMAP_ID(rs.getBigDecimal("LMEVENTMAP_ID"));
		obj.setEXTEVENTNAME(rs.getString("EXTEVENTNAME"));
		obj.setEXTEVENTDESC(rs.getString("EXTEVENTDESC"));
		
		return obj;
	}

}
