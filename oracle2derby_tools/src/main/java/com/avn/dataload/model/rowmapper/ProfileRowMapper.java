package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Profile;

public class ProfileRowMapper<T> implements RowMapper<Profile> {

	@Override
	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		Profile obj = new Profile();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setLowpriority(rs.getBigDecimal("LOWPRIORITY"));
		obj.setHighpriority(rs.getBigDecimal("HIGHPRIORITY"));
		obj.setProfileId(rs.getBigDecimal("PROFILE_ID"));
		obj.setMsgtypeId(rs.getBigDecimal("MSGTYPE_ID"));
		obj.setUsersview(rs.getString("USERSVIEW"));
		obj.setArchivemsg(rs.getBigDecimal("ARCHIVEMSG"));
		obj.setDevicefmtId(rs.getBigDecimal("DEVICEFMT_ID"));
		obj.setTransportId(rs.getBigDecimal("TRANSPORT_ID"));
		
		return obj;
	}

}
