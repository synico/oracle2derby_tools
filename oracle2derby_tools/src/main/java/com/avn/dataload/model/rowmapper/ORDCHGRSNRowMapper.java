package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDCHGRSN;

public class ORDCHGRSNRowMapper<T> implements RowMapper<ORDCHGRSN> {

    private static final Logger log = Logger.getLogger(ORDCHGRSNRowMapper.class);

	@Override
	public ORDCHGRSN mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDCHGRSN obj = new ORDCHGRSN();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setORDCHGRSN_ID(rs.getBigDecimal("ORDCHGRSN_ID"));
		obj.setREASONCODE(rs.getString("REASONCODE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
