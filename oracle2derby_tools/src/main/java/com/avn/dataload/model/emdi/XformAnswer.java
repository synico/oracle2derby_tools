package com.avn.dataload.model.emdi;

public class XformAnswer extends XformAnswerKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XFORM_ANSWER.FORM_ANSWER_TX
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String formAnswerTx;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XFORM_ANSWER.FORM_ANSWER_TX
     *
     * @return the value of EMDI.XFORM_ANSWER.FORM_ANSWER_TX
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getFormAnswerTx() {
        return formAnswerTx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XFORM_ANSWER.FORM_ANSWER_TX
     *
     * @param formAnswerTx the value for EMDI.XFORM_ANSWER.FORM_ANSWER_TX
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setFormAnswerTx(String formAnswerTx) {
        this.formAnswerTx = formAnswerTx == null ? null : formAnswerTx.trim();
    }
}