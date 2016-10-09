package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Procprotcl;

public class ProcprotclRowMapper<T> implements RowMapper<Procprotcl> {

	@Override
	public Procprotcl mapRow(ResultSet rs, int rowNum) throws SQLException {
		Procprotcl obj = new Procprotcl();
		
		obj.setProcprotclId(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setProcsysname(rs.getString("PROCSYSNAME"));
		obj.setProtocolname(rs.getString("PROTOCOLNAME"));
		obj.setTwostepmode(rs.getString("TWOSTEPMODE"));
		obj.setProcprotclcomment(rs.getString("PROCPROTCLCOMMENT"));
		obj.setClassifdomain(rs.getString("CLASSIFDOMAIN"));
		obj.setUomstandard(rs.getString("UOMSTANDARD"));
		obj.setVersion(rs.getString("VERSION"));
		obj.setAuthtype(rs.getBigDecimal("AUTHTYPE"));
		
		return obj;
	}

}
