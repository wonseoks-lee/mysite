package com.poscoict.mysite.vo;

public class BoardVo {
	private Long no;
	private String title;
	private String contents;
	private Integer hit;
	private Integer groupNo;
	private Integer orderNo;
	private Integer depth;
	private String regDate;
	private Long userNo;
	private String userName;
	private Integer totalCount;
	
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", contents=" + contents + ", hit=" + hit + ", groupNo="
				+ groupNo + ", orderNo=" + orderNo + ", depth=" + depth + ", regDate=" + regDate + ", userNo=" + userNo
				+ ", userName=" + userName + "]";
	}
	public Integer gettotalCount() {
		return totalCount;
	}
	public void settotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Integer getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Integer getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(int groupNo) {
		this.groupNo = groupNo;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
