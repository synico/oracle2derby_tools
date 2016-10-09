package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XfcstqtydetailsKey;

public class XfcstqtydetailsKeyRowMapper<T> implements RowMapper<XfcstqtydetailsKey> {

	@Override
	public XfcstqtydetailsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XfcstqtydetailsKey obj = new XfcstqtydetailsKey();
		
		obj.setWeekNbr(rs.getBigDecimal("WEEK_NBR"));
		obj.setForecastId(rs.getBigDecimal("FORECAST_ID"));
		
		return obj;
	}

}
