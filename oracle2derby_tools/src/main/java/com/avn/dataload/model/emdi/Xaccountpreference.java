package com.avn.dataload.model.emdi;

public class Xaccountpreference extends XaccountpreferenceKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EMDI.XACCOUNTPREFERENCE.PREFERENCE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    private String preferenceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EMDI.XACCOUNTPREFERENCE.PREFERENCE_ID
     *
     * @return the value of EMDI.XACCOUNTPREFERENCE.PREFERENCE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public String getPreferenceId() {
        return preferenceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EMDI.XACCOUNTPREFERENCE.PREFERENCE_ID
     *
     * @param preferenceId the value for EMDI.XACCOUNTPREFERENCE.PREFERENCE_ID
     *
     * @mbggenerated Sun Oct 09 16:35:15 CST 2016
     */
    public void setPreferenceId(String preferenceId) {
        this.preferenceId = preferenceId == null ? null : preferenceId.trim();
    }
}