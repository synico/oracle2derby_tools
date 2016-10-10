package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XCUSTPARTNO;

public class XCUSTPARTNORowMapper<T> implements RowMapper<XCUSTPARTNO> {

	@Override
	public XCUSTPARTNO mapRow(ResultSet rs, int rowNum) throws SQLException {
		XCUSTPARTNO obj = new XCUSTPARTNO();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setCUSTPARTNO(rs.getString("CUSTPARTNO"));
		obj.setXCUSTPARTNO_ID(rs.getBigDecimal("XCUSTPARTNO_ID"));
		
		return obj;
	}

}
