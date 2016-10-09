package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxPromotion;

public class PxPromotionRowMapper<T> implements RowMapper<PxPromotion> {

	@Override
	public PxPromotion mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxPromotion obj = new PxPromotion();
		
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setName(rs.getString("NAME"));
		obj.setCode(rs.getString("CODE"));
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setPxPromotionId(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setPershopperlmt(rs.getBigDecimal("PERSHOPPERLMT"));
		obj.setLastupdateby(rs.getBigDecimal("LASTUPDATEBY"));
		obj.setVersion(rs.getBigDecimal("VERSION"));
		obj.setEffective(rs.getBigDecimal("EFFECTIVE"));
		obj.setExpire(rs.getBigDecimal("EXPIRE"));
		obj.setPxGroupId(rs.getBigDecimal("PX_GROUP_ID"));
		obj.setXmlparam(rs.getString("XMLPARAM"));
		obj.setRevision(rs.getBigDecimal("REVISION"));
		obj.setExclsve(rs.getBigDecimal("EXCLSVE"));
		obj.setPerordlmt(rs.getBigDecimal("PERORDLMT"));
		obj.setTotallmt(rs.getBigDecimal("TOTALLMT"));
		obj.setRsvInt(rs.getBigDecimal("RSV_INT"));
		obj.setCampaignId(rs.getBigDecimal("CAMPAIGN_ID"));
		obj.setTransfer(rs.getBigDecimal("TRANSFER"));
		obj.setCdrequired(rs.getBigDecimal("CDREQUIRED"));
		obj.setRsvTime(rs.getDate("RSV_TIME"));
		obj.setRsvReal(rs.getBigDecimal("RSV_REAL"));
		obj.setTgtsales(rs.getBigDecimal("TGTSALES"));
		obj.setRsvVch(rs.getString("RSV_VCH"));
		
		return obj;
	}

}
