package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rfqrsp;

public class RfqrspRowMapper<T> implements RowMapper<Rfqrsp> {

	@Override
	public Rfqrsp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rfqrsp obj = new Rfqrsp();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setName(rs.getString("NAME"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setField5(rs.getDate("FIELD5"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTftradengId(rs.getBigDecimal("TFTRADENG_ID"));
		obj.setVersionflags(rs.getBigDecimal("VERSIONFLAGS"));
		obj.setRejectreason(rs.getString("REJECTREASON"));
		obj.setAcceptaction(rs.getBigDecimal("ACCEPTACTION"));
		obj.setExtrfqresponsenum(rs.getString("EXTRFQRESPONSENUM"));
		obj.setCreatetime(rs.getDate("CREATETIME"));
		obj.setRfqId(rs.getBigDecimal("RFQ_ID"));
		obj.setUpdatetime(rs.getDate("UPDATETIME"));
		obj.setCanceltime(rs.getDate("CANCELTIME"));
		obj.setField6(rs.getDate("FIELD6"));
		obj.setRfqrspId(rs.getBigDecimal("RFQRSP_ID"));
		obj.setRemarks(rs.getString("REMARKS"));
		obj.setPrevrsp(rs.getBigDecimal("PREVRSP"));
		obj.setMajorversion(rs.getBigDecimal("MAJORVERSION"));
		obj.setMinorversion(rs.getBigDecimal("MINORVERSION"));
		
		return obj;
	}

}
