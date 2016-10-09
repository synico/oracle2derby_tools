package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmfiledir;

public class CmfiledirRowMapper<T> implements RowMapper<Cmfiledir> {

	@Override
	public Cmfiledir mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmfiledir obj = new Cmfiledir();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setCmfiledirId(rs.getBigDecimal("CMFILEDIR_ID"));
		obj.setCmfiledirParent(rs.getBigDecimal("CMFILEDIR_PARENT"));
		
		return obj;
	}

}
