package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_GROUP;

public class PX_GROUPRowMapper<T> implements RowMapper<PX_GROUP> {

    private static final Logger log = Logger.getLogger(PX_GROUPRowMapper.class);

	@Override
	public PX_GROUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_GROUP obj = new PX_GROUP();
		
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setGRPNAME(rs.getString("GRPNAME"));
		obj.setPX_GROUP_ID(rs.getBigDecimal("PX_GROUP_ID"));
		obj.setXMLPARAM(rs.getClob("XMLPARAM"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
