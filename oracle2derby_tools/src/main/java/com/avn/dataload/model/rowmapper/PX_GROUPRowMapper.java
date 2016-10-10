package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_GROUP;

public class PX_GROUPRowMapper<T> implements RowMapper<PX_GROUP> {

	@Override
	public PX_GROUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_GROUP obj = new PX_GROUP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setGRPNAME(rs.getString("GRPNAME"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setPX_GROUP_ID(rs.getBigDecimal("PX_GROUP_ID"));
		obj.setXMLPARAM(rs.getClob("XMLPARAM"));
		
		return obj;
	}

}
