package cn.mldn.vo;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Dept implements Serializable {

  private Long deptno;
  private String dname;
  private String loc;//数据库的名字

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
