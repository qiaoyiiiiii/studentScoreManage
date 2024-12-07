package com.qiaoyi.student.Service.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiaoyi.student.Entity.Accounts;
import com.qiaoyi.student.Mapper.AccountsMapper;
import com.qiaoyi.student.Service.AccountsService;
import jakarta.annotation.Resource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class AccountsServiceImpl extends ServiceImpl<AccountsMapper, Accounts> implements AccountsService {
    @Resource
    JavaMailSender sender;

    public void sendEmail(String to, String subject, String text) {
        try{
            //SimpleMailMessage是一个比较简易的邮件封装，支持设置一些比较简单内容
            SimpleMailMessage message = new SimpleMailMessage();
            //设置邮件标题
            message.setSubject(subject);
            //设置邮件内容
            message.setText(text);
            //设置邮件发送给谁，可以多个，这里就发给你的QQ邮箱
            message.setFrom("greatqiaoyi@163.com");
            //邮件发送者，这里要与配置文件中的保持一致
            message.setTo(to);
            //OK，万事俱备只欠发送
            System.out.println(sender);
            sender.send(message);
        }catch (MailException e) {
            // 处理邮件发送失败的情况
            System.err.println("邮件发送失败: " + e.getMessage());
        }
    }
}
