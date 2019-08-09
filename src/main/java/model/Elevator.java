package model;
/*
 *电梯制造单位监督抽查记录表(2019版)
 */

public class Elevator{
	  private String id;
	  private String type;
	/*
     *表头
     */
	private String corpnName;//单位名称
    private String address;//制造地址
    private String prinpal;//单位负责人
    private long phoneNo;//联系电话
    private String licenceNo;//许可证编号
    private long fax;//传真
    private String licenceDate;//许可证有效期
    private String licenceRange;//许可的范围


    /* 一、资源条件(Resource condition)
     * 1.法定资质
     */
    private String rcResult_1_1;// 1.1 检查结果
    private String rcRecord_1_1;// 1.1 记录

    private String rcResult_1_2;// 1.2 检查结果
    private String rcRecord_1_2;// 1.2 记录
    
    private String rcResult_1_3;// 1.3 检查结果
    private String rcRecord_1_3;// 1.3 记录
    
    /*
     * 2.人员
     */
    private String rcResult_2_1;// 2.1 检查结果
    private String rcRecord_2_1;// 2.1 记录

    private String rcResult_2_1_1;// 2.1.1 检查结果
    private String rcRecord_2_1_1;// 2.1.1 记录
    private String rcResult_2_1_2;// 2.1.2 检查结果
    private String rcRecord_2_1_2;// 2.1.2 记录
    private String rcResult_2_1_3;// 2.1.3 检查结果
    private String rcRecord_2_1_3;// 2.1.3 记录

    private String rcResult_2_3;// 2.3 检查结果
    private String rcRecord_2_3;// 2.3 记录

    private String rcResult_2_4_1;// 2.4.1 检查结果
    private String rcRecord_2_4_1;// 2.4.1 记录
    private String rcResult_2_4_2;// 2.4.2 检查结果
    private String rcRecord_2_4_2;// 2.4.2 记录

    private String rcResult_2_5;// 2.5 检查结果
    private String rcRecord_2_5;// 2.5 记录

    private String rcResult_2_6;// 2.6 检查结果
    private String rcRecord_2_6;// 2.6 记录

    /*
     * 3.固定办公场所
     */
    private String rcResult_3_1;// 3.1 检查结果
    private String rcRecord_3_1;// 3.1 记录

    /*
     * 4.设置和装备
     */
    private String rcResult_4_2;// 4.2 检查结果
    private String rcRecord_4_2;// 4.2 记录

    private String rcResult_4_3;// 4.3 检查结果
    private String rcRecord_4_3;// 4.3 记录

    /*
     * 5.试验能力
     */
    private String rcResult_5_1;// 5.1 检查结果
    private String rcRecord_5_1;// 5.1 记录

    /*
     * 6.培训能力
     */
    private String rcResult_6_1;// 6.1 检查结果
    private String rcRecord_6_1;// 6.1 记录

    /*
     * 7.服务网络
     */
    private String rcResult_7_1;// 7.1 检查结果
    private String rcRecord_7_1;// 7.1 记录

    /* 二、质量管理体系(Quality Control)
     * 1.法定资质
     */
    private String qcResult_1_1;// 1.1 检查结果
    private String qcRecord_1_1;// 1.1 记录

    private String qcResult_1_2;// 1.2 检查结果
    private String qcRecord_1_2;// 1.2 记录

    /*
     * 2.质量保证体系文件
     */
    private String qcResult_2_1;// 2.1 检查结果
    private String qcRecord_2_1;// 2.1 记录

    private String qcResult_2_2;// 2.2 检查结果
    private String qcRecord_2_2;// 2.2 记录

    private String qcResult_2_3;// 2.3 检查结果
    private String qcRecord_2_3;// 2.3 记录

    private String qcResult_2_4;// 2.4 检查结果
    private String qcRecord_2_4;// 2.4 记录

    /*
     * 3.文件和记录控制
     */
    private String qcResult_3_1;// 3.1 检查结果
    private String qcRecord_3_1;// 3.1 记录

    private String qcResult_3_2;// 3.2 检查结果
    private String qcRecord_3_2;// 3.2 记录

    /*
     * 4.设计控制
     */
    private String qcResult_4_1;// 4.1 检查结果
    private String qcRecord_4_1;// 4.1 记录

    /*
     * 5.材料与零部件控制
     */
    private String qcResult_5_1;// 5.1 检查结果
    private String qcRecord_5_1;// 5.1 记录

    private String qcResult_5_2;// 5.2 检查结果
    private String qcRecord_5_2;// 5.2 记录

    /*
     * 6.作业（工艺）控制
     */
    private String qcResult_6_1;// 6.1 检查结果
    private String qcRecord_6_1;// 6.1 记录

    private String qcResult_6_2;// 6.2 检查结果
    private String qcRecord_6_2;// 6.2 记录

    /*
     * 7.检验与试验控制
     */
    private String qcResult_7_1;// 7.1 检查结果
    private String qcRecord_7_1;// 7.1 记录

    /*
     * 8.设备和检验与试验装置控制
     */
    private String qcResult_8_1;// 8.1 检查结果
    private String qcRecord_8_1;// 8.1 记录

    /*
     * 9.不合格品（项）控制
     */
    private String qcResult_9_1;// 9.1 检查结果
    private String qcRecord_9_1;// 9.1 记录

    /*
     * 10.质量改进与服务
     */
    private String qcResult_10_1;// 10.1 检查结果
    private String qcRecord_10_1;// 10.1 记录

    /*
     * 11.人员培训考核及管理
     */
    private String qcResult_11_1;// 11.1 检查结果
    private String qcRecord_11_1;// 11.1 记录

    /*
     * 12.执行特种设备许可制度
     */
    private String qcResult_12_1;// 12.1 检查结果
    private String qcRecord_12_1;// 12.1 记录

    /*
     *补充
     */
    private String qcProblem;// 问题记录(包括未在“检查内容”栏目中列出的其他项目及其问题)
    private String qcChecker;// 监督检查人员
    private String qcCheckDate;// 检查日期


    /* 
     * 三、制造/安装/维修质量 (曳引式电梯 Traction elevator)
     */

    private String teCorpnName;//使用单位
    private String teType;//产品型号
    private String teNo;//出厂编号
    private String tespeed;//额定速度
    private String teLoad;//额定载重量

    private String teResult_1_1;// 1.1 抽查结果
    private String teResult_1_2;// 1.2 抽查结果
    private String teResult_1_3;// 1.3 抽查结果
    private String teResult_1_4;// 1.4 抽查结果

    private String teResult_2_1;// 2.1 抽查结果
    private String teResult_2_2;// 2.2 抽查结果
    private String teResult_2_3;// 2.3 抽查结果
    private String teResult_2_4;// 2.4 抽查结果
    private String teResult_2_5;// 2.5 抽查结果
    private String teResult_2_6;// 2.6 抽查结果

    private String teResult_3_1;// 3.1 抽查结果
    private String teResult_3_2;// 3.2 抽查结果
    private String teResult_3_3;// 3.3 抽查结果
    private String teResult_3_4;// 3.4 抽查结果
    private String teResult_3_5;// 3.5 抽查结果
    private String teResult_3_6;// 3.6 抽查结果
    private String teResult_3_7;// 3.7 抽查结果
    private String teResult_3_8;// 3.8 抽查结果
    private String teResult_3_9;// 3.9 抽查结果
    private String teResult_3_10;// 3.10 抽查结果
    private String teResult_3_11;// 3.11 抽查结果
    private String teResult_3_12;// 3.12 抽查结果
    private String teResult_3_13;// 3.13 抽查结果
    private String teResult_3_14;// 3.14 抽查结果
    private String teResult_3_15;// 3.15 抽查结果
    private String teResult_3_16;// 3.16 抽查结果

    /*
     *补充
     */
    private String teProblem;//问题记录(包括未在“检查内容”栏目中列出的其他项目及其问题)
    private String teChecker;//监督检查人员
    private String teCheckDate;//检查日期



    /* 
     * 三、制造/安装/维修质量 (自动扶梯 escalator)
     */
    private String esCorpnName;//使用单位
    private String esType;//产品型号
    private String esNo;//出厂编号
    private String esSpeed;//名义速度
    private String esHigh;//提升高度

    private String esResult_1_1;// 1.1 抽查结果
    private String esResult_1_2;// 1.2 抽查结果
    private String esResult_1_3;// 1.3 抽查结果

    private String esResult_2_1;// 2.1 抽查结果
    private String esResult_2_2;// 2.2 抽查结果
    private String esResult_2_3;// 2.3 抽查结果

    private String esResult_3_1;// 3.1 抽查结果
    private String esResult_3_2;// 3.2 抽查结果
    private String esResult_3_3;// 3.3 抽查结果
    private String esResult_3_4;// 3.4 抽查结果
    private String esResult_3_5;// 3.5 抽查结果
    private String esResult_3_6;// 3.6 抽查结果
    private String esResult_3_7;// 3.7 抽查结果
    private String esResult_3_8;// 3.8 抽查结果
    private String esResult_3_9;// 3.9 抽查结果
    private String esResult_3_10;// 3.10 抽查结果
    private String esResult_3_11;// 3.11 抽查结果
    private String esResult_3_12;// 3.12 抽查结果
    private String esResult_3_13;// 3.13 抽查结果
    private String esResult_3_14;// 3.14 抽查结果
    private String esResult_3_15;// 3.15 抽查结果

    /*
     *补充
     */
    private String esProblem;//问题记录(包括未在“检查内容”栏目中列出的其他项目及其问题)
    private String esChecker;//监督检查人员
    private String esCheckDate;//检查日期
    
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
    
	public String getCorpnName() {
		return corpnName;
	}
	public void setCorpnName(String corpnName) {
		this.corpnName = corpnName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	public long getFax() {
		return fax;
	}
	public void setFax(long fax) {
		this.fax = fax;
	}
	public String getLicenceDate() {
		return licenceDate;
	}
	public void setLicenceDate(String licenceDate) {
		this.licenceDate = licenceDate;
	}
	public String getLicenceRange() {
		return licenceRange;
	}
	public void setLicenceRange(String licenceRange) {
		this.licenceRange = licenceRange;
	}
	public String getRcResult_1_1() {
		return rcResult_1_1;
	}
	public void setRcResult_1_1(String rcResult_1_1) {
		this.rcResult_1_1 = rcResult_1_1;
	}
	public String getRcRecord_1_1() {
		return rcRecord_1_1;
	}
	public void setRcRecord_1_1(String rcRecord_1_1) {
		this.rcRecord_1_1 = rcRecord_1_1;
	}
	public String getRcResult_1_2() {
		return rcResult_1_2;
	}
	public void setRcResult_1_2(String rcResult_1_2) {
		this.rcResult_1_2 = rcResult_1_2;
	}
	public String getRcRecord_1_2() {
		return rcRecord_1_2;
	}
	public void setRcRecord_1_2(String rcRecord_1_2) {
		this.rcRecord_1_2 = rcRecord_1_2;
	}
	public String getRcResult_1_3() {
		return rcResult_1_3;
	}
	public void setRcResult_1_3(String rcResult_1_3) {
		this.rcResult_1_3 = rcResult_1_3;
	}
	public String getRcRecord_1_3() {
		return rcRecord_1_3;
	}
	public void setRcRecord_1_3(String rcRecord_1_3) {
		this.rcRecord_1_3 = rcRecord_1_3;
	}
	public String getRcResult_2_1() {
		return rcResult_2_1;
	}
	public void setRcResult_2_1(String rcResult_2_1) {
		this.rcResult_2_1 = rcResult_2_1;
	}
	public String getRcRecord_2_1() {
		return rcRecord_2_1;
	}
	public void setRcRecord_2_1(String rcRecord_2_1) {
		this.rcRecord_2_1 = rcRecord_2_1;
	}
	public String getRcResult_2_1_1() {
		return rcResult_2_1_1;
	}
	public void setRcResult_2_1_1(String rcResult_2_1_1) {
		this.rcResult_2_1_1 = rcResult_2_1_1;
	}
	public String getRcRecord_2_1_1() {
		return rcRecord_2_1_1;
	}
	public void setRcRecord_2_1_1(String rcRecord_2_1_1) {
		this.rcRecord_2_1_1 = rcRecord_2_1_1;
	}
	public String getRcResult_2_1_2() {
		return rcResult_2_1_2;
	}
	public void setRcResult_2_1_2(String rcResult_2_1_2) {
		this.rcResult_2_1_2 = rcResult_2_1_2;
	}
	public String getRcRecord_2_1_2() {
		return rcRecord_2_1_2;
	}
	public void setRcRecord_2_1_2(String rcRecord_2_1_2) {
		this.rcRecord_2_1_2 = rcRecord_2_1_2;
	}
	public String getRcResult_2_1_3() {
		return rcResult_2_1_3;
	}
	public void setRcResult_2_1_3(String rcResult_2_1_3) {
		this.rcResult_2_1_3 = rcResult_2_1_3;
	}
	public String getRcRecord_2_1_3() {
		return rcRecord_2_1_3;
	}
	public void setRcRecord_2_1_3(String rcRecord_2_1_3) {
		this.rcRecord_2_1_3 = rcRecord_2_1_3;
	}
	public String getRcResult_2_3() {
		return rcResult_2_3;
	}
	public void setRcResult_2_3(String rcResult_2_3) {
		this.rcResult_2_3 = rcResult_2_3;
	}
	public String getRcRecord_2_3() {
		return rcRecord_2_3;
	}
	public void setRcRecord_2_3(String rcRecord_2_3) {
		this.rcRecord_2_3 = rcRecord_2_3;
	}
	public String getRcResult_2_4_1() {
		return rcResult_2_4_1;
	}
	public void setRcResult_2_4_1(String rcResult_2_4_1) {
		this.rcResult_2_4_1 = rcResult_2_4_1;
	}
	public String getRcRecord_2_4_1() {
		return rcRecord_2_4_1;
	}
	public void setRcRecord_2_4_1(String rcRecord_2_4_1) {
		this.rcRecord_2_4_1 = rcRecord_2_4_1;
	}
	public String getRcResult_2_4_2() {
		return rcResult_2_4_2;
	}
	public void setRcResult_2_4_2(String rcResult_2_4_2) {
		this.rcResult_2_4_2 = rcResult_2_4_2;
	}
	public String getRcRecord_2_4_2() {
		return rcRecord_2_4_2;
	}
	public void setRcRecord_2_4_2(String rcRecord_2_4_2) {
		this.rcRecord_2_4_2 = rcRecord_2_4_2;
	}
	public String getRcResult_2_5() {
		return rcResult_2_5;
	}
	public void setRcResult_2_5(String rcResult_2_5) {
		this.rcResult_2_5 = rcResult_2_5;
	}
	public String getRcRecord_2_5() {
		return rcRecord_2_5;
	}
	public void setRcRecord_2_5(String rcRecord_2_5) {
		this.rcRecord_2_5 = rcRecord_2_5;
	}
	public String getRcResult_2_6() {
		return rcResult_2_6;
	}
	public void setRcResult_2_6(String rcResult_2_6) {
		this.rcResult_2_6 = rcResult_2_6;
	}
	public String getRcRecord_2_6() {
		return rcRecord_2_6;
	}
	public void setRcRecord_2_6(String rcRecord_2_6) {
		this.rcRecord_2_6 = rcRecord_2_6;
	}
	public String getRcResult_3_1() {
		return rcResult_3_1;
	}
	public void setRcResult_3_1(String rcResult_3_1) {
		this.rcResult_3_1 = rcResult_3_1;
	}
	public String getRcRecord_3_1() {
		return rcRecord_3_1;
	}
	public void setRcRecord_3_1(String rcRecord_3_1) {
		this.rcRecord_3_1 = rcRecord_3_1;
	}
	public String getRcResult_4_2() {
		return rcResult_4_2;
	}
	public void setRcResult_4_2(String rcResult_4_2) {
		this.rcResult_4_2 = rcResult_4_2;
	}
	public String getRcRecord_4_2() {
		return rcRecord_4_2;
	}
	public void setRcRecord_4_2(String rcRecord_4_2) {
		this.rcRecord_4_2 = rcRecord_4_2;
	}
	public String getRcResult_4_3() {
		return rcResult_4_3;
	}
	public void setRcResult_4_3(String rcResult_4_3) {
		this.rcResult_4_3 = rcResult_4_3;
	}
	public String getRcRecord_4_3() {
		return rcRecord_4_3;
	}
	public void setRcRecord_4_3(String rcRecord_4_3) {
		this.rcRecord_4_3 = rcRecord_4_3;
	}
	public String getRcResult_5_1() {
		return rcResult_5_1;
	}
	public void setRcResult_5_1(String rcResult_5_1) {
		this.rcResult_5_1 = rcResult_5_1;
	}
	public String getRcRecord_5_1() {
		return rcRecord_5_1;
	}
	public void setRcRecord_5_1(String rcRecord_5_1) {
		this.rcRecord_5_1 = rcRecord_5_1;
	}
	public String getRcResult_6_1() {
		return rcResult_6_1;
	}
	public void setRcResult_6_1(String rcResult_6_1) {
		this.rcResult_6_1 = rcResult_6_1;
	}
	public String getRcRecord_6_1() {
		return rcRecord_6_1;
	}
	public void setRcRecord_6_1(String rcRecord_6_1) {
		this.rcRecord_6_1 = rcRecord_6_1;
	}
	public String getRcResult_7_1() {
		return rcResult_7_1;
	}
	public void setRcResult_7_1(String rcResult_7_1) {
		this.rcResult_7_1 = rcResult_7_1;
	}
	public String getRcRecord_7_1() {
		return rcRecord_7_1;
	}
	public void setRcRecord_7_1(String rcRecord_7_1) {
		this.rcRecord_7_1 = rcRecord_7_1;
	}
	public String getQcResult_1_1() {
		return qcResult_1_1;
	}
	public void setQcResult_1_1(String qcResult_1_1) {
		this.qcResult_1_1 = qcResult_1_1;
	}
	public String getQcRecord_1_1() {
		return qcRecord_1_1;
	}
	public void setQcRecord_1_1(String qcRecord_1_1) {
		this.qcRecord_1_1 = qcRecord_1_1;
	}
	public String getQcResult_1_2() {
		return qcResult_1_2;
	}
	public void setQcResult_1_2(String qcResult_1_2) {
		this.qcResult_1_2 = qcResult_1_2;
	}
	public String getQcRecord_1_2() {
		return qcRecord_1_2;
	}
	public void setQcRecord_1_2(String qcRecord_1_2) {
		this.qcRecord_1_2 = qcRecord_1_2;
	}
	public String getQcResult_2_1() {
		return qcResult_2_1;
	}
	public void setQcResult_2_1(String qcResult_2_1) {
		this.qcResult_2_1 = qcResult_2_1;
	}
	public String getQcRecord_2_1() {
		return qcRecord_2_1;
	}
	public void setQcRecord_2_1(String qcRecord_2_1) {
		this.qcRecord_2_1 = qcRecord_2_1;
	}
	public String getQcResult_2_2() {
		return qcResult_2_2;
	}
	public void setQcResult_2_2(String qcResult_2_2) {
		this.qcResult_2_2 = qcResult_2_2;
	}
	public String getQcRecord_2_2() {
		return qcRecord_2_2;
	}
	public void setQcRecord_2_2(String qcRecord_2_2) {
		this.qcRecord_2_2 = qcRecord_2_2;
	}
	public String getQcResult_2_3() {
		return qcResult_2_3;
	}
	public void setQcResult_2_3(String qcResult_2_3) {
		this.qcResult_2_3 = qcResult_2_3;
	}
	public String getQcRecord_2_3() {
		return qcRecord_2_3;
	}
	public void setQcRecord_2_3(String qcRecord_2_3) {
		this.qcRecord_2_3 = qcRecord_2_3;
	}
	public String getQcResult_2_4() {
		return qcResult_2_4;
	}
	public void setQcResult_2_4(String qcResult_2_4) {
		this.qcResult_2_4 = qcResult_2_4;
	}
	public String getQcRecord_2_4() {
		return qcRecord_2_4;
	}
	public void setQcRecord_2_4(String qcRecord_2_4) {
		this.qcRecord_2_4 = qcRecord_2_4;
	}
	public String getQcResult_3_1() {
		return qcResult_3_1;
	}
	public void setQcResult_3_1(String qcResult_3_1) {
		this.qcResult_3_1 = qcResult_3_1;
	}
	public String getQcRecord_3_1() {
		return qcRecord_3_1;
	}
	public void setQcRecord_3_1(String qcRecord_3_1) {
		this.qcRecord_3_1 = qcRecord_3_1;
	}
	public String getQcResult_3_2() {
		return qcResult_3_2;
	}
	public void setQcResult_3_2(String qcResult_3_2) {
		this.qcResult_3_2 = qcResult_3_2;
	}
	public String getQcRecord_3_2() {
		return qcRecord_3_2;
	}
	public void setQcRecord_3_2(String qcRecord_3_2) {
		this.qcRecord_3_2 = qcRecord_3_2;
	}
	public String getQcResult_4_1() {
		return qcResult_4_1;
	}
	public void setQcResult_4_1(String qcResult_4_1) {
		this.qcResult_4_1 = qcResult_4_1;
	}
	public String getQcRecord_4_1() {
		return qcRecord_4_1;
	}
	public void setQcRecord_4_1(String qcRecord_4_1) {
		this.qcRecord_4_1 = qcRecord_4_1;
	}
	public String getQcResult_5_1() {
		return qcResult_5_1;
	}
	public void setQcResult_5_1(String qcResult_5_1) {
		this.qcResult_5_1 = qcResult_5_1;
	}
	public String getQcRecord_5_1() {
		return qcRecord_5_1;
	}
	public void setQcRecord_5_1(String qcRecord_5_1) {
		this.qcRecord_5_1 = qcRecord_5_1;
	}
	public String getQcResult_5_2() {
		return qcResult_5_2;
	}
	public void setQcResult_5_2(String qcResult_5_2) {
		this.qcResult_5_2 = qcResult_5_2;
	}
	public String getQcRecord_5_2() {
		return qcRecord_5_2;
	}
	public void setQcRecord_5_2(String qcRecord_5_2) {
		this.qcRecord_5_2 = qcRecord_5_2;
	}
	public String getQcResult_6_1() {
		return qcResult_6_1;
	}
	public void setQcResult_6_1(String qcResult_6_1) {
		this.qcResult_6_1 = qcResult_6_1;
	}
	public String getQcRecord_6_1() {
		return qcRecord_6_1;
	}
	public void setQcRecord_6_1(String qcRecord_6_1) {
		this.qcRecord_6_1 = qcRecord_6_1;
	}
	public String getQcResult_6_2() {
		return qcResult_6_2;
	}
	public void setQcResult_6_2(String qcResult_6_2) {
		this.qcResult_6_2 = qcResult_6_2;
	}
	public String getQcRecord_6_2() {
		return qcRecord_6_2;
	}
	public void setQcRecord_6_2(String qcRecord_6_2) {
		this.qcRecord_6_2 = qcRecord_6_2;
	}
	public String getQcResult_7_1() {
		return qcResult_7_1;
	}
	public void setQcResult_7_1(String qcResult_7_1) {
		this.qcResult_7_1 = qcResult_7_1;
	}
	public String getQcRecord_7_1() {
		return qcRecord_7_1;
	}
	public void setQcRecord_7_1(String qcRecord_7_1) {
		this.qcRecord_7_1 = qcRecord_7_1;
	}
	public String getQcResult_8_1() {
		return qcResult_8_1;
	}
	public void setQcResult_8_1(String qcResult_8_1) {
		this.qcResult_8_1 = qcResult_8_1;
	}
	public String getQcRecord_8_1() {
		return qcRecord_8_1;
	}
	public void setQcRecord_8_1(String qcRecord_8_1) {
		this.qcRecord_8_1 = qcRecord_8_1;
	}
	public String getQcResult_9_1() {
		return qcResult_9_1;
	}
	public void setQcResult_9_1(String qcResult_9_1) {
		this.qcResult_9_1 = qcResult_9_1;
	}
	public String getQcRecord_9_1() {
		return qcRecord_9_1;
	}
	public void setQcRecord_9_1(String qcRecord_9_1) {
		this.qcRecord_9_1 = qcRecord_9_1;
	}
	public String getQcResult_10_1() {
		return qcResult_10_1;
	}
	public void setQcResult_10_1(String qcResult_10_1) {
		this.qcResult_10_1 = qcResult_10_1;
	}
	public String getQcRecord_10_1() {
		return qcRecord_10_1;
	}
	public void setQcRecord_10_1(String qcRecord_10_1) {
		this.qcRecord_10_1 = qcRecord_10_1;
	}
	public String getQcResult_11_1() {
		return qcResult_11_1;
	}
	public void setQcResult_11_1(String qcResult_11_1) {
		this.qcResult_11_1 = qcResult_11_1;
	}
	public String getQcRecord_11_1() {
		return qcRecord_11_1;
	}
	public void setQcRecord_11_1(String qcRecord_11_1) {
		this.qcRecord_11_1 = qcRecord_11_1;
	}
	public String getQcResult_12_1() {
		return qcResult_12_1;
	}
	public void setQcResult_12_1(String qcResult_12_1) {
		this.qcResult_12_1 = qcResult_12_1;
	}
	public String getQcRecord_12_1() {
		return qcRecord_12_1;
	}
	public void setQcRecord_12_1(String qcRecord_12_1) {
		this.qcRecord_12_1 = qcRecord_12_1;
	}
	public String getQcProblem() {
		return qcProblem;
	}
	public void setQcProblem(String qcProblem) {
		this.qcProblem = qcProblem;
	}
	public String getQcChecker() {
		return qcChecker;
	}
	public void setQcChecker(String qcChecker) {
		this.qcChecker = qcChecker;
	}
	public String getQcCheckDate() {
		return qcCheckDate;
	}
	public void setQcCheckDate(String qcCheckDate) {
		this.qcCheckDate = qcCheckDate;
	}
	public String getTeCorpnName() {
		return teCorpnName;
	}
	public void setTeCorpnName(String teCorpnName) {
		this.teCorpnName = teCorpnName;
	}
	public String getTeType() {
		return teType;
	}
	public void setTeType(String teType) {
		this.teType = teType;
	}
	public String getTeNo() {
		return teNo;
	}
	public void setTeNo(String teNo) {
		this.teNo = teNo;
	}
	public String getTespeed() {
		return tespeed;
	}
	public void setTespeed(String tespeed) {
		this.tespeed = tespeed;
	}
	public String getTeLoad() {
		return teLoad;
	}
	public void setTeLoad(String teLoad) {
		this.teLoad = teLoad;
	}
	public String getTeResult_1_1() {
		return teResult_1_1;
	}
	public void setTeResult_1_1(String teResult_1_1) {
		this.teResult_1_1 = teResult_1_1;
	}
	public String getTeResult_1_2() {
		return teResult_1_2;
	}
	public void setTeResult_1_2(String teResult_1_2) {
		this.teResult_1_2 = teResult_1_2;
	}
	public String getTeResult_1_3() {
		return teResult_1_3;
	}
	public void setTeResult_1_3(String teResult_1_3) {
		this.teResult_1_3 = teResult_1_3;
	}
	public String getTeResult_1_4() {
		return teResult_1_4;
	}
	public void setTeResult_1_4(String teResult_1_4) {
		this.teResult_1_4 = teResult_1_4;
	}
	public String getTeResult_2_1() {
		return teResult_2_1;
	}
	public void setTeResult_2_1(String teResult_2_1) {
		this.teResult_2_1 = teResult_2_1;
	}
	public String getTeResult_2_2() {
		return teResult_2_2;
	}
	public void setTeResult_2_2(String teResult_2_2) {
		this.teResult_2_2 = teResult_2_2;
	}
	public String getTeResult_2_3() {
		return teResult_2_3;
	}
	public void setTeResult_2_3(String teResult_2_3) {
		this.teResult_2_3 = teResult_2_3;
	}
	public String getTeResult_2_4() {
		return teResult_2_4;
	}
	public void setTeResult_2_4(String teResult_2_4) {
		this.teResult_2_4 = teResult_2_4;
	}
	public String getTeResult_2_5() {
		return teResult_2_5;
	}
	public void setTeResult_2_5(String teResult_2_5) {
		this.teResult_2_5 = teResult_2_5;
	}
	public String getTeResult_2_6() {
		return teResult_2_6;
	}
	public void setTeResult_2_6(String teResult_2_6) {
		this.teResult_2_6 = teResult_2_6;
	}
	public String getTeResult_3_1() {
		return teResult_3_1;
	}
	public void setTeResult_3_1(String teResult_3_1) {
		this.teResult_3_1 = teResult_3_1;
	}
	public String getTeResult_3_2() {
		return teResult_3_2;
	}
	public void setTeResult_3_2(String teResult_3_2) {
		this.teResult_3_2 = teResult_3_2;
	}
	public String getTeResult_3_3() {
		return teResult_3_3;
	}
	public void setTeResult_3_3(String teResult_3_3) {
		this.teResult_3_3 = teResult_3_3;
	}
	public String getTeResult_3_4() {
		return teResult_3_4;
	}
	public void setTeResult_3_4(String teResult_3_4) {
		this.teResult_3_4 = teResult_3_4;
	}
	public String getTeResult_3_5() {
		return teResult_3_5;
	}
	public void setTeResult_3_5(String teResult_3_5) {
		this.teResult_3_5 = teResult_3_5;
	}
	public String getTeResult_3_6() {
		return teResult_3_6;
	}
	public void setTeResult_3_6(String teResult_3_6) {
		this.teResult_3_6 = teResult_3_6;
	}
	public String getTeResult_3_7() {
		return teResult_3_7;
	}
	public void setTeResult_3_7(String teResult_3_7) {
		this.teResult_3_7 = teResult_3_7;
	}
	public String getTeResult_3_8() {
		return teResult_3_8;
	}
	public void setTeResult_3_8(String teResult_3_8) {
		this.teResult_3_8 = teResult_3_8;
	}
	public String getTeResult_3_9() {
		return teResult_3_9;
	}
	public void setTeResult_3_9(String teResult_3_9) {
		this.teResult_3_9 = teResult_3_9;
	}
	public String getTeResult_3_10() {
		return teResult_3_10;
	}
	public void setTeResult_3_10(String teResult_3_10) {
		this.teResult_3_10 = teResult_3_10;
	}
	public String getTeResult_3_11() {
		return teResult_3_11;
	}
	public void setTeResult_3_11(String teResult_3_11) {
		this.teResult_3_11 = teResult_3_11;
	}
	public String getTeResult_3_12() {
		return teResult_3_12;
	}
	public void setTeResult_3_12(String teResult_3_12) {
		this.teResult_3_12 = teResult_3_12;
	}
	public String getTeResult_3_13() {
		return teResult_3_13;
	}
	public void setTeResult_3_13(String teResult_3_13) {
		this.teResult_3_13 = teResult_3_13;
	}
	public String getTeResult_3_14() {
		return teResult_3_14;
	}
	public void setTeResult_3_14(String teResult_3_14) {
		this.teResult_3_14 = teResult_3_14;
	}
	public String getTeResult_3_15() {
		return teResult_3_15;
	}
	public void setTeResult_3_15(String teResult_3_15) {
		this.teResult_3_15 = teResult_3_15;
	}
	public String getTeResult_3_16() {
		return teResult_3_16;
	}
	public void setTeResult_3_16(String teResult_3_16) {
		this.teResult_3_16 = teResult_3_16;
	}
	public String getTeProblem() {
		return teProblem;
	}
	public void setTeProblem(String teProblem) {
		this.teProblem = teProblem;
	}
	public String getTeChecker() {
		return teChecker;
	}
	public void setTeChecker(String teChecker) {
		this.teChecker = teChecker;
	}
	public String getTeCheckDate() {
		return teCheckDate;
	}
	public void setTeCheckDate(String teCheckDate) {
		this.teCheckDate = teCheckDate;
	}
	public String getEsCorpnName() {
		return esCorpnName;
	}
	public void setEsCorpnName(String esCorpnName) {
		this.esCorpnName = esCorpnName;
	}
	public String getEsType() {
		return esType;
	}
	public void setEsType(String esType) {
		this.esType = esType;
	}
	public String getEsNo() {
		return esNo;
	}
	public void setEsNo(String esNo) {
		this.esNo = esNo;
	}
	public String getEsSpeed() {
		return esSpeed;
	}
	public void setEsSpeed(String esSpeed) {
		this.esSpeed = esSpeed;
	}
	public String getEsHigh() {
		return esHigh;
	}
	public void setEsHigh(String esHigh) {
		this.esHigh = esHigh;
	}
	public String getEsResult_1_1() {
		return esResult_1_1;
	}
	public void setEsResult_1_1(String esResult_1_1) {
		this.esResult_1_1 = esResult_1_1;
	}
	public String getEsResult_1_2() {
		return esResult_1_2;
	}
	public void setEsResult_1_2(String esResult_1_2) {
		this.esResult_1_2 = esResult_1_2;
	}
	public String getEsResult_1_3() {
		return esResult_1_3;
	}
	public void setEsResult_1_3(String esResult_1_3) {
		this.esResult_1_3 = esResult_1_3;
	}
	public String getEsResult_2_1() {
		return esResult_2_1;
	}
	public void setEsResult_2_1(String esResult_2_1) {
		this.esResult_2_1 = esResult_2_1;
	}
	public String getEsResult_2_2() {
		return esResult_2_2;
	}
	public void setEsResult_2_2(String esResult_2_2) {
		this.esResult_2_2 = esResult_2_2;
	}
	public String getEsResult_2_3() {
		return esResult_2_3;
	}
	public void setEsResult_2_3(String esResult_2_3) {
		this.esResult_2_3 = esResult_2_3;
	}
	public String getEsResult_3_1() {
		return esResult_3_1;
	}
	public void setEsResult_3_1(String esResult_3_1) {
		this.esResult_3_1 = esResult_3_1;
	}
	public String getEsResult_3_2() {
		return esResult_3_2;
	}
	public void setEsResult_3_2(String esResult_3_2) {
		this.esResult_3_2 = esResult_3_2;
	}
	public String getEsResult_3_3() {
		return esResult_3_3;
	}
	public void setEsResult_3_3(String esResult_3_3) {
		this.esResult_3_3 = esResult_3_3;
	}
	public String getEsResult_3_4() {
		return esResult_3_4;
	}
	public void setEsResult_3_4(String esResult_3_4) {
		this.esResult_3_4 = esResult_3_4;
	}
	public String getEsResult_3_5() {
		return esResult_3_5;
	}
	public void setEsResult_3_5(String esResult_3_5) {
		this.esResult_3_5 = esResult_3_5;
	}
	public String getEsResult_3_6() {
		return esResult_3_6;
	}
	public void setEsResult_3_6(String esResult_3_6) {
		this.esResult_3_6 = esResult_3_6;
	}
	public String getEsResult_3_7() {
		return esResult_3_7;
	}
	public void setEsResult_3_7(String esResult_3_7) {
		this.esResult_3_7 = esResult_3_7;
	}
	public String getEsResult_3_8() {
		return esResult_3_8;
	}
	public void setEsResult_3_8(String esResult_3_8) {
		this.esResult_3_8 = esResult_3_8;
	}
	public String getEsResult_3_9() {
		return esResult_3_9;
	}
	public void setEsResult_3_9(String esResult_3_9) {
		this.esResult_3_9 = esResult_3_9;
	}
	public String getEsResult_3_10() {
		return esResult_3_10;
	}
	public void setEsResult_3_10(String esResult_3_10) {
		this.esResult_3_10 = esResult_3_10;
	}
	public String getEsResult_3_11() {
		return esResult_3_11;
	}
	public void setEsResult_3_11(String esResult_3_11) {
		this.esResult_3_11 = esResult_3_11;
	}
	public String getEsResult_3_12() {
		return esResult_3_12;
	}
	public void setEsResult_3_12(String esResult_3_12) {
		this.esResult_3_12 = esResult_3_12;
	}
	public String getEsResult_3_13() {
		return esResult_3_13;
	}
	public void setEsResult_3_13(String esResult_3_13) {
		this.esResult_3_13 = esResult_3_13;
	}
	public String getEsResult_3_14() {
		return esResult_3_14;
	}
	public void setEsResult_3_14(String esResult_3_14) {
		this.esResult_3_14 = esResult_3_14;
	}
	public String getEsResult_3_15() {
		return esResult_3_15;
	}
	public void setEsResult_3_15(String esResult_3_15) {
		this.esResult_3_15 = esResult_3_15;
	}
	public String getEsProblem() {
		return esProblem;
	}
	public void setEsProblem(String esProblem) {
		this.esProblem = esProblem;
	}
	public String getEsChecker() {
		return esChecker;
	}
	public void setEsChecker(String esChecker) {
		this.esChecker = esChecker;
	}
	public String getEsCheckDate() {
		return esCheckDate;
	}
	public void setEsCheckDate(String esCheckDate) {
		this.esCheckDate = esCheckDate;
	}

}