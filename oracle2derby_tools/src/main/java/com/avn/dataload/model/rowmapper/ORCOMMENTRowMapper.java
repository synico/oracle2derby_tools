package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORCOMMENT;

public class ORCOMMENTRowMapper<T> implements RowMapper<ORCOMMENT> {

	@Override
	public ORCOMMENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORCOMMENT obj = new ORCOMMENT();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getTimestamp("FIELD3"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setBUSCHN_ID(rs.getBigDecimal("BUSCHN_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setORCOMMENT_ID(rs.getBigDecimal("ORCOMMENT_ID"));
		obj.setORDCHGRSN_ID(rs.getBigDecimal("ORDCHGRSN_ID"));
		obj.setSERVICEREP_ID(rs.getBigDecimal("SERVICEREP_ID"));
		obj.setORDERVERSION(rs.getBigDecimal("ORDERVERSION"));
		
		return obj;
	}

}
