package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ProcmsgvwKey;

public class ProcmsgvwKeyRowMapper<T> implements RowMapper<ProcmsgvwKey> {

	@Override
	public ProcmsgvwKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProcmsgvwKey obj = new ProcmsgvwKey();
		
		obj.setProcprotclId(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setMsgname(rs.getString("MSGNAME"));
		
		return obj;
	}

}
