package com.avn.dataload.model.emdi;

import java.math.BigDecimal;

public class Tfalgotype {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.TFALGOTYPE.TFALGOTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal tfalgotypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.TFALGOTYPE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private BigDecimal optcounter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.TFALGOTYPE.TFALGOTYPE_ID
     *
     * @return the value of EMDI.TFALGOTYPE.TFALGOTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getTfalgotypeId() {
        return tfalgotypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.TFALGOTYPE.TFALGOTYPE_ID
     *
     * @param tfalgotypeId the value for EMDI.TFALGOTYPE.TFALGOTYPE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setTfalgotypeId(BigDecimal tfalgotypeId) {
        this.tfalgotypeId = tfalgotypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.TFALGOTYPE.OPTCOUNTER
     *
     * @return the value of EMDI.TFALGOTYPE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public BigDecimal getOptcounter() {
        return optcounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.TFALGOTYPE.OPTCOUNTER
     *
     * @param optcounter the value for EMDI.TFALGOTYPE.OPTCOUNTER
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setOptcounter(BigDecimal optcounter) {
        this.optcounter = optcounter;
    }
}