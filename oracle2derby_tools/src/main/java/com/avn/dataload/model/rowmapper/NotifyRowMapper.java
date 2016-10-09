package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Notify;

public class NotifyRowMapper<T> implements RowMapper<Notify> {

	@Override
	public Notify mapRow(ResultSet rs, int rowNum) throws SQLException {
		Notify obj = new Notify();
		
		obj.setNotificationid(rs.getBigDecimal("NOTIFICATIONID"));
		obj.setTransportattname(rs.getString("TRANSPORTATTNAME"));
		obj.setTransportattvalue(rs.getString("TRANSPORTATTVALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMsgtypeId(rs.getBigDecimal("MSGTYPE_ID"));
		obj.setNotifyId(rs.getBigDecimal("NOTIFY_ID"));
		obj.setTransportId(rs.getBigDecimal("TRANSPORT_ID"));
		
		return obj;
	}

}
