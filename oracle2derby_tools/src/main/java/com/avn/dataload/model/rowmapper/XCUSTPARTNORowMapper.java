package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XCUSTPARTNO;

public class XCUSTPARTNORowMapper<T> implements RowMapper<XCUSTPARTNO> {

    private static final Logger log = Logger.getLogger(XCUSTPARTNORowMapper.class);

	@Override
	public XCUSTPARTNO mapRow(ResultSet rs, int rowNum) throws SQLException {
		XCUSTPARTNO obj = new XCUSTPARTNO();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setXCUSTPARTNO_ID(rs.getBigDecimal("XCUSTPARTNO_ID"));
		obj.setCUSTPARTNO(rs.getString("CUSTPARTNO"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
