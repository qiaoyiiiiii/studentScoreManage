package com.qiaoyi.student.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.micrometer.common.util.StringUtils;
import com.qiaoyi.student.Service.AccountsService;
import com.qiaoyi.student.Utils.Result;
import jakarta.annotation.Resource;
import com.qiaoyi.student.Entity.Accounts;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.regex.Pattern;


@RequestMapping("/accounts")
@RestController
public class AccountsController {
    @Resource
    private AccountsService accountsService;

    @DeleteMapping("/delete")
    public Result delete(@RequestBody String userId) {
        Boolean res=accountsService.removeById(userId);
        return res?Result.success():Result.fail();
    }

    @PostMapping("/login")
    public Result login(@RequestBody Accounts accounts) {
        String userId=(String) accounts.getUser_id();
        String password=(String) accounts.getPassword();

        LambdaQueryWrapper<Accounts> queryWrapper = new LambdaQueryWrapper<>();
        if(StringUtils.isNotBlank(userId)&&StringUtils.isNotBlank(password)) {
            queryWrapper.eq(Accounts::getUser_id, userId);
            queryWrapper.eq(Accounts::getPassword, password);
        }
        if(accountsService.getOne(queryWrapper)!=null){
            Accounts user= userService.getOne(queryWrapper);
            List<Menu> list = menuService.lambdaQuery().like(Menu::getMenuRight, user1.getRoleId()).list();
            HashMap res=new HashMap();
            res.put("user",user);
            res.put("list",list);
            return Result.success(res);
        }
        return Result.fail();
    }


        @PostMapping("/sendEmail")
        public Result sendEmail(String to) {
            if(!Pattern.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}",to)){
                return Result.fail();
            }
                Random rand = new Random();
                int code=rand.nextInt(900000)+100000;

                String subject = "【学生成绩管理系统】验证码";
                String text = "<h1>验证码：</h1><p>"+code+",验证码保持五分钟有效</p>";
                accountsService.sendEmail(to, subject, text);
                return Result.success();
        }


    @PostMapping("/register")
    public Result save(@RequestBody Accounts accounts) {
        String userId=(String) accounts.getUser_id();
        String password=(String) accounts.getPassword();

        if(Pattern.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}", userId)&&
        Pattern.matches("^[a-zA-Z0-9]{6,12}$", password)) {
            accountsService.save(accounts);
            return  Result.success(userId);
        }

        return Result.fail();
    }
}
