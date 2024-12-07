package com.qiaoyi.student.Service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiaoyi.student.Entity.Menu;
import com.qiaoyi.student.Mapper.MenuMapper;
import com.qiaoyi.student.Service.MenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper,Menu> implements MenuService {


}
