package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xcustpartno;

public class XcustpartnoRowMapper<T> implements RowMapper<Xcustpartno> {

	@Override
	public Xcustpartno mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xcustpartno obj = new Xcustpartno();
		
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setCustpartno(rs.getString("CUSTPARTNO"));
		obj.setXcustpartnoId(rs.getBigDecimal("XCUSTPARTNO_ID"));
		
		return obj;
	}

}
