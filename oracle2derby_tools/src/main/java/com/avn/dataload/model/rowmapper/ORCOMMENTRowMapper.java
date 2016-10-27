package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORCOMMENT;

public class ORCOMMENTRowMapper<T> implements RowMapper<ORCOMMENT> {

    private static final Logger log = Logger.getLogger(ORCOMMENTRowMapper.class);

	@Override
	public ORCOMMENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORCOMMENT obj = new ORCOMMENT();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getTimestamp("FIELD3"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setORCOMMENT_ID(rs.getBigDecimal("ORCOMMENT_ID"));
		obj.setORDCHGRSN_ID(rs.getBigDecimal("ORDCHGRSN_ID"));
		obj.setSERVICEREP_ID(rs.getBigDecimal("SERVICEREP_ID"));
		obj.setORDERVERSION(rs.getBigDecimal("ORDERVERSION"));
		obj.setBUSCHN_ID(rs.getBigDecimal("BUSCHN_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
