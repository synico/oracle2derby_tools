package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.CmdregBackup;

public class CmdregBackupRowMapper<T> implements RowMapper<CmdregBackup> {

	@Override
	public CmdregBackup mapRow(ResultSet rs, int rowNum) throws SQLException {
		CmdregBackup obj = new CmdregBackup();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setTarget(rs.getString("TARGET"));
		obj.setInterfacename(rs.getString("INTERFACENAME"));
		obj.setClassname(rs.getString("CLASSNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
