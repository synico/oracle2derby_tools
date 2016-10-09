package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xcatentry;

public class XcatentryRowMapper<T> implements RowMapper<Xcatentry> {

	@Override
	public Xcatentry mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xcatentry obj = new Xcatentry();
		
		obj.setDisplayable(rs.getString("DISPLAYABLE"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setField5(rs.getString("FIELD5"));
		obj.setBuyable(rs.getString("BUYABLE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setSupplierpartnumber(rs.getString("SUPPLIERPARTNUMBER"));
		obj.setIssoftwareandisdownloadable(rs.getString("ISSOFTWAREANDISDOWNLOADABLE"));
		obj.setField6(rs.getString("FIELD6"));
		obj.setField7(rs.getString("FIELD7"));
		obj.setMfcode(rs.getString("MFCODE"));
		obj.setAbcCd01(rs.getString("ABC_CD01"));
		obj.setAbcCd02(rs.getString("ABC_CD02"));
		obj.setAbcCd03(rs.getString("ABC_CD03"));
		obj.setField8(rs.getString("FIELD8"));
		obj.setActivedate(rs.getString("ACTIVEDATE"));
		obj.setEccncode(rs.getString("ECCNCODE"));
		obj.setEndoflife(rs.getString("ENDOFLIFE"));
		obj.setHtscode(rs.getString("HTSCODE"));
		obj.setNcnrflag(rs.getString("NCNRFLAG"));
		obj.setSalesorg(rs.getString("SALESORG"));
		obj.setRedtagflag(rs.getString("REDTAGFLAG"));
		obj.setWebbuyable(rs.getString("WEBBUYABLE"));
		obj.setField9(rs.getBigDecimal("FIELD9"));
		obj.setField10(rs.getBigDecimal("FIELD10"));
		obj.setField11(rs.getString("FIELD11"));
		obj.setField12(rs.getString("FIELD12"));
		obj.setField13(rs.getString("FIELD13"));
		obj.setSuppliercode(rs.getString("SUPPLIERCODE"));
		obj.setDivisioncode(rs.getString("DIVISIONCODE"));
		obj.setAvnetpartnumber(rs.getString("AVNETPARTNUMBER"));
		obj.setErppartnumber(rs.getString("ERPPARTNUMBER"));
		obj.setErpTaxonomyLevel1Nm(rs.getString("ERP_TAXONOMY_LEVEL1NM"));
		obj.setErpTaxonomyLevel2Nm(rs.getString("ERP_TAXONOMY_LEVEL2NM"));
		obj.setErpTaxonomyLevel3Nm(rs.getString("ERP_TAXONOMY_LEVEL3NM"));
		obj.setErpTaxonomyLevel4Nm(rs.getString("ERP_TAXONOMY_LEVEL4NM"));
		obj.setSapmatgroup(rs.getString("SAPMATGROUP"));
		obj.setMdmmaterialnumber(rs.getString("MDMMATERIALNUMBER"));
		obj.setAllocationflag(rs.getString("ALLOCATIONFLAG"));
		obj.setCustomreelflag(rs.getString("CUSTOMREELFLAG"));
		obj.setDefaultplant(rs.getString("DEFAULTPLANT"));
		obj.setDesignwinflag(rs.getString("DESIGNWINFLAG"));
		obj.setDisplaypart(rs.getString("DISPLAYPART"));
		obj.setDownloadflag(rs.getString("DOWNLOADFLAG"));
		obj.setExistsinsap(rs.getString("EXISTSINSAP"));
		obj.setIsasoftwareflag(rs.getString("ISASOFTWAREFLAG"));
		obj.setMilitaryproductflag(rs.getString("MILITARYPRODUCTFLAG"));
		obj.setObsoletedate(rs.getString("OBSOLETEDATE"));
		obj.setObsoleteflag(rs.getString("OBSOLETEFLAG"));
		obj.setPackagetypecode(rs.getString("PACKAGETYPECODE"));
		obj.setRohscompliancecode(rs.getString("ROHSCOMPLIANCECODE"));
		obj.setSchedulableflag(rs.getString("SCHEDULABLEFLAG"));
		obj.setSchedulebcode(rs.getString("SCHEDULEBCODE"));
		obj.setSupplierstockflag(rs.getString("SUPPLIERSTOCKFLAG"));
		obj.setTopsellerflag(rs.getString("TOPSELLERFLAG"));
		obj.setWebonlyflag(rs.getString("WEBONLYFLAG"));
		obj.setErpcorepartnumber(rs.getString("ERPCOREPARTNUMBER"));
		obj.setDisplayinventory(rs.getString("DISPLAYINVENTORY"));
		
		return obj;
	}

}
