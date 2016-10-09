package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xpreferredaddress;

public class XpreferredaddressRowMapper<T> implements RowMapper<Xpreferredaddress> {

	@Override
	public Xpreferredaddress mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xpreferredaddress obj = new Xpreferredaddress();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFlag(rs.getString("FLAG"));
		
		return obj;
	}

}
