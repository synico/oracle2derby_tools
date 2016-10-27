package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLUSRRECV;

public class EMLUSRRECVRowMapper<T> implements RowMapper<EMLUSRRECV> {

    private static final Logger log = Logger.getLogger(EMLUSRRECVRowMapper.class);

	@Override
	public EMLUSRRECV mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLUSRRECV obj = new EMLUSRRECV();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setRECEIVEEML(rs.getBigDecimal("RECEIVEEML"));
		obj.setRECEIVESMS(rs.getBigDecimal("RECEIVESMS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
