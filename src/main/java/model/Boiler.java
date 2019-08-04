package model;
/*
 *锅炉压力容容器制造单位监督检查记录表
 */
public class Boiler {
	private String id;
	private String type;
    /*
     *表头
     */
    private Long serialNo;//编号
    private String corpnName;//制造单位名称
    private String mfAdd;//制造单位地址
    private String prinpal;//单位负责人
    private long phoneNo;//联系电话
    private long licenceNo;//许可证编号
    private String licenseRange;//许可范围
    private String licenseDate;//许可证有效期
    private String eiName;//评审机构名称
    private String lastDate;//最近一次评审日期
    private String supervisionOrg;//监督检验机构
    private String supervisor;//监督检验人

    /*
     *基本条件与管理
     */
    private String problem_1_1;//检查项目1.1的问题说明及记录
    private String result_1_1;//检查项目1.1的检查结果
    private String problem_1_2;
    private String result_1_2;
    private String problem_1_3;
    private String result_1_3;
    private String problem_1_4;
    private String result_1_4;
    private String problem_1_5;
    private String result_1_5;
    private String problem_1_6;
    private String result_1_6;
    private String problem_1_7;
    private String result_1_7;
    private String problem_1_8;
    private String result_1_8;
    private String problem_1_9;
    private String result_1_9;
    private String problem_1_10;
    private String result_1_10;
    private String problem_1_11;
    private String result_1_11;
    private String problem_1_12;
    private String result_1_12;
    private String problem_1_13;
    private String result_1_13;
    private String problem_1_14;
    private String result_1_14;
    private String problem_1_15;
    private String result_1_15;
    private String problem_1_16;
    private String result_1_16;
    private String problem_1_17;
    private String result_1_17;
    private String problem_1_18;
    private String result_1_18;
    private String problem_1_19;
    private String result_1_19;
    private String problem_1_20;
    private String result_1_20;
    private String checker_1;//检查项目1的监督检查人员
    private String checkDate_1;//检查项目1的日期

    /*
     *产品质量与控制
     */
    //制造单位名称是之前定义过的MFname
    private String problem_2_1;//检查项目2.1的问题说明及记录
    private String result_2_1;//检查项目2.1的检查结果
    private String problem_2_2;
    private String result_2_2;
    private String problem_2_3;
    private String result_2_3;
    private String problem_2_4;
    private String result_2_4;
    private String problem_2_5;
    private String result_2_5;
    private String problem_2_6;
    private String result_2_6;
    private String problem_2_7;
    private String result_2_7;
    private String problem_2_8;
    private String result_2_8;
    private String problem_2_9;
    private String result_2_9;
    private String problem_2_10;
    private String result_2_10;
    private String problem_2_11;
    private String result_2_11;
    private String problem_2_12;
    private String result_2_12;
    private String checker_2;//检查项目2的监督检查人员
    private String checkDate_2;//检查项目2的日期

    /*
     *对鉴定评审机构评审情况的检查
     */
    //制造单位名称是之前定义过的MFname
    private String problem_3_1;//检查项目3.1的问题说明及记录
    private String result_3_1;//检查项目3.1的检查结果
    private String problem_3_2;
    private String result_3_2;
    private String problem_3_3;
    private String result_3_3;
    private String problem_3_4;
    private String result_3_4;
    private String problem_3_5;
    private String result_3_5;
    private String problem_3_6;
    private String result_3_6;
    private String problem_3_7;
    private String result_3_7;
    private String problem_3_8;
    private String result_3_8;
    private String problem_3_9;
    private String result_3_9;
    private String checker_3;//检查项目3的检查人员
    private String checkDate_3;//检查项目3的日期

    /*
     *对监督检验情况的抽查
     */
    //制造单位名称是之前定义过的MFname
    private String problem_4_1;//检查项目4.1的问题说明及记录
    private String result_4_1;//检查项目4。1的检查结果
    private String problem_4_2;
    private String result_4_2;
    private String problem_4_3;
    private String result_4_3;
    private String problem_4_4;
    private String result_4_4;
    private String problem_4_5;
    private String result_4_5;
    private String problem_4_6;
    private String result_4_6;
    private String problem_4_7;
    private String result_4_7;
    private String problem_4_8;
    private String result_4_8;
    private String problem_4_9;
    private String result_4_9;
    private String problem_4_10;
    private String result_4_10;
    private String checker_4;//检查项目4的检查人员
    private String checkDate_4;//检查项目4的日期

    /*
     *设置成员的getter和setter
     */
    public String getType(){
    	return this.type;
    }
    public void setType(String type){
    	this.type=type;
    }
    public String getId(){
    	return this.id;
    }
    public void setId(String id){
    	this.id=id;
    }

    public Long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }

    public String getCorpnName() {
        return corpnName;
    }

    public void setCorpnName(String MFname) {
        this.corpnName = MFname;
    }

    public String getMfAdd() {
        return mfAdd;
    }

    public void setMfAdd(String MFadd) {
        this.mfAdd = MFadd;
    }

    public String getPrinpal() {
        return prinpal;
    }

    public void setPrinpal(String principal) {
        this.prinpal = principal;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(long licenseNo) {
        this.licenceNo = licenseNo;
    }

    public String getLicenseRange() {
        return licenseRange;
    }

    public void setLicenseRange(String licenseRange) {
        this.licenseRange = licenseRange;
    }

    public String getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(String licenseDate) {
        this.licenseDate = licenseDate;
    }

    public String getEiName() {
        return eiName;
    }

    public void setEiName(String EIname) {
        this.eiName = EIname;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getSupervisionOrg() {
        return supervisionOrg;
    }

    public void setSupervisionOrg(String supervisionOrg) {
        this.supervisionOrg = supervisionOrg;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getProblem_1_1() {
        return problem_1_1;
    }

    public void setProblem_1_1(String problem_1_1) {
        this.problem_1_1 = problem_1_1;
    }

    public String getResult_1_1() {
        return result_1_1;
    }

    public void setResult_1_1(String result_1_1) {
        this.result_1_1 = result_1_1;
    }

    public String getProblem_1_2() {
        return problem_1_2;
    }

    public void setProblem_1_2(String problem_1_2) {
        this.problem_1_2 = problem_1_2;
    }

    public String getResult_1_2() {
        return result_1_2;
    }

    public void setResult_1_2(String result_1_2) {
        this.result_1_2 = result_1_2;
    }

    public String getProblem_1_3() {
        return problem_1_3;
    }

    public void setProblem_1_3(String problem_1_3) {
        this.problem_1_3 = problem_1_3;
    }

    public String getResult_1_3() {
        return result_1_3;
    }

    public void setResult_1_3(String result_1_3) {
        this.result_1_3 = result_1_3;
    }

    public String getProblem_1_4() {
        return problem_1_4;
    }

    public void setProblem_1_4(String problem_1_4) {
        this.problem_1_4 = problem_1_4;
    }

    public String getResult_1_4() {
        return result_1_4;
    }

    public void setResult_1_4(String result_1_4) {
        this.result_1_4 = result_1_4;
    }

    public String getProblem_1_5() {
        return problem_1_5;
    }

    public void setProblem_1_5(String problem_1_5) {
        this.problem_1_5 = problem_1_5;
    }

    public String getResult_1_5() {
        return result_1_5;
    }

    public void setResult_1_5(String result_1_5) {
        this.result_1_5 = result_1_5;
    }

    public String getProblem_1_6() {
        return problem_1_6;
    }

    public void setProblem_1_6(String problem_1_6) {
        this.problem_1_6 = problem_1_6;
    }

    public String getResult_1_6() {
        return result_1_6;
    }

    public void setResult_1_6(String result_1_6) {
        this.result_1_6 = result_1_6;
    }

    public String getProblem_1_7() {
        return problem_1_7;
    }

    public void setProblem_1_7(String problem_1_7) {
        this.problem_1_7 = problem_1_7;
    }

    public String getResult_1_7() {
        return result_1_7;
    }

    public void setResult_1_7(String result_1_7) {
        this.result_1_7 = result_1_7;
    }

    public String getProblem_1_8() {
        return problem_1_8;
    }

    public void setProblem_1_8(String problem_1_8) {
        this.problem_1_8 = problem_1_8;
    }

    public String getResult_1_8() {
        return result_1_8;
    }

    public void setResult_1_8(String result_1_8) {
        this.result_1_8 = result_1_8;
    }

    public String getProblem_1_9() {
        return problem_1_9;
    }

    public void setProblem_1_9(String problem_1_9) {
        this.problem_1_9 = problem_1_9;
    }

    public String getResult_1_9() {
        return result_1_9;
    }

    public void setResult_1_9(String result_1_9) {
        this.result_1_9 = result_1_9;
    }

    public String getProblem_1_10() {
        return problem_1_10;
    }

    public void setProblem_1_10(String problem_1_10) {
        this.problem_1_10 = problem_1_10;
    }

    public String getResult_1_10() {
        return result_1_10;
    }

    public void setResult_1_10(String result_1_10) {
        this.result_1_10 = result_1_10;
    }

    public String getProblem_1_11() {
        return problem_1_11;
    }

    public void setProblem_1_11(String problem_1_11) {
        this.problem_1_11 = problem_1_11;
    }

    public String getResult_1_11() {
        return result_1_11;
    }

    public void setResult_1_11(String result_1_11) {
        this.result_1_11 = result_1_11;
    }

    public String getProblem_1_12() {
        return problem_1_12;
    }

    public void setProblem_1_12(String problem_1_12) {
        this.problem_1_12 = problem_1_12;
    }

    public String getResult_1_12() {
        return result_1_12;
    }

    public void setResult_1_12(String result_1_12) {
        this.result_1_12 = result_1_12;
    }

    public String getProblem_1_13() {
        return problem_1_13;
    }

    public void setProblem_1_13(String problem_1_13) {
        this.problem_1_13 = problem_1_13;
    }

    public String getResult_1_13() {
        return result_1_13;
    }

    public void setResult_1_13(String result_1_13) {
        this.result_1_13 = result_1_13;
    }

    public String getProblem_1_14() {
        return problem_1_14;
    }

    public void setProblem_1_14(String problem_1_14) {
        this.problem_1_14 = problem_1_14;
    }

    public String getResult_1_14() {
        return result_1_14;
    }

    public void setResult_1_14(String result_1_14) {
        this.result_1_14 = result_1_14;
    }

    public String getProblem_1_15() {
        return problem_1_15;
    }

    public void setProblem_1_15(String problem_1_15) {
        this.problem_1_15 = problem_1_15;
    }

    public String getResult_1_15() {
        return result_1_15;
    }

    public void setResult_1_15(String result_1_15) {
        this.result_1_15 = result_1_15;
    }

    public String getProblem_1_16() {
        return problem_1_16;
    }

    public void setProblem_1_16(String problem_1_16) {
        this.problem_1_16 = problem_1_16;
    }

    public String getResult_1_16() {
        return result_1_16;
    }

    public void setResult_1_16(String result_1_16) {
        this.result_1_16 = result_1_16;
    }

    public String getProblem_1_17() {
        return problem_1_17;
    }

    public void setProblem_1_17(String problem_1_17) {
        this.problem_1_17 = problem_1_17;
    }

    public String getResult_1_17() {
        return result_1_17;
    }

    public void setResult_1_17(String result_1_17) {
        this.result_1_17 = result_1_17;
    }

    public String getProblem_1_18() {
        return problem_1_18;
    }

    public void setProblem_1_18(String problem_1_18) {
        this.problem_1_18 = problem_1_18;
    }

    public String getResult_1_18() {
        return result_1_18;
    }

    public void setResult_1_18(String result_1_18) {
        this.result_1_18 = result_1_18;
    }

    public String getProblem_1_19() {
        return problem_1_19;
    }

    public void setProblem_1_19(String problem_1_19) {
        this.problem_1_19 = problem_1_19;
    }

    public String getResult_1_19() {
        return result_1_19;
    }

    public void setResult_1_19(String result_1_19) {
        this.result_1_19 = result_1_19;
    }

    public String getProblem_1_20() {
        return problem_1_20;
    }

    public void setProblem_1_20(String problem_1_20) {
        this.problem_1_20 = problem_1_20;
    }

    public String getResult_1_20() {
        return result_1_20;
    }

    public void setResult_1_20(String result_1_20) {
        this.result_1_20 = result_1_20;
    }

    public String getChecker_1() {
        return checker_1;
    }

    public void setChecker_1(String checker_1) {
        this.checker_1 = checker_1;
    }

    public String getCheckDate_1() {
        return checkDate_1;
    }

    public void setCheckDate_1(String checkDate_1) {
        this.checkDate_1 = checkDate_1;
    }

    public String getProblem_2_1() {
        return problem_2_1;
    }

    public void setProblem_2_1(String problem_2_1) {
        this.problem_2_1 = problem_2_1;
    }

    public String getResult_2_1() {
        return result_2_1;
    }

    public void setResult_2_1(String result_2_1) {
        this.result_2_1 = result_2_1;
    }

    public String getProblem_2_2() {
        return problem_2_2;
    }

    public void setProblem_2_2(String problem_2_2) {
        this.problem_2_2 = problem_2_2;
    }

    public String getResult_2_2() {
        return result_2_2;
    }

    public void setResult_2_2(String result_2_2) {
        this.result_2_2 = result_2_2;
    }

    public String getProblem_2_3() {
        return problem_2_3;
    }

    public void setProblem_2_3(String problem_2_3) {
        this.problem_2_3 = problem_2_3;
    }

    public String getResult_2_3() {
        return result_2_3;
    }

    public void setResult_2_3(String result_2_3) {
        this.result_2_3 = result_2_3;
    }

    public String getProblem_2_4() {
        return problem_2_4;
    }

    public void setProblem_2_4(String problem_2_4) {
        this.problem_2_4 = problem_2_4;
    }

    public String getResult_2_4() {
        return result_2_4;
    }

    public void setResult_2_4(String result_2_4) {
        this.result_2_4 = result_2_4;
    }

    public String getProblem_2_5() {
        return problem_2_5;
    }

    public void setProblem_2_5(String problem_2_5) {
        this.problem_2_5 = problem_2_5;
    }

    public String getResult_2_5() {
        return result_2_5;
    }

    public void setResult_2_5(String result_2_5) {
        this.result_2_5 = result_2_5;
    }

    public String getProblem_2_6() {
        return problem_2_6;
    }

    public void setProblem_2_6(String problem_2_6) {
        this.problem_2_6 = problem_2_6;
    }

    public String getResult_2_6() {
        return result_2_6;
    }

    public void setResult_2_6(String result_2_6) {
        this.result_2_6 = result_2_6;
    }

    public String getProblem_2_7() {
        return problem_2_7;
    }

    public void setProblem_2_7(String problem_2_7) {
        this.problem_2_7 = problem_2_7;
    }

    public String getResult_2_7() {
        return result_2_7;
    }

    public void setResult_2_7(String result_2_7) {
        this.result_2_7 = result_2_7;
    }

    public String getProblem_2_8() {
        return problem_2_8;
    }

    public void setProblem_2_8(String problem_2_8) {
        this.problem_2_8 = problem_2_8;
    }

    public String getResult_2_8() {
        return result_2_8;
    }

    public void setResult_2_8(String result_2_8) {
        this.result_2_8 = result_2_8;
    }

    public String getProblem_2_9() {
        return problem_2_9;
    }

    public void setProblem_2_9(String problem_2_9) {
        this.problem_2_9 = problem_2_9;
    }

    public String getResult_2_9() {
        return result_2_9;
    }

    public void setResult_2_9(String result_2_9) {
        this.result_2_9 = result_2_9;
    }

    public String getProblem_2_10() {
        return problem_2_10;
    }

    public void setProblem_2_10(String problem_2_10) {
        this.problem_2_10 = problem_2_10;
    }

    public String getResult_2_10() {
        return result_2_10;
    }

    public void setResult_2_10(String result_2_10) {
        this.result_2_10 = result_2_10;
    }

    public String getProblem_2_11() {
        return problem_2_11;
    }

    public void setProblem_2_11(String problem_2_11) {
        this.problem_2_11 = problem_2_11;
    }

    public String getResult_2_11() {
        return result_2_11;
    }

    public void setResult_2_11(String result_2_11) {
        this.result_2_11 = result_2_11;
    }

    public String getProblem_2_12() {
        return problem_2_12;
    }

    public void setProblem_2_12(String problem_2_12) {
        this.problem_2_12 = problem_2_12;
    }

    public String getResult_2_12() {
        return result_2_12;
    }

    public void setResult_2_12(String result_2_12) {
        this.result_2_12 = result_2_12;
    }

    public String getChecker_2() {
        return checker_2;
    }

    public void setChecker_2(String checker_2) {
        this.checker_2 = checker_2;
    }

    public String getCheckDate_2() {
        return checkDate_2;
    }

    public void setCheckDate_2(String checkDate_2) {
        this.checkDate_2 = checkDate_2;
    }

    public String getProblem_3_1() {
        return problem_3_1;
    }

    public void setProblem_3_1(String problem_3_1) {
        this.problem_3_1 = problem_3_1;
    }

    public String getResult_3_1() {
        return result_3_1;
    }

    public void setResult_3_1(String result_3_1) {
        this.result_3_1 = result_3_1;
    }

    public String getProblem_3_2() {
        return problem_3_2;
    }

    public void setProblem_3_2(String problem_3_2) {
        this.problem_3_2 = problem_3_2;
    }

    public String getResult_3_2() {
        return result_3_2;
    }

    public void setResult_3_2(String result_3_2) {
        this.result_3_2 = result_3_2;
    }

    public String getProblem_3_3() {
        return problem_3_3;
    }

    public void setProblem_3_3(String problem_3_3) {
        this.problem_3_3 = problem_3_3;
    }

    public String getResult_3_3() {
        return result_3_3;
    }

    public void setResult_3_3(String result_3_3) {
        this.result_3_3 = result_3_3;
    }

    public String getProblem_3_4() {
        return problem_3_4;
    }

    public void setProblem_3_4(String problem_3_4) {
        this.problem_3_4 = problem_3_4;
    }

    public String getResult_3_4() {
        return result_3_4;
    }

    public void setResult_3_4(String result_3_4) {
        this.result_3_4 = result_3_4;
    }

    public String getProblem_3_5() {
        return problem_3_5;
    }

    public void setProblem_3_5(String problem_3_5) {
        this.problem_3_5 = problem_3_5;
    }

    public String getResult_3_5() {
        return result_3_5;
    }

    public void setResult_3_5(String result_3_5) {
        this.result_3_5 = result_3_5;
    }

    public String getProblem_3_6() {
        return problem_3_6;
    }

    public void setProblem_3_6(String problem_3_6) {
        this.problem_3_6 = problem_3_6;
    }

    public String getResult_3_6() {
        return result_3_6;
    }

    public void setResult_3_6(String result_3_6) {
        this.result_3_6 = result_3_6;
    }

    public String getProblem_3_7() {
        return problem_3_7;
    }

    public void setProblem_3_7(String problem_3_7) {
        this.problem_3_7 = problem_3_7;
    }

    public String getResult_3_7() {
        return result_3_7;
    }

    public void setResult_3_7(String result_3_7) {
        this.result_3_7 = result_3_7;
    }

    public String getProblem_3_8() {
        return problem_3_8;
    }

    public void setProblem_3_8(String problem_3_8) {
        this.problem_3_8 = problem_3_8;
    }

    public String getResult_3_8() {
        return result_3_8;
    }

    public void setResult_3_8(String result_3_8) {
        this.result_3_8 = result_3_8;
    }

    public String getProblem_3_9() {
        return problem_3_9;
    }

    public void setProblem_3_9(String problem_3_9) {
        this.problem_3_9 = problem_3_9;
    }

    public String getResult_3_9() {
        return result_3_9;
    }

    public void setResult_3_9(String result_3_9) {
        this.result_3_9 = result_3_9;
    }

    public String getChecker_3() {
        return checker_3;
    }

    public void setChecker_3(String checker_3) {
        this.checker_3 = checker_3;
    }

    public String getCheckDate_3() {
        return checkDate_3;
    }

    public void setCheckDate_3(String checkDate_3) {
        this.checkDate_3 = checkDate_3;
    }

    public String getProblem_4_1() {
        return problem_4_1;
    }

    public void setProblem_4_1(String problem_4_1) {
        this.problem_4_1 = problem_4_1;
    }

    public String getResult_4_1() {
        return result_4_1;
    }

    public void setResult_4_1(String result_4_1) {
        this.result_4_1 = result_4_1;
    }

    public String getProblem_4_2() {
        return problem_4_2;
    }

    public void setProblem_4_2(String problem_4_2) {
        this.problem_4_2 = problem_4_2;
    }

    public String getResult_4_2() {
        return result_4_2;
    }

    public void setResult_4_2(String result_4_2) {
        this.result_4_2 = result_4_2;
    }

    public String getProblem_4_3() {
        return problem_4_3;
    }

    public void setProblem_4_3(String problem_4_3) {
        this.problem_4_3 = problem_4_3;
    }

    public String getResult_4_3() {
        return result_4_3;
    }

    public void setResult_4_3(String result_4_3) {
        this.result_4_3 = result_4_3;
    }

    public String getProblem_4_4() {
        return problem_4_4;
    }

    public void setProblem_4_4(String problem_4_4) {
        this.problem_4_4 = problem_4_4;
    }

    public String getResult_4_4() {
        return result_4_4;
    }

    public void setResult_4_4(String result_4_4) {
        this.result_4_4 = result_4_4;
    }

    public String getProblem_4_5() {
        return problem_4_5;
    }

    public void setProblem_4_5(String problem_4_5) {
        this.problem_4_5 = problem_4_5;
    }

    public String getResult_4_5() {
        return result_4_5;
    }

    public void setResult_4_5(String result_4_5) {
        this.result_4_5 = result_4_5;
    }

    public String getProblem_4_6() {
        return problem_4_6;
    }

    public void setProblem_4_6(String problem_4_6) {
        this.problem_4_6 = problem_4_6;
    }

    public String getResult_4_6() {
        return result_4_6;
    }

    public void setResult_4_6(String result_4_6) {
        this.result_4_6 = result_4_6;
    }

    public String getProblem_4_7() {
        return problem_4_7;
    }

    public void setProblem_4_7(String problem_4_7) {
        this.problem_4_7 = problem_4_7;
    }

    public String getResult_4_7() {
        return result_4_7;
    }

    public void setResult_4_7(String result_4_7) {
        this.result_4_7 = result_4_7;
    }

    public String getProblem_4_8() {
        return problem_4_8;
    }

    public void setProblem_4_8(String problem_4_8) {
        this.problem_4_8 = problem_4_8;
    }

    public String getResult_4_8() {
        return result_4_8;
    }

    public void setResult_4_8(String result_4_8) {
        this.result_4_8 = result_4_8;
    }

    public String getProblem_4_9() {
        return problem_4_9;
    }

    public void setProblem_4_9(String problem_4_9) {
        this.problem_4_9 = problem_4_9;
    }

    public String getResult_4_9() {
        return result_4_9;
    }

    public void setResult_4_9(String result_4_9) {
        this.result_4_9 = result_4_9;
    }

    public String getProblem_4_10() {
        return problem_4_10;
    }

    public void setProblem_4_10(String problem_4_10) {
        this.problem_4_10 = problem_4_10;
    }

    public String getResult_4_10() {
        return result_4_10;
    }

    public void setResult_4_10(String result_4_10) {
        this.result_4_10 = result_4_10;
    }

    public String getChecker_4() {
        return checker_4;
    }

    public void setChecker_4(String checker_4) {
        this.checker_4 = checker_4;
    }

    public String getCheckDate_4() {
        return checkDate_4;
    }

    public void setCheckDate_4(String checkDate_4) {
        this.checkDate_4 = checkDate_4;
    }
}
