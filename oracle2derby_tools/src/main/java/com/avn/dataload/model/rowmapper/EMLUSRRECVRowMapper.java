package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLUSRRECV;

public class EMLUSRRECVRowMapper<T> implements RowMapper<EMLUSRRECV> {

	@Override
	public EMLUSRRECV mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLUSRRECV obj = new EMLUSRRECV();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setRECEIVEEML(rs.getBigDecimal("RECEIVEEML"));
		obj.setRECEIVESMS(rs.getBigDecimal("RECEIVESMS"));
		
		return obj;
	}

}
