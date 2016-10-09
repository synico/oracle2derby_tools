package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rfq;

public class RfqRowMapper<T> implements RowMapper<Rfq> {

	@Override
	public Rfq mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rfq obj = new Rfq();
		
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
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTracknumber(rs.getString("TRACKNUMBER"));
		obj.setTftradengId(rs.getBigDecimal("TFTRADENG_ID"));
		obj.setNumresponses(rs.getBigDecimal("NUMRESPONSES"));
		obj.setPrevofftype(rs.getBigDecimal("PREVOFFTYPE"));
		obj.setNextofftype(rs.getBigDecimal("NEXTOFFTYPE"));
		obj.setActivatetime(rs.getDate("ACTIVATETIME"));
		obj.setCompletetime(rs.getDate("COMPLETETIME"));
		obj.setVersionflags(rs.getBigDecimal("VERSIONFLAGS"));
		obj.setStarttime(rs.getDate("STARTTIME"));
		obj.setEndtime(rs.getDate("ENDTIME"));
		obj.setCreatetime(rs.getDate("CREATETIME"));
		obj.setRfqId(rs.getBigDecimal("RFQ_ID"));
		obj.setAccesstype(rs.getBigDecimal("ACCESSTYPE"));
		obj.setDuration(rs.getDate("DURATION"));
		obj.setUpdatetime(rs.getDate("UPDATETIME"));
		obj.setCanceltime(rs.getDate("CANCELTIME"));
		obj.setPrevoffid(rs.getBigDecimal("PREVOFFID"));
		obj.setNextoffid(rs.getBigDecimal("NEXTOFFID"));
		obj.setRound(rs.getBigDecimal("ROUND"));
		obj.setStage(rs.getBigDecimal("STAGE"));
		obj.setEndresult(rs.getBigDecimal("ENDRESULT"));
		obj.setClosetime(rs.getDate("CLOIME"));
		obj.setRuletype(rs.getBigDecimal("RULETYPE"));
		obj.setExtrfqnum(rs.getString("EXTRFQNUM"));
		obj.setField6(rs.getDate("FIELD6"));
		obj.setMajorversion(rs.getBigDecimal("MAJORVERSION"));
		obj.setMinorversion(rs.getBigDecimal("MINORVERSION"));
		
		return obj;
	}

}
