package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RFQ;

public class RFQRowMapper<T> implements RowMapper<RFQ> {

	@Override
	public RFQ mapRow(ResultSet rs, int rowNum) throws SQLException {
		RFQ obj = new RFQ();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setFIELD5(rs.getTimestamp("FIELD5"));
		obj.setSTARTTIME(rs.getTimestamp("STARTTIME"));
		obj.setENDTIME(rs.getTimestamp("ENDTIME"));
		obj.setMAJORVERSION(rs.getBigDecimal("MAJORVERSION"));
		obj.setMINORVERSION(rs.getBigDecimal("MINORVERSION"));
		obj.setCREATETIME(rs.getTimestamp("CREATETIME"));
		obj.setTRACKNUMBER(rs.getString("TRACKNUMBER"));
		obj.setTFTRADENG_ID(rs.getBigDecimal("TFTRADENG_ID"));
		obj.setNUMRESPONSES(rs.getBigDecimal("NUMRESPONSES"));
		obj.setPREVOFFTYPE(rs.getBigDecimal("PREVOFFTYPE"));
		obj.setNEXTOFFTYPE(rs.getBigDecimal("NEXTOFFTYPE"));
		obj.setACTIVATETIME(rs.getTimestamp("ACTIVATETIME"));
		obj.setCOMPLETETIME(rs.getTimestamp("COMPLETETIME"));
		obj.setVERSIONFLAGS(rs.getBigDecimal("VERSIONFLAGS"));
		obj.setRFQ_ID(rs.getBigDecimal("RFQ_ID"));
		obj.setACCESSTYPE(rs.getBigDecimal("ACCESSTYPE"));
		obj.setDURATION(rs.getTimestamp("DURATION"));
		obj.setUPDATETIME(rs.getTimestamp("UPDATETIME"));
		obj.setCANCELTIME(rs.getTimestamp("CANCELTIME"));
		obj.setPREVOFFID(rs.getBigDecimal("PREVOFFID"));
		obj.setNEXTOFFID(rs.getBigDecimal("NEXTOFFID"));
		obj.setROUND(rs.getBigDecimal("ROUND"));
		obj.setSTAGE(rs.getBigDecimal("STAGE"));
		obj.setENDRESULT(rs.getBigDecimal("ENDRESULT"));
		obj.setCLOSETIME(rs.getTimestamp("CLOSETIME"));
		obj.setRULETYPE(rs.getBigDecimal("RULETYPE"));
		obj.setEXTRFQNUM(rs.getString("EXTRFQNUM"));
		obj.setFIELD6(rs.getTimestamp("FIELD6"));
		
		return obj;
	}

}
