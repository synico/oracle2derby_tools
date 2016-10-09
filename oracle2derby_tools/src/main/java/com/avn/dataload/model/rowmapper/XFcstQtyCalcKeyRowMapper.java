package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XFcstQtyCalcKey;

public class XFcstQtyCalcKeyRowMapper<T> implements RowMapper<XFcstQtyCalcKey> {

	@Override
	public XFcstQtyCalcKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFcstQtyCalcKey obj = new XFcstQtyCalcKey();
		
		obj.setFcstParty(rs.getString("FCST_PARTY"));
		obj.setCustMat(rs.getString("CUST_MAT"));
		obj.setWeekNbr(rs.getBigDecimal("WEEK_NBR"));
		obj.setMaterialNbr(rs.getString("MATERIAL_NBR"));
		
		return obj;
	}

}
