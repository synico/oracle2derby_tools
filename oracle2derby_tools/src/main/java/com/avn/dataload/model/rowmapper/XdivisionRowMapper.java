package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xdivision;

public class XdivisionRowMapper<T> implements RowMapper<Xdivision> {

	@Override
	public Xdivision mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xdivision obj = new Xdivision();
		
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setErpname(rs.getString("ERPNAME"));
		obj.setRegionname(rs.getString("REGIONNAME"));
		obj.setCarttype(rs.getString("CARTTYPE"));
		obj.setDivisioncode(rs.getString("DIVISIONCODE"));
		obj.setCarttypeDesc(rs.getString("CARTTYPE_DESC"));
		obj.setDefaultCurrency(rs.getString("DEFAULT_CURRENCY"));
		
		return obj;
	}

}
