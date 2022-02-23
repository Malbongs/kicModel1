package model;

import java.sql.Date;

public class Board {
	
	private int num;
	private String boardid;
	private String pass;
	private String subject;
	private String content;
	private String file1;
	private Date regdate;
	private int readcnt;
	private int ref;
	private int reflevel;
	private int refstep;
	private String ip;
	private String writer;
	public Board() {
		
	}
	
	public Board(int num, String boardid, String pass, String subject, String content, String file1, Date regdate,
			int readcnt, int ref, int reflevel, int refstep, String ip, String writer) {
		super();
		this.num = num;
		this.boardid = boardid;
		this.pass = pass;
		this.subject = subject;
		this.content = content;
		this.file1 = file1;
		this.regdate = regdate;
		this.readcnt = readcnt;
		this.ref = ref;
		this.reflevel = reflevel;
		this.refstep = refstep;
		this.ip = ip;
		this.writer = writer;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getBoardid() {
		return boardid;
	}


	public void setBoardid(String boardid) {
		this.boardid = boardid;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getFile1() {
		return file1;
	}


	public void setFile1(String file1) {
		this.file1 = file1;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	public int getReadcnt() {
		return readcnt;
	}


	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}


	public int getRef() {
		return ref;
	}


	public void setRef(int ref) {
		this.ref = ref;
	}


	public int getReflevel() {
		return reflevel;
	}


	public void setReflevel(int reflevel) {
		this.reflevel = reflevel;
	}


	public int getRefstep() {
		return refstep;
	}


	public void setRefstep(int refstep) {
		this.refstep = refstep;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	@Override
	public String toString() {
		return "Board [num=" + num + ", boardid=" + boardid + ", pass=" + pass + ", subject=" + subject + ", content="
				+ content + ", file1=" + file1 + ", readate=" + regdate + ", readcnt=" + readcnt + ", ref=" + ref
				+ ", reflevel=" + reflevel + ", refstep=" + refstep + ", ip=" + ip + ", writer=" + writer + "]";
	}
	
	


}
	
	
	
	
	
	
	
	


	
	

