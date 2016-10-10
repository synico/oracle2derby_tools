package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_PROMOTION;

public class PX_PROMOTIONRowMapper<T> implements RowMapper<PX_PROMOTION> {

	@Override
	public PX_PROMOTION mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_PROMOTION obj = new PX_PROMOTION();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setEFFECTIVE(rs.getBigDecimal("EFFECTIVE"));
		obj.setEXPIRE(rs.getBigDecimal("EXPIRE"));
		obj.setPX_GROUP_ID(rs.getBigDecimal("PX_GROUP_ID"));
		obj.setPERSHOPPERLMT(rs.getBigDecimal("PERSHOPPERLMT"));
		obj.setCAMPAIGN_ID(rs.getBigDecimal("CAMPAIGN_ID"));
		obj.setLASTUPDATEBY(rs.getBigDecimal("LASTUPDATEBY"));
		obj.setXMLPARAM(rs.getClob("XMLPARAM"));
		obj.setREVISION(rs.getBigDecimal("REVISION"));
		obj.setEXCLSVE(rs.getBigDecimal("EXCLSVE"));
		obj.setPERORDLMT(rs.getBigDecimal("PERORDLMT"));
		obj.setTOTALLMT(rs.getBigDecimal("TOTALLMT"));
		obj.setRSV_INT(rs.getBigDecimal("RSV_INT"));
		obj.setTRANSFER(rs.getBigDecimal("TRANSFER"));
		obj.setCDREQUIRED(rs.getBigDecimal("CDREQUIRED"));
		obj.setRSV_TIME(rs.getTimestamp("RSV_TIME"));
		obj.setRSV_REAL(rs.getBigDecimal("RSV_REAL"));
		obj.setTGTSALES(rs.getBigDecimal("TGTSALES"));
		obj.setRSV_VCH(rs.getString("RSV_VCH"));
		
		return obj;
	}

}
