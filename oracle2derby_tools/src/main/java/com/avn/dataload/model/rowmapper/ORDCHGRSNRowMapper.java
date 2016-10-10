package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDCHGRSN;

public class ORDCHGRSNRowMapper<T> implements RowMapper<ORDCHGRSN> {

	@Override
	public ORDCHGRSN mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDCHGRSN obj = new ORDCHGRSN();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setREASONCODE(rs.getString("REASONCODE"));
		obj.setORDCHGRSN_ID(rs.getBigDecimal("ORDCHGRSN_ID"));
		
		return obj;
	}

}
