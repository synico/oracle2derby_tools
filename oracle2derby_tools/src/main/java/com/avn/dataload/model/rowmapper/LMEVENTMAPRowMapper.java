package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.LMEVENTMAP;

public class LMEVENTMAPRowMapper<T> implements RowMapper<LMEVENTMAP> {

    private static final Logger log = Logger.getLogger(LMEVENTMAPRowMapper.class);

	@Override
	public LMEVENTMAP mapRow(ResultSet rs, int rowNum) throws SQLException {
		LMEVENTMAP obj = new LMEVENTMAP();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLMEVENTMAP_ID(rs.getBigDecimal("LMEVENTMAP_ID"));
		obj.setEXTEVENTNAME(rs.getString("EXTEVENTNAME"));
		obj.setEXTEVENTDESC(rs.getString("EXTEVENTDESC"));
		obj.setLMSETNAME(rs.getString("LMSETNAME"));
		obj.setLMTXTYPEID(rs.getBigDecimal("LMTXTYPEID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
