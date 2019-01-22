package cn.mldn.microcloud.dao;

import java.util.List;

import cn.mldn.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDeptDAO {
    public boolean doCreate(Dept vo);
    public Dept findById(Long id);
    public List<Dept>findAll();
}
