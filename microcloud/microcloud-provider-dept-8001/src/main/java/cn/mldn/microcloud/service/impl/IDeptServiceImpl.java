package cn.mldn.microcloud.service.impl;

import cn.mldn.microcloud.dao.IDeptDAO;
import cn.mldn.microcloud.service.IDeptService;
import cn.mldn.vo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class IDeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDAO iDeptDAO;
    @Override
    public Dept get(long id) {
        return iDeptDAO.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return iDeptDAO.doCreate(dept);
    }

    @Override
    public List<Dept> list() {
        return iDeptDAO.findAll();
    }
}
