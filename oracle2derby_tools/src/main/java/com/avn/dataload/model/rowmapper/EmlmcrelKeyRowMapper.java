package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.EmlmcrelKey;

public class EmlmcrelKeyRowMapper<T> implements RowMapper<EmlmcrelKey> {

	@Override
	public EmlmcrelKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmlmcrelKey obj = new EmlmcrelKey();
		
		obj.setEmlcontentId(rs.getBigDecimal("EMLCONTENT_ID"));
		obj.setEmlmsgId(rs.getBigDecimal("EMLMSG_ID"));
		
		return obj;
	}

}
